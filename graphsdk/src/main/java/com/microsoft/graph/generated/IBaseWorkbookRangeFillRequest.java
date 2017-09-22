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
 * The interface for the Base Workbook Range Fill Request.
 */
public interface IBaseWorkbookRangeFillRequest extends IHttpRequest {

    /**
     * Gets the WorkbookRangeFill from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<WorkbookRangeFill> callback);

    /**
     * Gets the WorkbookRangeFill from the service
     * @return The WorkbookRangeFill from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookRangeFill get() throws ClientException;

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WorkbookRangeFill with a source
     * @param sourceWorkbookRangeFill The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final WorkbookRangeFill sourceWorkbookRangeFill, final ICallback<WorkbookRangeFill> callback);

    /**
     * Patches this WorkbookRangeFill with a source
     * @param sourceWorkbookRangeFill The source object with updates
     * @return The updated WorkbookRangeFill
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookRangeFill patch(final WorkbookRangeFill sourceWorkbookRangeFill) throws ClientException;

    /**
     * Posts a WorkbookRangeFill with a new object
     * @param newWorkbookRangeFill The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final WorkbookRangeFill newWorkbookRangeFill, final ICallback<WorkbookRangeFill> callback);

    /**
     * Posts a WorkbookRangeFill with a new object
     * @param newWorkbookRangeFill The new object to create
     * @return The created WorkbookRangeFill
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookRangeFill post(final WorkbookRangeFill newWorkbookRangeFill) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseWorkbookRangeFillRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseWorkbookRangeFillRequest expand(final String value);

}

