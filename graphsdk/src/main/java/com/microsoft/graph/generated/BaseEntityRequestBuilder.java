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
 * The class for the Base Entity Request Builder.
 */
public class BaseEntityRequestBuilder extends BaseRequestBuilder implements IBaseEntityRequestBuilder {

    /**
     * The request builder for the Entity
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseEntityRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     */
    public IEntityRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     */
    public IEntityRequest buildRequest(final java.util.List<Option> requestOptions) {
        return new EntityRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IDirectoryObjectRequestBuilder directoryObject() {
        return new DirectoryObjectRequestBuilder(getRequestUrlWithAdditionalSegment("directoryObject"), getClient(), null);
    }

    public IExtensionRequestBuilder extension() {
        return new ExtensionRequestBuilder(getRequestUrlWithAdditionalSegment("extension"), getClient(), null);
    }

    public IDomainRequestBuilder domain() {
        return new DomainRequestBuilder(getRequestUrlWithAdditionalSegment("domain"), getClient(), null);
    }

    public IDomainDnsRecordRequestBuilder domainDnsRecord() {
        return new DomainDnsRecordRequestBuilder(getRequestUrlWithAdditionalSegment("domainDnsRecord"), getClient(), null);
    }

    public ILicenseDetailsRequestBuilder licenseDetails() {
        return new LicenseDetailsRequestBuilder(getRequestUrlWithAdditionalSegment("licenseDetails"), getClient(), null);
    }

    public IGroupSettingRequestBuilder groupSetting() {
        return new GroupSettingRequestBuilder(getRequestUrlWithAdditionalSegment("groupSetting"), getClient(), null);
    }

    public IConversationThreadRequestBuilder conversationThread() {
        return new ConversationThreadRequestBuilder(getRequestUrlWithAdditionalSegment("conversationThread"), getClient(), null);
    }

    public ICalendarRequestBuilder calendar() {
        return new CalendarRequestBuilder(getRequestUrlWithAdditionalSegment("calendar"), getClient(), null);
    }

    public IOutlookItemRequestBuilder outlookItem() {
        return new OutlookItemRequestBuilder(getRequestUrlWithAdditionalSegment("outlookItem"), getClient(), null);
    }

    public IConversationRequestBuilder conversation() {
        return new ConversationRequestBuilder(getRequestUrlWithAdditionalSegment("conversation"), getClient(), null);
    }

    public IProfilePhotoRequestBuilder profilePhoto() {
        return new ProfilePhotoRequestBuilder(getRequestUrlWithAdditionalSegment("profilePhoto"), getClient(), null);
    }

    public IBaseItemRequestBuilder baseItem() {
        return new BaseItemRequestBuilder(getRequestUrlWithAdditionalSegment("baseItem"), getClient(), null);
    }

    public IPlannerGroupRequestBuilder plannerGroup() {
        return new PlannerGroupRequestBuilder(getRequestUrlWithAdditionalSegment("plannerGroup"), getClient(), null);
    }

    public IOnenoteRequestBuilder onenote() {
        return new OnenoteRequestBuilder(getRequestUrlWithAdditionalSegment("onenote"), getClient(), null);
    }

    public ISubscribedSkuRequestBuilder subscribedSku() {
        return new SubscribedSkuRequestBuilder(getRequestUrlWithAdditionalSegment("subscribedSku"), getClient(), null);
    }

    public IMailFolderRequestBuilder mailFolder() {
        return new MailFolderRequestBuilder(getRequestUrlWithAdditionalSegment("mailFolder"), getClient(), null);
    }

    public ICalendarGroupRequestBuilder calendarGroup() {
        return new CalendarGroupRequestBuilder(getRequestUrlWithAdditionalSegment("calendarGroup"), getClient(), null);
    }

    public IPersonRequestBuilder person() {
        return new PersonRequestBuilder(getRequestUrlWithAdditionalSegment("person"), getClient(), null);
    }

    public IContactFolderRequestBuilder contactFolder() {
        return new ContactFolderRequestBuilder(getRequestUrlWithAdditionalSegment("contactFolder"), getClient(), null);
    }

    public IInferenceClassificationRequestBuilder inferenceClassification() {
        return new InferenceClassificationRequestBuilder(getRequestUrlWithAdditionalSegment("inferenceClassification"), getClient(), null);
    }

    public IPlannerUserRequestBuilder plannerUser() {
        return new PlannerUserRequestBuilder(getRequestUrlWithAdditionalSegment("plannerUser"), getClient(), null);
    }

    public ISchemaExtensionRequestBuilder schemaExtension() {
        return new SchemaExtensionRequestBuilder(getRequestUrlWithAdditionalSegment("schemaExtension"), getClient(), null);
    }

    public IAttachmentRequestBuilder attachment() {
        return new AttachmentRequestBuilder(getRequestUrlWithAdditionalSegment("attachment"), getClient(), null);
    }

    public ISingleValueLegacyExtendedPropertyRequestBuilder singleValueLegacyExtendedProperty() {
        return new SingleValueLegacyExtendedPropertyRequestBuilder(getRequestUrlWithAdditionalSegment("singleValueLegacyExtendedProperty"), getClient(), null);
    }

    public IMultiValueLegacyExtendedPropertyRequestBuilder multiValueLegacyExtendedProperty() {
        return new MultiValueLegacyExtendedPropertyRequestBuilder(getRequestUrlWithAdditionalSegment("multiValueLegacyExtendedProperty"), getClient(), null);
    }

    public IInferenceClassificationOverrideRequestBuilder inferenceClassificationOverride() {
        return new InferenceClassificationOverrideRequestBuilder(getRequestUrlWithAdditionalSegment("inferenceClassificationOverride"), getClient(), null);
    }

    public IColumnDefinitionRequestBuilder columnDefinition() {
        return new ColumnDefinitionRequestBuilder(getRequestUrlWithAdditionalSegment("columnDefinition"), getClient(), null);
    }

    public IColumnLinkRequestBuilder columnLink() {
        return new ColumnLinkRequestBuilder(getRequestUrlWithAdditionalSegment("columnLink"), getClient(), null);
    }

    public IContentTypeRequestBuilder contentType() {
        return new ContentTypeRequestBuilder(getRequestUrlWithAdditionalSegment("contentType"), getClient(), null);
    }

    public IPermissionRequestBuilder permission() {
        return new PermissionRequestBuilder(getRequestUrlWithAdditionalSegment("permission"), getClient(), null);
    }

    public IThumbnailSetRequestBuilder thumbnailSet() {
        return new ThumbnailSetRequestBuilder(getRequestUrlWithAdditionalSegment("thumbnailSet"), getClient(), null);
    }

    public IWorkbookRequestBuilder workbook() {
        return new WorkbookRequestBuilder(getRequestUrlWithAdditionalSegment("workbook"), getClient(), null);
    }

    public IFieldValueSetRequestBuilder fieldValueSet() {
        return new FieldValueSetRequestBuilder(getRequestUrlWithAdditionalSegment("fieldValueSet"), getClient(), null);
    }

    public IWorkbookApplicationRequestBuilder workbookApplication() {
        return new WorkbookApplicationRequestBuilder(getRequestUrlWithAdditionalSegment("workbookApplication"), getClient(), null);
    }

    public IWorkbookNamedItemRequestBuilder workbookNamedItem() {
        return new WorkbookNamedItemRequestBuilder(getRequestUrlWithAdditionalSegment("workbookNamedItem"), getClient(), null);
    }

    public IWorkbookTableRequestBuilder workbookTable() {
        return new WorkbookTableRequestBuilder(getRequestUrlWithAdditionalSegment("workbookTable"), getClient(), null);
    }

    public IWorkbookWorksheetRequestBuilder workbookWorksheet() {
        return new WorkbookWorksheetRequestBuilder(getRequestUrlWithAdditionalSegment("workbookWorksheet"), getClient(), null);
    }

    public IWorkbookFunctionsRequestBuilder workbookFunctions() {
        return new WorkbookFunctionsRequestBuilder(getRequestUrlWithAdditionalSegment("workbookFunctions"), getClient(), null);
    }

    public IWorkbookChartRequestBuilder workbookChart() {
        return new WorkbookChartRequestBuilder(getRequestUrlWithAdditionalSegment("workbookChart"), getClient(), null);
    }

    public IWorkbookChartAxesRequestBuilder workbookChartAxes() {
        return new WorkbookChartAxesRequestBuilder(getRequestUrlWithAdditionalSegment("workbookChartAxes"), getClient(), null);
    }

    public IWorkbookChartDataLabelsRequestBuilder workbookChartDataLabels() {
        return new WorkbookChartDataLabelsRequestBuilder(getRequestUrlWithAdditionalSegment("workbookChartDataLabels"), getClient(), null);
    }

    public IWorkbookChartAreaFormatRequestBuilder workbookChartAreaFormat() {
        return new WorkbookChartAreaFormatRequestBuilder(getRequestUrlWithAdditionalSegment("workbookChartAreaFormat"), getClient(), null);
    }

    public IWorkbookChartLegendRequestBuilder workbookChartLegend() {
        return new WorkbookChartLegendRequestBuilder(getRequestUrlWithAdditionalSegment("workbookChartLegend"), getClient(), null);
    }

    public IWorkbookChartSeriesRequestBuilder workbookChartSeries() {
        return new WorkbookChartSeriesRequestBuilder(getRequestUrlWithAdditionalSegment("workbookChartSeries"), getClient(), null);
    }

    public IWorkbookChartTitleRequestBuilder workbookChartTitle() {
        return new WorkbookChartTitleRequestBuilder(getRequestUrlWithAdditionalSegment("workbookChartTitle"), getClient(), null);
    }

    public IWorkbookChartFillRequestBuilder workbookChartFill() {
        return new WorkbookChartFillRequestBuilder(getRequestUrlWithAdditionalSegment("workbookChartFill"), getClient(), null);
    }

    public IWorkbookChartFontRequestBuilder workbookChartFont() {
        return new WorkbookChartFontRequestBuilder(getRequestUrlWithAdditionalSegment("workbookChartFont"), getClient(), null);
    }

    public IWorkbookChartAxisRequestBuilder workbookChartAxis() {
        return new WorkbookChartAxisRequestBuilder(getRequestUrlWithAdditionalSegment("workbookChartAxis"), getClient(), null);
    }

    public IWorkbookChartAxisFormatRequestBuilder workbookChartAxisFormat() {
        return new WorkbookChartAxisFormatRequestBuilder(getRequestUrlWithAdditionalSegment("workbookChartAxisFormat"), getClient(), null);
    }

    public IWorkbookChartGridlinesRequestBuilder workbookChartGridlines() {
        return new WorkbookChartGridlinesRequestBuilder(getRequestUrlWithAdditionalSegment("workbookChartGridlines"), getClient(), null);
    }

    public IWorkbookChartAxisTitleRequestBuilder workbookChartAxisTitle() {
        return new WorkbookChartAxisTitleRequestBuilder(getRequestUrlWithAdditionalSegment("workbookChartAxisTitle"), getClient(), null);
    }

    public IWorkbookChartLineFormatRequestBuilder workbookChartLineFormat() {
        return new WorkbookChartLineFormatRequestBuilder(getRequestUrlWithAdditionalSegment("workbookChartLineFormat"), getClient(), null);
    }

    public IWorkbookChartAxisTitleFormatRequestBuilder workbookChartAxisTitleFormat() {
        return new WorkbookChartAxisTitleFormatRequestBuilder(getRequestUrlWithAdditionalSegment("workbookChartAxisTitleFormat"), getClient(), null);
    }

    public IWorkbookChartDataLabelFormatRequestBuilder workbookChartDataLabelFormat() {
        return new WorkbookChartDataLabelFormatRequestBuilder(getRequestUrlWithAdditionalSegment("workbookChartDataLabelFormat"), getClient(), null);
    }

    public IWorkbookChartGridlinesFormatRequestBuilder workbookChartGridlinesFormat() {
        return new WorkbookChartGridlinesFormatRequestBuilder(getRequestUrlWithAdditionalSegment("workbookChartGridlinesFormat"), getClient(), null);
    }

    public IWorkbookChartLegendFormatRequestBuilder workbookChartLegendFormat() {
        return new WorkbookChartLegendFormatRequestBuilder(getRequestUrlWithAdditionalSegment("workbookChartLegendFormat"), getClient(), null);
    }

    public IWorkbookChartPointRequestBuilder workbookChartPoint() {
        return new WorkbookChartPointRequestBuilder(getRequestUrlWithAdditionalSegment("workbookChartPoint"), getClient(), null);
    }

    public IWorkbookChartPointFormatRequestBuilder workbookChartPointFormat() {
        return new WorkbookChartPointFormatRequestBuilder(getRequestUrlWithAdditionalSegment("workbookChartPointFormat"), getClient(), null);
    }

    public IWorkbookChartSeriesFormatRequestBuilder workbookChartSeriesFormat() {
        return new WorkbookChartSeriesFormatRequestBuilder(getRequestUrlWithAdditionalSegment("workbookChartSeriesFormat"), getClient(), null);
    }

    public IWorkbookChartTitleFormatRequestBuilder workbookChartTitleFormat() {
        return new WorkbookChartTitleFormatRequestBuilder(getRequestUrlWithAdditionalSegment("workbookChartTitleFormat"), getClient(), null);
    }

    public IWorkbookFilterRequestBuilder workbookFilter() {
        return new WorkbookFilterRequestBuilder(getRequestUrlWithAdditionalSegment("workbookFilter"), getClient(), null);
    }

    public IWorkbookFormatProtectionRequestBuilder workbookFormatProtection() {
        return new WorkbookFormatProtectionRequestBuilder(getRequestUrlWithAdditionalSegment("workbookFormatProtection"), getClient(), null);
    }

    public IWorkbookFunctionResultRequestBuilder workbookFunctionResult() {
        return new WorkbookFunctionResultRequestBuilder(getRequestUrlWithAdditionalSegment("workbookFunctionResult"), getClient(), null);
    }

    public IWorkbookPivotTableRequestBuilder workbookPivotTable() {
        return new WorkbookPivotTableRequestBuilder(getRequestUrlWithAdditionalSegment("workbookPivotTable"), getClient(), null);
    }

    public IWorkbookRangeRequestBuilder workbookRange() {
        return new WorkbookRangeRequestBuilder(getRequestUrlWithAdditionalSegment("workbookRange"), getClient(), null);
    }

    public IWorkbookRangeFormatRequestBuilder workbookRangeFormat() {
        return new WorkbookRangeFormatRequestBuilder(getRequestUrlWithAdditionalSegment("workbookRangeFormat"), getClient(), null);
    }

    public IWorkbookRangeSortRequestBuilder workbookRangeSort() {
        return new WorkbookRangeSortRequestBuilder(getRequestUrlWithAdditionalSegment("workbookRangeSort"), getClient(), null);
    }

    public IWorkbookRangeBorderRequestBuilder workbookRangeBorder() {
        return new WorkbookRangeBorderRequestBuilder(getRequestUrlWithAdditionalSegment("workbookRangeBorder"), getClient(), null);
    }

    public IWorkbookRangeFillRequestBuilder workbookRangeFill() {
        return new WorkbookRangeFillRequestBuilder(getRequestUrlWithAdditionalSegment("workbookRangeFill"), getClient(), null);
    }

    public IWorkbookRangeFontRequestBuilder workbookRangeFont() {
        return new WorkbookRangeFontRequestBuilder(getRequestUrlWithAdditionalSegment("workbookRangeFont"), getClient(), null);
    }

    public IWorkbookRangeViewRequestBuilder workbookRangeView() {
        return new WorkbookRangeViewRequestBuilder(getRequestUrlWithAdditionalSegment("workbookRangeView"), getClient(), null);
    }

    public IWorkbookTableColumnRequestBuilder workbookTableColumn() {
        return new WorkbookTableColumnRequestBuilder(getRequestUrlWithAdditionalSegment("workbookTableColumn"), getClient(), null);
    }

    public IWorkbookTableRowRequestBuilder workbookTableRow() {
        return new WorkbookTableRowRequestBuilder(getRequestUrlWithAdditionalSegment("workbookTableRow"), getClient(), null);
    }

    public IWorkbookTableSortRequestBuilder workbookTableSort() {
        return new WorkbookTableSortRequestBuilder(getRequestUrlWithAdditionalSegment("workbookTableSort"), getClient(), null);
    }

    public IWorkbookWorksheetProtectionRequestBuilder workbookWorksheetProtection() {
        return new WorkbookWorksheetProtectionRequestBuilder(getRequestUrlWithAdditionalSegment("workbookWorksheetProtection"), getClient(), null);
    }

    public ISubscriptionRequestBuilder subscription() {
        return new SubscriptionRequestBuilder(getRequestUrlWithAdditionalSegment("subscription"), getClient(), null);
    }

    public IInvitationRequestBuilder invitation() {
        return new InvitationRequestBuilder(getRequestUrlWithAdditionalSegment("invitation"), getClient(), null);
    }

    public IPlannerTaskRequestBuilder plannerTask() {
        return new PlannerTaskRequestBuilder(getRequestUrlWithAdditionalSegment("plannerTask"), getClient(), null);
    }

    public IPlannerPlanRequestBuilder plannerPlan() {
        return new PlannerPlanRequestBuilder(getRequestUrlWithAdditionalSegment("plannerPlan"), getClient(), null);
    }

    public IPlannerRequestBuilder planner() {
        return new PlannerRequestBuilder(getRequestUrlWithAdditionalSegment("planner"), getClient(), null);
    }

    public IPlannerBucketRequestBuilder plannerBucket() {
        return new PlannerBucketRequestBuilder(getRequestUrlWithAdditionalSegment("plannerBucket"), getClient(), null);
    }

    public IPlannerTaskDetailsRequestBuilder plannerTaskDetails() {
        return new PlannerTaskDetailsRequestBuilder(getRequestUrlWithAdditionalSegment("plannerTaskDetails"), getClient(), null);
    }

    public IPlannerAssignedToTaskBoardTaskFormatRequestBuilder plannerAssignedToTaskBoardTaskFormat() {
        return new PlannerAssignedToTaskBoardTaskFormatRequestBuilder(getRequestUrlWithAdditionalSegment("plannerAssignedToTaskBoardTaskFormat"), getClient(), null);
    }

    public IPlannerProgressTaskBoardTaskFormatRequestBuilder plannerProgressTaskBoardTaskFormat() {
        return new PlannerProgressTaskBoardTaskFormatRequestBuilder(getRequestUrlWithAdditionalSegment("plannerProgressTaskBoardTaskFormat"), getClient(), null);
    }

    public IPlannerBucketTaskBoardTaskFormatRequestBuilder plannerBucketTaskBoardTaskFormat() {
        return new PlannerBucketTaskBoardTaskFormatRequestBuilder(getRequestUrlWithAdditionalSegment("plannerBucketTaskBoardTaskFormat"), getClient(), null);
    }

    public IPlannerPlanDetailsRequestBuilder plannerPlanDetails() {
        return new PlannerPlanDetailsRequestBuilder(getRequestUrlWithAdditionalSegment("plannerPlanDetails"), getClient(), null);
    }

    public IOnenoteEntityBaseModelRequestBuilder onenoteEntityBaseModel() {
        return new OnenoteEntityBaseModelRequestBuilder(getRequestUrlWithAdditionalSegment("onenoteEntityBaseModel"), getClient(), null);
    }

    public IOperationRequestBuilder operation() {
        return new OperationRequestBuilder(getRequestUrlWithAdditionalSegment("operation"), getClient(), null);
    }
}
