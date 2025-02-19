// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.databox.DataBoxManager;
import com.azure.resourcemanager.databox.models.DatacenterAddressRequest;
import com.azure.resourcemanager.databox.models.RegionConfigurationRequest;
import com.azure.resourcemanager.databox.models.RegionConfigurationResponse;
import com.azure.resourcemanager.databox.models.ScheduleAvailabilityRequest;
import com.azure.resourcemanager.databox.models.SkuName;
import com.azure.resourcemanager.databox.models.TransportAvailabilityRequest;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ServicesRegionConfigurationByResourceGroupWithResponseMockTests {
    @Test
    public void testRegionConfigurationByResourceGroupWithResponse() throws Exception {
        String responseStr
            = "{\"scheduleAvailabilityResponse\":{\"availableDates\":[\"2021-05-03T19:00:54Z\"]},\"transportAvailabilityResponse\":{\"transportAvailabilityDetails\":[{\"shipmentType\":\"CustomerManaged\"},{\"shipmentType\":\"CustomerManaged\"},{\"shipmentType\":\"CustomerManaged\"}]},\"datacenterAddressResponse\":{\"datacenterAddressType\":\"DatacenterAddressResponse\",\"supportedCarriersForReturnShipment\":[\"wncot\"],\"dataCenterAzureLocation\":\"fhir\"}}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DataBoxManager manager = DataBoxManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        RegionConfigurationResponse response = manager.services()
            .regionConfigurationByResourceGroupWithResponse("jbibg", "mfxumvfcluyovw", new RegionConfigurationRequest()
                .withScheduleAvailabilityRequest(
                    new ScheduleAvailabilityRequest().withStorageLocation("bkfezzxscyhwzdgi")
                        .withCountry("jbzbomvzzbtdcq"))
                .withTransportAvailabilityRequest(
                    new TransportAvailabilityRequest().withSkuName(SkuName.DATA_BOX_CUSTOMER_DISK))
                .withDatacenterAddressRequest(
                    new DatacenterAddressRequest().withStorageLocation("ujviylwdshfs").withSkuName(SkuName.DATA_BOX)),
                com.azure.core.util.Context.NONE)
            .getValue();

    }
}
