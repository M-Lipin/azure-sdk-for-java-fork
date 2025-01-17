// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagecache.models.AmlFilesystemSubnetInfo;
import com.azure.resourcemanager.storagecache.models.SkuName;
import org.junit.jupiter.api.Assertions;

public final class AmlFilesystemSubnetInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AmlFilesystemSubnetInfo model =
            BinaryData
                .fromString(
                    "{\"filesystemSubnet\":\"xtbzsgfyccsne\",\"storageCapacityTiB\":54.53775,\"sku\":{\"name\":\"jeiachboosfl\"},\"location\":\"osfqpteehzzv\"}")
                .toObject(AmlFilesystemSubnetInfo.class);
        Assertions.assertEquals("xtbzsgfyccsne", model.filesystemSubnet());
        Assertions.assertEquals(54.53775F, model.storageCapacityTiB());
        Assertions.assertEquals("jeiachboosfl", model.sku().name());
        Assertions.assertEquals("osfqpteehzzv", model.location());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AmlFilesystemSubnetInfo model =
            new AmlFilesystemSubnetInfo()
                .withFilesystemSubnet("xtbzsgfyccsne")
                .withStorageCapacityTiB(54.53775F)
                .withSku(new SkuName().withName("jeiachboosfl"))
                .withLocation("osfqpteehzzv");
        model = BinaryData.fromObject(model).toObject(AmlFilesystemSubnetInfo.class);
        Assertions.assertEquals("xtbzsgfyccsne", model.filesystemSubnet());
        Assertions.assertEquals(54.53775F, model.storageCapacityTiB());
        Assertions.assertEquals("jeiachboosfl", model.sku().name());
        Assertions.assertEquals("osfqpteehzzv", model.location());
    }
}
