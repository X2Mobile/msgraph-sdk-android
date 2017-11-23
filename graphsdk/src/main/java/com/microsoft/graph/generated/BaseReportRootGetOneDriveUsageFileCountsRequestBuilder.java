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
 * The class for the Base Report Root Get One Drive Usage File Counts Request Builder.
 */
public class BaseReportRootGetOneDriveUsageFileCountsRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this ReportRootGetOneDriveUsageFileCounts
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseReportRootGetOneDriveUsageFileCountsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
        mFunctionOptions.add(new FunctionOption("period", period));
    }

    /**
     * Creates the IReportRootGetOneDriveUsageFileCountsRequest
     *
     * @return The IReportRootGetOneDriveUsageFileCountsRequest instance
     */
    public IReportRootGetOneDriveUsageFileCountsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IReportRootGetOneDriveUsageFileCountsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IReportRootGetOneDriveUsageFileCountsRequest instance
     */
    public IReportRootGetOneDriveUsageFileCountsRequest buildRequest(final java.util.List<Option> requestOptions) {
        ReportRootGetOneDriveUsageFileCountsRequest request = new ReportRootGetOneDriveUsageFileCountsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (FunctionOption option : mFunctionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}