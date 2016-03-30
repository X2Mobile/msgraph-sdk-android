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
 * The class for the Base Group Subscribe By Mail Collection Page.
 */
public class BaseGroupSubscribeByMailCollectionPage extends BaseCollectionPage<Group, IGroupSubscribeByMailRequestBuilder> implements IBaseGroupSubscribeByMailCollectionPage {

    /**
     * A collection page for GroupSubscribeByMail.
     *
     * @param response The serialized BaseGroupSubscribeByMailCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public BaseGroupSubscribeByMailCollectionPage(final BaseGroupSubscribeByMailCollectionResponse response, final IGroupSubscribeByMailRequestBuilder builder) {
       super(response.value, builder);
    }
}
