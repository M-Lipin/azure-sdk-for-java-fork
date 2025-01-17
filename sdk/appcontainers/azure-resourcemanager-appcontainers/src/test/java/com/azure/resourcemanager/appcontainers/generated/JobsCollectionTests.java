// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.fluent.models.JobInner;
import com.azure.resourcemanager.appcontainers.models.JobsCollection;
import com.azure.resourcemanager.appcontainers.models.ManagedServiceIdentity;
import com.azure.resourcemanager.appcontainers.models.ManagedServiceIdentityType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class JobsCollectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JobsCollection model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"identity\":{\"principalId\":\"7fdb9895-f7d3-44c8-a956-f6192adce361\",\"tenantId\":\"780f2a97-d89a-4b0e-a9a8-4391bb8dc335\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{}},\"properties\":{\"provisioningState\":\"Deleting\",\"environmentId\":\"xltjcvnhltiu\",\"workloadProfileName\":\"xnavvwxq\",\"outboundIpAddresses\":[],\"eventStreamEndpoint\":\"nyowxwlmdjrkvfg\"},\"location\":\"fvpdbo\",\"tags\":{\"bdeibqipqk\":\"izsjqlhkrr\",\"rwkq\":\"hvxndzwmkrefajpj\",\"sjabibs\":\"yhgbijtjivfx\",\"bjxbkzbzk\":\"stawfsdjpvkv\"},\"id\":\"vncjabudurgk\",\"name\":\"kmokz\",\"type\":\"jjklff\"},{\"identity\":{\"principalId\":\"0ebc5a53-e4fd-48c1-88c2-b67adfb9c8cc\",\"tenantId\":\"15217d58-64e4-4461-b41c-6be1793b87d0\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{}},\"properties\":{\"provisioningState\":\"Canceled\",\"environmentId\":\"fzeeyebizik\",\"workloadProfileName\":\"uhqlbjbsybbqwrvt\",\"outboundIpAddresses\":[],\"eventStreamEndpoint\":\"pgvmpipaslthaqfx\"},\"location\":\"mwutwbdsre\",\"tags\":{\"d\":\"rhneuyowq\",\"gpikpzimejza\":\"ytisibir\",\"rjqc\":\"lfzxiavrmbzonoki\"},\"id\":\"rgz\",\"name\":\"frl\",\"type\":\"zszrnwoiindfpw\"},{\"identity\":{\"principalId\":\"e9d679f5-2216-498a-bafe-adee2bde0adc\",\"tenantId\":\"8508ac9b-7ec3-48c3-bfd2-8b16e127e3ef\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{}},\"properties\":{\"provisioningState\":\"Failed\",\"environmentId\":\"lsj\",\"workloadProfileName\":\"hszfjvfb\",\"outboundIpAddresses\":[],\"eventStreamEndpoint\":\"jagrqmqhldvr\"},\"location\":\"iojnalghfkvtv\",\"tags\":{\"rhmzkwpj\":\"sowueluqhhahhx\",\"ughftqsx\":\"wws\"},\"id\":\"qxujxukndxd\",\"name\":\"grjguufzd\",\"type\":\"syqtfi\"},{\"identity\":{\"principalId\":\"8a65a473-6275-43c0-b499-83e3744ef7ec\",\"tenantId\":\"d3fe6990-26c2-4a73-a6e9-e90a4f9e89a1\",\"type\":\"None\",\"userAssignedIdentities\":{}},\"properties\":{\"provisioningState\":\"Failed\",\"environmentId\":\"amvpphoszqzudph\",\"workloadProfileName\":\"mvdk\",\"outboundIpAddresses\":[],\"eventStreamEndpoint\":\"cvtbv\"},\"location\":\"yhmtnvyqiat\",\"tags\":{\"zcjaesgvvsccy\":\"pcnp\"},\"id\":\"jguq\",\"name\":\"hwyg\",\"type\":\"lvdnkfx\"}],\"nextLink\":\"emdwzrmuhapfc\"}")
                .toObject(JobsCollection.class);
        Assertions.assertEquals("fvpdbo", model.value().get(0).location());
        Assertions.assertEquals("izsjqlhkrr", model.value().get(0).tags().get("bdeibqipqk"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.value().get(0).identity().type());
        Assertions.assertEquals("xltjcvnhltiu", model.value().get(0).environmentId());
        Assertions.assertEquals("xnavvwxq", model.value().get(0).workloadProfileName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JobsCollection model =
            new JobsCollection()
                .withValue(
                    Arrays
                        .asList(
                            new JobInner()
                                .withLocation("fvpdbo")
                                .withTags(
                                    mapOf(
                                        "bdeibqipqk",
                                        "izsjqlhkrr",
                                        "rwkq",
                                        "hvxndzwmkrefajpj",
                                        "sjabibs",
                                        "yhgbijtjivfx",
                                        "bjxbkzbzk",
                                        "stawfsdjpvkv"))
                                .withIdentity(
                                    new ManagedServiceIdentity()
                                        .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                                        .withUserAssignedIdentities(mapOf()))
                                .withEnvironmentId("xltjcvnhltiu")
                                .withWorkloadProfileName("xnavvwxq"),
                            new JobInner()
                                .withLocation("mwutwbdsre")
                                .withTags(
                                    mapOf("d", "rhneuyowq", "gpikpzimejza", "ytisibir", "rjqc", "lfzxiavrmbzonoki"))
                                .withIdentity(
                                    new ManagedServiceIdentity()
                                        .withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED)
                                        .withUserAssignedIdentities(mapOf()))
                                .withEnvironmentId("fzeeyebizik")
                                .withWorkloadProfileName("uhqlbjbsybbqwrvt"),
                            new JobInner()
                                .withLocation("iojnalghfkvtv")
                                .withTags(mapOf("rhmzkwpj", "sowueluqhhahhx", "ughftqsx", "wws"))
                                .withIdentity(
                                    new ManagedServiceIdentity()
                                        .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                                        .withUserAssignedIdentities(mapOf()))
                                .withEnvironmentId("lsj")
                                .withWorkloadProfileName("hszfjvfb"),
                            new JobInner()
                                .withLocation("yhmtnvyqiat")
                                .withTags(mapOf("zcjaesgvvsccy", "pcnp"))
                                .withIdentity(
                                    new ManagedServiceIdentity()
                                        .withType(ManagedServiceIdentityType.NONE)
                                        .withUserAssignedIdentities(mapOf()))
                                .withEnvironmentId("amvpphoszqzudph")
                                .withWorkloadProfileName("mvdk")));
        model = BinaryData.fromObject(model).toObject(JobsCollection.class);
        Assertions.assertEquals("fvpdbo", model.value().get(0).location());
        Assertions.assertEquals("izsjqlhkrr", model.value().get(0).tags().get("bdeibqipqk"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.value().get(0).identity().type());
        Assertions.assertEquals("xltjcvnhltiu", model.value().get(0).environmentId());
        Assertions.assertEquals("xnavvwxq", model.value().get(0).workloadProfileName());
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
