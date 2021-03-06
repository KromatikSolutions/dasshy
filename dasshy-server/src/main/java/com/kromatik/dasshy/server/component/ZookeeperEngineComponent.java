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
package com.kromatik.dasshy.server.component;

import com.kromatik.dasshy.core.engine.IEngineComponent;
import com.kromatik.dasshy.server.zookeeper.IZookeeperClientFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Engine component that manages zookeeper connections
 */
public class ZookeeperEngineComponent implements IEngineComponent
{

	private static final Logger LOGGER = LoggerFactory.getLogger(ZookeeperEngineComponent.class);

	/** factory for creating zookeeper client connections */
	private final IZookeeperClientFactory clientFactory;

	/**
	 * Default constructor
	 *
	 * @param factory zk client factory
	 */
	public ZookeeperEngineComponent(final IZookeeperClientFactory factory)
	{
		clientFactory = factory;
	}

	/**
	 * @see IEngineComponent#start()
	 */
	@Override
	public void start()
	{
		// no need to explicitly start the zookeeper connections, since they are lazily initialized
	}

	/**
	 * @see IEngineComponent#stop()
	 */
	@Override
	public void stop()
	{
		try
		{
			clientFactory.close();
		}
		catch (IOException e)
		{
			LOGGER.warn("Exception during closing of the zookeeper clients", e);
		}
	}
}
