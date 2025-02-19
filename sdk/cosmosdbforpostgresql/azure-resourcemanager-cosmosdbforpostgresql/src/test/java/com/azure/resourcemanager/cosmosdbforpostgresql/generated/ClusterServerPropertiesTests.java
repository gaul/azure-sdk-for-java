// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cosmosdbforpostgresql.fluent.models.ClusterServerProperties;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.ServerRole;
import org.junit.jupiter.api.Assertions;

public final class ClusterServerPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterServerProperties model = BinaryData.fromString(
            "{\"fullyQualifiedDomainName\":\"cukjf\",\"role\":\"Coordinator\",\"state\":\"w\",\"haState\":\"lryplwckbasyy\",\"availabilityZone\":\"ddhsgcbacphe\",\"postgresqlVersion\":\"ot\",\"citusVersion\":\"qgoulznd\",\"serverEdition\":\"kwy\",\"storageQuotaInMb\":1581994668,\"vCores\":1308251370,\"enableHa\":false,\"enablePublicIpAccess\":true,\"isReadOnly\":false,\"administratorLogin\":\"keqsrxybzqqedq\"}")
            .toObject(ClusterServerProperties.class);
        Assertions.assertEquals("kwy", model.serverEdition());
        Assertions.assertEquals(1581994668, model.storageQuotaInMb());
        Assertions.assertEquals(1308251370, model.vCores());
        Assertions.assertEquals(false, model.enableHa());
        Assertions.assertEquals(ServerRole.COORDINATOR, model.role());
        Assertions.assertEquals("ddhsgcbacphe", model.availabilityZone());
        Assertions.assertEquals("ot", model.postgresqlVersion());
        Assertions.assertEquals("qgoulznd", model.citusVersion());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterServerProperties model = new ClusterServerProperties().withServerEdition("kwy")
            .withStorageQuotaInMb(1581994668)
            .withVCores(1308251370)
            .withEnableHa(false)
            .withRole(ServerRole.COORDINATOR)
            .withAvailabilityZone("ddhsgcbacphe")
            .withPostgresqlVersion("ot")
            .withCitusVersion("qgoulznd");
        model = BinaryData.fromObject(model).toObject(ClusterServerProperties.class);
        Assertions.assertEquals("kwy", model.serverEdition());
        Assertions.assertEquals(1581994668, model.storageQuotaInMb());
        Assertions.assertEquals(1308251370, model.vCores());
        Assertions.assertEquals(false, model.enableHa());
        Assertions.assertEquals(ServerRole.COORDINATOR, model.role());
        Assertions.assertEquals("ddhsgcbacphe", model.availabilityZone());
        Assertions.assertEquals("ot", model.postgresqlVersion());
        Assertions.assertEquals("qgoulznd", model.citusVersion());
    }
}
