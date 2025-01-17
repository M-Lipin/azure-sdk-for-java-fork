// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.L3IsolationDomainInner;
import com.azure.resourcemanager.managednetworkfabric.models.AggregateRouteConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.L3IsolationDomainPatchPropertiesConnectedSubnetRoutePolicy;
import com.azure.resourcemanager.managednetworkfabric.models.RedistributeConnectedSubnets;
import com.azure.resourcemanager.managednetworkfabric.models.RedistributeStaticRoutes;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class L3IsolationDomainInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        L3IsolationDomainInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"networkFabricId\":\"pnazzm\",\"disabledOnResources\":[\"unmpxttd\",\"hrbnlankxmyskpbh\"],\"administrativeState\":\"Disabled\",\"optionBDisabledOnResources\":[\"cxy\",\"ny\"],\"provisioningState\":\"Deleting\",\"redistributeConnectedSubnets\":\"True\",\"redistributeStaticRoutes\":\"True\",\"aggregateRouteConfiguration\":{\"ipv4Routes\":[],\"ipv6Routes\":[]},\"description\":\"xczfcl\",\"connectedSubnetRoutePolicy\":{\"exportRoutePolicyId\":\"xdbabphlwr\",\"administrativeState\":\"Enabled\"},\"annotation\":\"tsthsucocm\"},\"location\":\"yazttbtwwrqpue\",\"tags\":{\"fey\":\"zywbiex\",\"ujwb\":\"eaxib\"},\"id\":\"qwalmuzyoxaepd\",\"name\":\"zjancuxr\",\"type\":\"d\"}")
                .toObject(L3IsolationDomainInner.class);
        Assertions.assertEquals("yazttbtwwrqpue", model.location());
        Assertions.assertEquals("zywbiex", model.tags().get("fey"));
        Assertions.assertEquals("pnazzm", model.networkFabricId());
        Assertions.assertEquals(RedistributeConnectedSubnets.TRUE, model.redistributeConnectedSubnets());
        Assertions.assertEquals(RedistributeStaticRoutes.TRUE, model.redistributeStaticRoutes());
        Assertions.assertEquals("xczfcl", model.description());
        Assertions.assertEquals("xdbabphlwr", model.connectedSubnetRoutePolicy().exportRoutePolicyId());
        Assertions.assertEquals("tsthsucocm", model.annotation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        L3IsolationDomainInner model =
            new L3IsolationDomainInner()
                .withLocation("yazttbtwwrqpue")
                .withTags(mapOf("fey", "zywbiex", "ujwb", "eaxib"))
                .withNetworkFabricId("pnazzm")
                .withRedistributeConnectedSubnets(RedistributeConnectedSubnets.TRUE)
                .withRedistributeStaticRoutes(RedistributeStaticRoutes.TRUE)
                .withAggregateRouteConfiguration(
                    new AggregateRouteConfiguration().withIpv4Routes(Arrays.asList()).withIpv6Routes(Arrays.asList()))
                .withDescription("xczfcl")
                .withConnectedSubnetRoutePolicy(
                    new L3IsolationDomainPatchPropertiesConnectedSubnetRoutePolicy()
                        .withExportRoutePolicyId("xdbabphlwr"))
                .withAnnotation("tsthsucocm");
        model = BinaryData.fromObject(model).toObject(L3IsolationDomainInner.class);
        Assertions.assertEquals("yazttbtwwrqpue", model.location());
        Assertions.assertEquals("zywbiex", model.tags().get("fey"));
        Assertions.assertEquals("pnazzm", model.networkFabricId());
        Assertions.assertEquals(RedistributeConnectedSubnets.TRUE, model.redistributeConnectedSubnets());
        Assertions.assertEquals(RedistributeStaticRoutes.TRUE, model.redistributeStaticRoutes());
        Assertions.assertEquals("xczfcl", model.description());
        Assertions.assertEquals("xdbabphlwr", model.connectedSubnetRoutePolicy().exportRoutePolicyId());
        Assertions.assertEquals("tsthsucocm", model.annotation());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
