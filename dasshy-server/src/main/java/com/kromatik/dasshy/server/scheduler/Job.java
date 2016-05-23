package com.kromatik.dasshy.server.scheduler;

import com.kromatik.dasshy.server.event.JobEvent;
import com.kromatik.dasshy.thrift.model.TJobState;
import org.apache.commons.lang.exception.ExceptionUtils;

/**
 * Abstract job
 */
public abstract class Job
{
	/** job id */
	protected String			id;

	/** state of the job */
	protected TJobState			jobState;

	/** start time of this job */
	protected Long				startTime;

	/** end time of this job*/
	protected Long				endTime;

	/** job result */
	protected Object			jobResult;

	/** error */
	protected String			errorMessage;

	/** exception */
	protected Throwable			exception;

	/** listener that listens on job changes */
	protected JobListener		listener;

	/** whether job is aborted */
	protected boolean			aborted		=	false;

	/**
	 * Default constructor
	 *
	 * @param jobId job id
	 * @param jobListener listener
	 */
	public Job(final String jobId, final JobListener jobListener)
	{
		this.id = jobId;
		this.listener = jobListener;
	}

	/**
	 * Starts the job. This is the entry point of the job
	 */
	public void start()
	{
		try
		{
			startTime = System.currentTimeMillis();
			jobResult = run();
			endTime = System.currentTimeMillis();
		}
		catch (Throwable throwable)
		{
			this.exception = throwable;
			jobResult = throwable.getMessage();
			errorMessage = getStackTrace(throwable);
			setJobState(TJobState.ERROR);
		}
		finally
		{
			endTime = System.currentTimeMillis();
		}
	}

	/**
	 * Stops the job. This is the exit point of the job
	 */
	public void stop()
	{
		aborted = abort();
	}

	/**
	 * Pause the job
	 */
	public void pause()
	{
		throw new RuntimeException("Not all jobs support pausing");
	}

	/**
	 * Resume the job
	 */
	public void resume()
	{
		throw new RuntimeException("Not all jobs support resuming");
	}

	/**
	 * Run the job and get a result of it execution
	 *
	 * @return result of the job execution
	 */
	protected abstract Object run();

	/**
	 * Abort the job
	 *
	 * @return status of the abort
	 */
	protected abstract boolean abort();


	/**
	 * Fires an event
	 *
	 * @param event job event
	 */
	protected void fireEvent(final JobEvent event)
	{
		if (listener != null)
		{
			listener.onJobEvent(event);
		}
	}

	/**
	 * Sets the new job state
	 *
	 * @param jobState new job state
	 */
	public void setJobState(final TJobState jobState)
	{
		if (this.jobState == jobState)
		{
			return;
		}

		this.jobState = jobState;
		if (listener != null)
		{
			listener.onStateChange(this, this.jobState, jobState);
		}
	}

	/**
	 * Get job state
	 *
	 * @return job state
	 */
	public TJobState getJobState()
	{
		return jobState;
	}

	public JobListener getListener()
	{
		return listener;
	}

	public void setListener(final JobListener listener)
	{
		this.listener = listener;
	}

	/**
	 * Get stack trace as String
	 *
	 * @param e exception
	 *
	 * @return error message
	 */
	public static String getStackTrace(final Throwable e)
	{
		if (e == null)
		{
			return "";
		}

		Throwable cause = ExceptionUtils.getRootCause(e);
		return ExceptionUtils.getFullStackTrace(cause != null ? cause : e);
	}
}