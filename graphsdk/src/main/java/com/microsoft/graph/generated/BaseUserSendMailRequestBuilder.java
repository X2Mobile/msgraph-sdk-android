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
 * The class for the Base User Send Mail Request Builder.
 */
public class BaseUserSendMailRequestBuilder extends BaseRequestBuilder {

    public final Message mMessage;
    public final Boolean mSaveToSentItems;

    /**
     * The request builder for this UserSendMail
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseUserSendMailRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> options, final Message message, final Boolean saveToSentItems) {
        super(requestUrl, client, options);
        mMessage = message;
        mSaveToSentItems = saveToSentItems;
    }

    /**
     * Creates the IUserSendMailRequest
     *
     * @return The IUserSendMailRequest instance
     */
    public IUserSendMailRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IUserSendMailRequest with specific options instead of the existing options
     *
     * @param options the options for the request
     * @return The IUserSendMailRequest instance
     */
    public IUserSendMailRequest buildRequest(final List<Option> options) {
        return new UserSendMailRequest(getRequestUrl(), getClient(), options, mMessage, mSaveToSentItems);
    }
}
