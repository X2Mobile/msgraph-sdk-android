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
 * The class for the Base User Reminder View Request Builder.
 */
public class BaseUserReminderViewRequestBuilder extends BaseRequestBuilder {

    public final String mStartDateTime;
    public final String mEndDateTime;

    /**
     * The request builder for this UserReminderView
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseUserReminderViewRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> options, final String startDateTime, final String endDateTime) {
        super(requestUrl, client, options);
        mStartDateTime = startDateTime;
        mEndDateTime = endDateTime;
    }

    /**
     * Creates the IUserReminderViewRequest
     *
     * @return The IUserReminderViewRequest instance
     */
    public IUserReminderViewRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IUserReminderViewRequest with specific options instead of the existing options
     *
     * @param options the options for the request
     * @return The IUserReminderViewRequest instance
     */
    public IUserReminderViewRequest buildRequest(final List<Option> options) {
        return new UserReminderViewRequest(getRequestUrl(), getClient(), options, mStartDateTime, mEndDateTime);
    }
}
