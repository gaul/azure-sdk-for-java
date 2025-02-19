// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.WeeklySchedule;
import org.junit.jupiter.api.Assertions;

public final class WeeklyScheduleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WeeklySchedule model = BinaryData.fromString(
            "{\"snapshotsToKeep\":237488555,\"day\":\"m\",\"hour\":1165571898,\"minute\":1595958724,\"usedBytes\":3452794407126633179}")
            .toObject(WeeklySchedule.class);
        Assertions.assertEquals(237488555, model.snapshotsToKeep());
        Assertions.assertEquals("m", model.day());
        Assertions.assertEquals(1165571898, model.hour());
        Assertions.assertEquals(1595958724, model.minute());
        Assertions.assertEquals(3452794407126633179L, model.usedBytes());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WeeklySchedule model = new WeeklySchedule().withSnapshotsToKeep(237488555)
            .withDay("m")
            .withHour(1165571898)
            .withMinute(1595958724)
            .withUsedBytes(3452794407126633179L);
        model = BinaryData.fromObject(model).toObject(WeeklySchedule.class);
        Assertions.assertEquals(237488555, model.snapshotsToKeep());
        Assertions.assertEquals("m", model.day());
        Assertions.assertEquals(1165571898, model.hour());
        Assertions.assertEquals(1595958724, model.minute());
        Assertions.assertEquals(3452794407126633179L, model.usedBytes());
    }
}
