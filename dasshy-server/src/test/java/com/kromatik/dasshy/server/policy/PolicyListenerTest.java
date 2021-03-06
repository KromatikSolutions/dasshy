/**
 * Dasshy - Real time and Batch Analytics Open Source System
 * Copyright (C) 2016 Kromatik Solutions (http://kromatiksolutions.com)
 *
 * This file is part of Dasshy
 *
 * Dasshy is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * Dasshy is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Affero General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Dasshy.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.kromatik.dasshy.server.policy;

import com.kromatik.dasshy.sdk.RuntimeContext;
import com.kromatik.dasshy.server.scheduler.JobListener;
import com.kromatik.dasshy.server.scheduler.JobScheduler;
import com.kromatik.dasshy.server.spark.PolicyJob;
import com.kromatik.dasshy.thrift.model.TPolicy;
import org.mockito.Mockito;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Tests for policy listeners
 */
@Test(groups = { "policy" })
public class PolicyListenerTest
{

	private PolicyListener policyListener;

	private RuntimeContext context;

	private PolicyFactory factory;

	private JobScheduler scheduler;

	private JobListener jobListener;

	@BeforeMethod
	public void setup() throws Exception
	{

		context = Mockito.mock(RuntimeContext.class);
		factory = Mockito.mock(PolicyFactory.class);
		scheduler = Mockito.mock(JobScheduler.class);
		jobListener = Mockito.mock(JobListener.class);

		policyListener = new JobsOnPolicyListener(context, factory, scheduler, jobListener);
	}

	public void onPolicySaveStartNewJob() throws Exception
	{
		String policyId = "id";
		TPolicy policyModel = new TPolicy();
		policyModel.setId(policyId);

		Policy policyInstance = new Policy();
		policyInstance.setModel(policyModel);

		Mockito.when(factory.buildPolicy(policyModel)).thenReturn(policyInstance);
		Mockito.when(scheduler.get(policyId)).thenReturn(null);
		Mockito.doNothing().when(scheduler).submit(Mockito.any(PolicyJob.class));
		Mockito.when(scheduler.stop(Mockito.any(String.class))).thenReturn(null);

		policyListener.onPolicySave(policyModel);

		Mockito.verify(scheduler).submit(Mockito.any(PolicyJob.class));
	}

	public void onPolicySaveRestartExistingJob() throws Exception
	{
		String policyId = "id_existing";
		TPolicy policyModel = new TPolicy();
		policyModel.setId(policyId);

		Policy policyInstance = new Policy();
		policyInstance.setModel(policyModel);

		PolicyJob job = new PolicyJob(policyInstance, context, jobListener);

		Mockito.when(factory.buildPolicy(policyModel)).thenReturn(policyInstance);
		Mockito.when(scheduler.get(policyId)).thenReturn(job);
		Mockito.doNothing().when(scheduler).submit(Mockito.any(PolicyJob.class));
		Mockito.when(scheduler.stop(Mockito.any(String.class))).thenReturn(null);

		policyListener.onPolicySave(policyModel);

		Mockito.verify(scheduler).stop(policyId);
		Mockito.verify(scheduler).submit(Mockito.any(PolicyJob.class));
	}

	public void onPolicyDeleteStopJob() throws Exception
	{
		String policyId = "id_delete";
		TPolicy policyModel = new TPolicy();
		policyModel.setId(policyId);

		Mockito.when(scheduler.stop(Mockito.any(String.class))).thenReturn(null);

		policyListener.onPolicyDelete(policyModel);

		Mockito.verify(scheduler).stop(policyId);
	}
}
