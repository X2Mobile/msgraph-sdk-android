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
 * The class for the Base Calendar Group Collection Request Builder.
 */
public class BaseCalendarGroupCollectionRequestBuilder extends BaseRequestBuilder implements IBaseCalendarGroupCollectionRequestBuilder {

    /**
     * The request builder for this collection of User
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseCalendarGroupCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> options) {
        super(requestUrl, client, options);
    }

    public ICalendarGroupCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public ICalendarGroupCollectionRequest buildRequest(final List<Option> options) {
        return new CalendarGroupCollectionRequest(getRequestUrl(), getClient(), options);
    }

    public ICalendarGroupRequestBuilder byId(final String id) {
        return new CalendarGroupRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }
}
