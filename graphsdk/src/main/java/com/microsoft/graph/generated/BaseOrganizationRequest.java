// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.List;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Organization Request.
 */
public class BaseOrganizationRequest extends DirectoryObjectRequest implements IBaseOrganizationRequest {

    /**
     * The request for the Organization
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseOrganizationRequest(final String requestUrl,
            final IBaseClient client,
            final List<Option> options,
            final Class responseClass) {
        super(requestUrl, client, options, responseClass);
    }

    /**
     * Gets the Organization from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<Organization> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Organization from the service
     * @return The Organization from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Organization get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this Organization with a source
     * @param sourceOrganization The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final Organization sourceOrganization, final ICallback<Organization> callback) {
        send(HttpMethod.PATCH, callback, sourceOrganization);
    }

    /**
     * Patches this Organization with a source
     * @param sourceOrganization The source object with updates
     * @return The updated Organization
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Organization patch(final Organization sourceOrganization) throws ClientException {
        return send(HttpMethod.PATCH, sourceOrganization);
    }

    /**
     * Creates a Organization with a new object
     * @param newOrganization The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final Organization newOrganization, final ICallback<Organization> callback) {
        send(HttpMethod.POST, callback, newOrganization);
    }

    /**
     * Creates a Organization with a new object
     * @param newOrganization The new object to create
     * @return The created Organization
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Organization post(final Organization newOrganization) throws ClientException {
        return send(HttpMethod.POST, newOrganization);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IOrganizationRequest select(final String value) {
         getQueryOptions().add(new QueryOption("select", value));
         return (OrganizationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IOrganizationRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("expand", value));
         return (OrganizationRequest)this;
     }
}
