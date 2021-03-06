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
 * The interface for the Base Inference Classification Override Request.
 */
public interface IBaseInferenceClassificationOverrideRequest extends IHttpRequest {

    /**
     * Gets the InferenceClassificationOverride from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<InferenceClassificationOverride> callback);

    /**
     * Gets the InferenceClassificationOverride from the service
     * @return The InferenceClassificationOverride from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    InferenceClassificationOverride get() throws ClientException;

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
     * Patches this InferenceClassificationOverride with a source
     * @param sourceInferenceClassificationOverride The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final InferenceClassificationOverride sourceInferenceClassificationOverride, final ICallback<InferenceClassificationOverride> callback);

    /**
     * Patches this InferenceClassificationOverride with a source
     * @param sourceInferenceClassificationOverride The source object with updates
     * @return The updated InferenceClassificationOverride
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    InferenceClassificationOverride patch(final InferenceClassificationOverride sourceInferenceClassificationOverride) throws ClientException;

    /**
     * Posts a InferenceClassificationOverride with a new object
     * @param newInferenceClassificationOverride The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final InferenceClassificationOverride newInferenceClassificationOverride, final ICallback<InferenceClassificationOverride> callback);

    /**
     * Posts a InferenceClassificationOverride with a new object
     * @param newInferenceClassificationOverride The new object to create
     * @return The created InferenceClassificationOverride
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    InferenceClassificationOverride post(final InferenceClassificationOverride newInferenceClassificationOverride) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseInferenceClassificationOverrideRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseInferenceClassificationOverrideRequest expand(final String value);

}

