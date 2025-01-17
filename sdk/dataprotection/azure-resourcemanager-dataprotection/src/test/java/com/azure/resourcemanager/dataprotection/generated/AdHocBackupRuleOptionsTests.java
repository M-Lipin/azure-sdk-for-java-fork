// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.AdHocBackupRuleOptions;
import com.azure.resourcemanager.dataprotection.models.AdhocBackupTriggerOption;
import org.junit.jupiter.api.Assertions;

public final class AdHocBackupRuleOptionsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AdHocBackupRuleOptions model =
            BinaryData
                .fromString("{\"ruleName\":\"ryavwhheunmmqh\",\"triggerOption\":{\"retentionTagOverride\":\"xzko\"}}")
                .toObject(AdHocBackupRuleOptions.class);
        Assertions.assertEquals("ryavwhheunmmqh", model.ruleName());
        Assertions.assertEquals("xzko", model.triggerOption().retentionTagOverride());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AdHocBackupRuleOptions model =
            new AdHocBackupRuleOptions()
                .withRuleName("ryavwhheunmmqh")
                .withTriggerOption(new AdhocBackupTriggerOption().withRetentionTagOverride("xzko"));
        model = BinaryData.fromObject(model).toObject(AdHocBackupRuleOptions.class);
        Assertions.assertEquals("ryavwhheunmmqh", model.ruleName());
        Assertions.assertEquals("xzko", model.triggerOption().retentionTagOverride());
    }
}
