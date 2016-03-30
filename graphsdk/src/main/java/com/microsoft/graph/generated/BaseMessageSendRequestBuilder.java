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
 * The class for the Base Message Send Request Builder.
 */
public class BaseMessageSendRequestBuilder extends BaseRequestBuilder {


    /**
     * The request builder for this MessageSend
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseMessageSendRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> options) {
        super(requestUrl, client, options);
    }

    /**
     * Creates the IMessageSendRequest
     *
     * @return The IMessageSendRequest instance
     */
    public IMessageSendRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IMessageSendRequest with specific options instead of the existing options
     *
     * @param options the options for the request
     * @return The IMessageSendRequest instance
     */
    public IMessageSendRequest buildRequest(final List<Option> options) {
        return new MessageSendRequest(getRequestUrl(), getClient(), options);
    }
}
