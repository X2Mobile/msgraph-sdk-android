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
 * The class for the Base Drive Collection Request Builder.
 */
public class BaseDriveCollectionRequestBuilder extends BaseRequestBuilder implements IBaseDriveCollectionRequestBuilder {

    /**
     * The request builder for this collection of Drive
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseDriveCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> options) {
        super(requestUrl, client, options);
    }

    public IDriveCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IDriveCollectionRequest buildRequest(final List<Option> options) {
        return new DriveCollectionRequest(getRequestUrl(), getClient(), options);
    }

    public IDriveRequestBuilder byId(final String id) {
        return new DriveRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }
}
