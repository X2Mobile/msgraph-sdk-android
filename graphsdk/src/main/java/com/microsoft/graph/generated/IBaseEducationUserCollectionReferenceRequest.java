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
 * The interface for the Base Education User Collection Reference Request.
 */
public interface IBaseEducationUserCollectionReferenceRequest {

    void post(final EducationUser newEducationUser, final ICallback<EducationUser> callback);

    EducationUser post(final EducationUser newEducationUser) throws ClientException;

    IEducationUserCollectionReferenceRequest select(final String value);

    IEducationUserCollectionReferenceRequest top(final int value);

}