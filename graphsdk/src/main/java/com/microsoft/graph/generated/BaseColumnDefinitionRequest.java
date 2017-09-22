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
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Column Definition Request.
 */
public class BaseColumnDefinitionRequest extends BaseRequest implements IBaseColumnDefinitionRequest {

    /**
     * The request for the ColumnDefinition
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseColumnDefinitionRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the ColumnDefinition from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<ColumnDefinition> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ColumnDefinition from the service
     * @return The ColumnDefinition from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public ColumnDefinition get() throws ClientException {
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
     * Patches this ColumnDefinition with a source
     * @param sourceColumnDefinition The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final ColumnDefinition sourceColumnDefinition, final ICallback<ColumnDefinition> callback) {
        send(HttpMethod.PATCH, callback, sourceColumnDefinition);
    }

    /**
     * Patches this ColumnDefinition with a source
     * @param sourceColumnDefinition The source object with updates
     * @return The updated ColumnDefinition
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public ColumnDefinition patch(final ColumnDefinition sourceColumnDefinition) throws ClientException {
        return send(HttpMethod.PATCH, sourceColumnDefinition);
    }

    /**
     * Creates a ColumnDefinition with a new object
     * @param newColumnDefinition The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final ColumnDefinition newColumnDefinition, final ICallback<ColumnDefinition> callback) {
        send(HttpMethod.POST, callback, newColumnDefinition);
    }

    /**
     * Creates a ColumnDefinition with a new object
     * @param newColumnDefinition The new object to create
     * @return The created ColumnDefinition
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public ColumnDefinition post(final ColumnDefinition newColumnDefinition) throws ClientException {
        return send(HttpMethod.POST, newColumnDefinition);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IColumnDefinitionRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (ColumnDefinitionRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IColumnDefinitionRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (ColumnDefinitionRequest)this;
     }

}

