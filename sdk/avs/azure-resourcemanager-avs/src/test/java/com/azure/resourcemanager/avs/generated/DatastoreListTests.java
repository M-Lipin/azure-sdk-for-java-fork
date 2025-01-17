// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.models.DatastoreList;

public final class DatastoreListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DatastoreList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"Deleting\",\"status\":\"Inaccessible\"},\"id\":\"lqdqgbiqylihka\",\"name\":\"tcktvfcivfsnky\",\"type\":\"uctqhjfbe\"}],\"nextLink\":\"jcxerfuwu\"}")
                .toObject(DatastoreList.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DatastoreList model = new DatastoreList();
        model = BinaryData.fromObject(model).toObject(DatastoreList.class);
    }
}
