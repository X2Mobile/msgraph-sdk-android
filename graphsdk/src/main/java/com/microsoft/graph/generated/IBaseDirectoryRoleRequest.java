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
 * The interface for the Base Directory Role Request.
 */
public interface IBaseDirectoryRoleRequest extends IDirectoryObjectRequest {

    /**
     * Gets the DirectoryRole from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<DirectoryRole> callback);

    /**
     * Gets the DirectoryRole from the service
     * @return The DirectoryRole from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    DirectoryRole get() throws ClientException;

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
     * Patches this DirectoryRole with a source
     * @param sourceDirectoryRole The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final DirectoryRole sourceDirectoryRole, final ICallback<DirectoryRole> callback);

    /**
     * Patches this DirectoryRole with a source
     * @param sourceDirectoryRole The source object with updates
     * @return The updated DirectoryRole
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    DirectoryRole patch(final DirectoryRole sourceDirectoryRole) throws ClientException;

    /**
     * Posts a DirectoryRole with a new object
     * @param newDirectoryRole The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final DirectoryRole newDirectoryRole, final ICallback<DirectoryRole> callback);

    /**
     * Posts a DirectoryRole with a new object
     * @param newDirectoryRole The new object to create
     * @return The created DirectoryRole
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    DirectoryRole post(final DirectoryRole newDirectoryRole) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseDirectoryRoleRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseDirectoryRoleRequest expand(final String value);
}
