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
 * The interface for the Base Contact Request.
 */
public interface IBaseContactRequest extends IHttpRequest {

    /**
     * Gets the Contact from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<Contact> callback);

    /**
     * Gets the Contact from the service
     * @return The Contact from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Contact get() throws ClientException;

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
     * Patches this Contact with a source
     * @param sourceContact The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final Contact sourceContact, final ICallback<Contact> callback);

    /**
     * Patches this Contact with a source
     * @param sourceContact The source object with updates
     * @return The updated Contact
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Contact patch(final Contact sourceContact) throws ClientException;

    /**
     * Posts a Contact with a new object
     * @param newContact The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final Contact newContact, final ICallback<Contact> callback);

    /**
     * Posts a Contact with a new object
     * @param newContact The new object to create
     * @return The created Contact
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Contact post(final Contact newContact) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseContactRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseContactRequest expand(final String value);

}

