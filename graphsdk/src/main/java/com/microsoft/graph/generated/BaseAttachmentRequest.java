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
 * The class for the Base Attachment Request.
 */
public class BaseAttachmentRequest extends EntityRequest implements IBaseAttachmentRequest {

    /**
     * The request for the Attachment
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseAttachmentRequest(final String requestUrl,
            final IBaseClient client,
            final List<Option> options,
            final Class responseClass) {
        super(requestUrl, client, options, responseClass);
    }

    /**
     * Gets the Attachment from the service
     * @param callback The callback to be called after success or failure.
     */
    public void getAttachment(final ICallback<Attachment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Attachment from the service
     * @return The Attachment from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Attachment getAttachment() throws ClientException {
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
     * Patches this Attachment with a source
     * @param sourceAttachment The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final Attachment sourceAttachment, final ICallback<Attachment> callback) {
        send(HttpMethod.PATCH, callback, sourceAttachment);
    }

    /**
     * Patches this Attachment with a source
     * @param sourceAttachment The source object with updates
     * @return The updated Attachment
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Attachment patch(final Attachment sourceAttachment) throws ClientException {
        return send(HttpMethod.PATCH, sourceAttachment);
    }

    /**
     * Creates a Attachment with a new object
     * @param newAttachment The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final Attachment newAttachment, final ICallback<Attachment> callback) {
        send(HttpMethod.POST, callback, newAttachment);
    }

    /**
     * Creates a Attachment with a new object
     * @param newAttachment The new object to create
     * @return The created Attachment
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Attachment post(final Attachment newAttachment) throws ClientException {
        return send(HttpMethod.POST, newAttachment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IAttachmentRequest select(final String value) {
         getQueryOptions().add(new QueryOption("select", value));
         return (AttachmentRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IAttachmentRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("expand", value));
         return (AttachmentRequest)this;
     }
}
