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

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Item Reference.
 */
public class BaseItemReference implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose(serialize = false)
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager getAdditionalDataManager() {
        return additionalDataManager;
    }

    public BaseItemReference() {
        oDataType = "microsoft.graph.itemReference";
    }

    /**
     * The Drive Id.
     * Unique identifier of the drive instance that contains the item. Read-only.
     */
    @SerializedName("driveId")
    @Expose
    public String driveId;

    /**
     * The Drive Type.
     * 
     */
    @SerializedName("driveType")
    @Expose
    public String driveType;

    /**
     * The Id.
     * Unique identifier of the item in the drive. Read-only.
     */
    @SerializedName("id")
    @Expose
    public String id;

    /**
     * The Name.
     * The name of the item being referenced. Read-only.
     */
    @SerializedName("name")
    @Expose
    public String name;

    /**
     * The Path.
     * Path that can be used to navigate to the item. Read-only.
     */
    @SerializedName("path")
    @Expose
    public String path;

    /**
     * The Share Id.
     * A unique identifier for a shared resource that can be accessed via the Shares API.
     */
    @SerializedName("shareId")
    @Expose
    public String shareId;

    /**
     * The Sharepoint Ids.
     * Returns identifiers useful for SharePoint REST compatibility. Read-only.
     */
    @SerializedName("sharepointIds")
    @Expose
    public SharepointIds sharepointIds;


    /**
     * The raw representation of this class
     */
    private transient JsonObject mRawObject;

    /**
     * The serializer
     */
    private transient ISerializer mSerializer;

    /**
     * Gets the raw representation of this class
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return mRawObject;
    }

    /**
     * Gets serializer
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return mSerializer;
    }

    /**
     * Sets the raw json object
     *
     * @param serializer The serializer
     * @param json The json object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        mSerializer = serializer;
        mRawObject = json;

    }
}
