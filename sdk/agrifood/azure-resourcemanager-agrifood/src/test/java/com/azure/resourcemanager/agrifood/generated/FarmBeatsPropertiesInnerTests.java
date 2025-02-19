// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.agrifood.fluent.models.FarmBeatsPropertiesInner;
import com.azure.resourcemanager.agrifood.models.PublicNetworkAccess;
import com.azure.resourcemanager.agrifood.models.SensorIntegration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class FarmBeatsPropertiesInnerTests {
    @Test
    public void testDeserialize() {
        FarmBeatsPropertiesInner model = BinaryData.fromString(
            "{\"instanceUri\":\"nguitnwuizgazxu\",\"provisioningState\":\"Creating\",\"sensorIntegration\":{\"enabled\":\"kyfi\",\"provisioningState\":\"Updating\"},\"publicNetworkAccess\":\"Hybrid\",\"privateEndpointConnections\":{\"properties\":{\"provisioningState\":\"Failed\"},\"id\":\"htymw\",\"name\":\"sdkf\",\"type\":\"hwxmnteiwa\"}}")
            .toObject(FarmBeatsPropertiesInner.class);
        Assertions.assertEquals("kyfi", model.sensorIntegration().enabled());
        Assertions.assertEquals(PublicNetworkAccess.HYBRID, model.publicNetworkAccess());
    }

    @Test
    public void testSerialize() {
        FarmBeatsPropertiesInner model
            = new FarmBeatsPropertiesInner().withSensorIntegration(new SensorIntegration().withEnabled("kyfi"))
                .withPublicNetworkAccess(PublicNetworkAccess.HYBRID);
        model = BinaryData.fromObject(model).toObject(FarmBeatsPropertiesInner.class);
        Assertions.assertEquals("kyfi", model.sensorIntegration().enabled());
        Assertions.assertEquals(PublicNetworkAccess.HYBRID, model.publicNetworkAccess());
    }
}
