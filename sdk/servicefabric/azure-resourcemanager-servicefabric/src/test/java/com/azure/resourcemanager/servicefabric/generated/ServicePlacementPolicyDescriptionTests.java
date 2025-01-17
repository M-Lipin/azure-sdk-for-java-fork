// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicefabric.models.ServicePlacementPolicyDescription;

public final class ServicePlacementPolicyDescriptionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServicePlacementPolicyDescription model =
            BinaryData
                .fromString("{\"type\":\"ServicePlacementPolicyDescription\"}")
                .toObject(ServicePlacementPolicyDescription.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServicePlacementPolicyDescription model = new ServicePlacementPolicyDescription();
        model = BinaryData.fromObject(model).toObject(ServicePlacementPolicyDescription.class);
    }
}
