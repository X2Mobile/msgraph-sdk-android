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
 * The interface for the Base Item Attachment Request.
 */
public interface IBaseItemAttachmentRequest extends IAttachmentRequest {

    /**
     * Gets the ItemAttachment from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<ItemAttachment> callback);

    /**
     * Gets the ItemAttachment from the service
     * @return The ItemAttachment from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    ItemAttachment get() throws ClientException;

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
     * Patches this ItemAttachment with a source
     * @param sourceItemAttachment The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final ItemAttachment sourceItemAttachment, final ICallback<ItemAttachment> callback);

    /**
     * Patches this ItemAttachment with a source
     * @param sourceItemAttachment The source object with updates
     * @return The updated ItemAttachment
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    ItemAttachment patch(final ItemAttachment sourceItemAttachment) throws ClientException;

    /**
     * Posts a ItemAttachment with a new object
     * @param newItemAttachment The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final ItemAttachment newItemAttachment, final ICallback<ItemAttachment> callback);

    /**
     * Posts a ItemAttachment with a new object
     * @param newItemAttachment The new object to create
     * @return The created ItemAttachment
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    ItemAttachment post(final ItemAttachment newItemAttachment) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseItemAttachmentRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseItemAttachmentRequest expand(final String value);
}
