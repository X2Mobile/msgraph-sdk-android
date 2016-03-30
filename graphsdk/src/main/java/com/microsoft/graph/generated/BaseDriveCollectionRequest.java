// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
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
 * The class for the Base Drive Collection Request.
 */
public class BaseDriveCollectionRequest extends BaseCollectionRequest<BaseDriveCollectionResponse, IDriveCollectionPage> implements IBaseDriveCollectionRequest {

    /**
     * The request builder for this collection of Drive
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseDriveCollectionRequest(final String requestUrl, IBaseClient client, final List<Option> options) {
        super(requestUrl, client, options, BaseDriveCollectionResponse.class, IDriveCollectionPage.class);
    }

    public void get(final ICallback<IDriveCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IDriveCollectionPage get() throws ClientException {
        final BaseDriveCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final Drive newDrive, final ICallback<Drive> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DriveRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newDrive, callback);
    }

    public Drive post(final Drive newDrive) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DriveRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newDrive);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IDriveCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("expand", value));
        return (DriveCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IDriveCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("select", value));
        return (DriveCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IDriveCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("top", value + ""));
        return (DriveCollectionRequest)this;
    }

    public IDriveCollectionPage buildFromResponse(final BaseDriveCollectionResponse response) {
        final IDriveCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DriveCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DriveCollectionPage page = new DriveCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
