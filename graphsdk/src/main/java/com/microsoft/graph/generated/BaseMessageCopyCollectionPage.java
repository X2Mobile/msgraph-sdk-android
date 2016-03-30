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
 * The class for the Base Message Copy Collection Page.
 */
public class BaseMessageCopyCollectionPage extends BaseCollectionPage<Message, IMessageCopyRequestBuilder> implements IBaseMessageCopyCollectionPage {

    /**
     * A collection page for MessageCopy.
     *
     * @param response The serialized BaseMessageCopyCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public BaseMessageCopyCollectionPage(final BaseMessageCopyCollectionResponse response, final IMessageCopyRequestBuilder builder) {
       super(response.value, builder);
    }
}
