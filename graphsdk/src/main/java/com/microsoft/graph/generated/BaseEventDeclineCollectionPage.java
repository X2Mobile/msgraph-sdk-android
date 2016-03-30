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

import com.google.gson.JsonObject;
import com.google.gson.annotations.*;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Event Decline Collection Page.
 */
public class BaseEventDeclineCollectionPage extends BaseCollectionPage<Event, IEventDeclineRequestBuilder> implements IBaseEventDeclineCollectionPage {

    /**
     * A collection page for EventDecline.
     *
     * @param response The serialized BaseEventDeclineCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public BaseEventDeclineCollectionPage(final BaseEventDeclineCollectionResponse response, final IEventDeclineRequestBuilder builder) {
       super(response.value, builder);
    }
}
