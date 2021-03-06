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
 * The interface for the Base Onenote Request Builder.
 */
public interface IBaseOnenoteRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     */
    IOnenoteRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     */
    IOnenoteRequest buildRequest(final java.util.List<Option> requestOptions);

    INotebookCollectionRequestBuilder getNotebooks();

    INotebookRequestBuilder getNotebooks(final String id);

    IOnenoteSectionCollectionRequestBuilder getSections();

    IOnenoteSectionRequestBuilder getSections(final String id);

    ISectionGroupCollectionRequestBuilder getSectionGroups();

    ISectionGroupRequestBuilder getSectionGroups(final String id);

    IOnenotePageCollectionRequestBuilder getPages();

    IOnenotePageRequestBuilder getPages(final String id);

    IOnenoteResourceCollectionRequestBuilder getResources();

    IOnenoteResourceRequestBuilder getResources(final String id);

    IOnenoteOperationCollectionRequestBuilder getOperations();

    IOnenoteOperationRequestBuilder getOperations(final String id);

}
