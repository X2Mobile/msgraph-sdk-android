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
 * The interface for the Base Drive Item Request.
 */
public interface IBaseDriveItemRequest extends IEntityRequest {

    /**
     * Gets the DriveItem from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<DriveItem> callback);

    /**
     * Gets the DriveItem from the service
     * @return The DriveItem from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    DriveItem get() throws ClientException;

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
     * Patches this DriveItem with a source
     * @param sourceDriveItem The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final DriveItem sourceDriveItem, final ICallback<DriveItem> callback);

    /**
     * Patches this DriveItem with a source
     * @param sourceDriveItem The source object with updates
     * @return The updated DriveItem
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    DriveItem patch(final DriveItem sourceDriveItem) throws ClientException;

    /**
     * Posts a DriveItem with a new object
     * @param newDriveItem The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final DriveItem newDriveItem, final ICallback<DriveItem> callback);

    /**
     * Posts a DriveItem with a new object
     * @param newDriveItem The new object to create
     * @return The created DriveItem
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    DriveItem post(final DriveItem newDriveItem) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseDriveItemRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseDriveItemRequest expand(final String value);
}
