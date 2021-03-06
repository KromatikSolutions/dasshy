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
package com.kromatik.dasshy.server.rest;

import com.kromatik.dasshy.server.service.PolicyService;
import com.kromatik.dasshy.thrift.model.TPolicy;
import com.kromatik.dasshy.thrift.model.TPolicyList;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * REST Api for policy management
 */
@Path("/policy")
public class PolicyRestApi extends AbstractRestApi
{
	/** policy service */
	private final PolicyService policyService;

	/**
	 * Default constructor
	 *
	 * @param service service
	 */
	public PolicyRestApi(final PolicyService service)
	{
		this.policyService = service;
	}

	/**
	 * Creates a policy
	 *
	 * @param policy policy to be created
	 * @return created policy
	 */
	@POST
	public Response createPolicy(final TPolicy policy)
	{
		final TPolicy savedPolicy = policyService.createPolicy(policy);
		return Response.ok().entity(savedPolicy).build();
	}

	/**
	 * Updates an existing policy
	 *
	 * @param policy policy to be updated
	 * @return updated policy
	 */
	@PUT
	public Response updatePolicy(final TPolicy policy)
	{
		final TPolicy updatedPolicy = policyService.updatePolicy(policy);
		return Response.ok().entity(updatedPolicy).build();
	}

	/**
	 * Gets policy by id
	 *
	 * @param policyId id of the policy
	 * @return policy
	 */
	@GET
	@Path("/{id:(\\S*)}")
	public TPolicy getPolicy(
					@PathParam("id")
					final String policyId)
	{
		return policyService.getPolicy(policyId);
	}

	/**
	 * Lists a policies
	 *
	 * @return list of policies
	 */
	@GET
	public TPolicyList getAllPolicies()
	{
		return policyService.listPolicies();
	}

	/**
	 * Deletes a policy
	 *
	 * @param policyId id of the policy
	 * @return response status
	 */
	@DELETE
	@Path("/{id:(\\S*)}")
	public Response deletePolicy(
					@PathParam("id")
					final String policyId)
	{
		policyService.deletePolicy(policyId);
		return Response.ok().build();
	}
}
