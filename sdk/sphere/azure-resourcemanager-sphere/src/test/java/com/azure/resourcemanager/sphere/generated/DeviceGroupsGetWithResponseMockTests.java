// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.sphere.AzureSphereManager;
import com.azure.resourcemanager.sphere.models.AllowCrashDumpCollection;
import com.azure.resourcemanager.sphere.models.DeviceGroup;
import com.azure.resourcemanager.sphere.models.OSFeedType;
import com.azure.resourcemanager.sphere.models.RegionalDataBoundary;
import com.azure.resourcemanager.sphere.models.UpdatePolicy;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class DeviceGroupsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"description\":\"v\",\"osFeedType\":\"RetailEval\",\"updatePolicy\":\"No3rdPartyAppUpdates\",\"allowCrashDumpsCollection\":\"Disabled\",\"regionalDataBoundary\":\"None\",\"hasDeployment\":true,\"provisioningState\":\"Updating\"},\"id\":\"dxepxgyq\",\"name\":\"gvr\",\"type\":\"mnpkukghimdblxg\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        AzureSphereManager manager = AzureSphereManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        DeviceGroup response = manager.deviceGroups()
            .getWithResponse("xxmueedn", "rdvstkwqqtch", "alm", "mtdaa", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("v", response.properties().description());
        Assertions.assertEquals(OSFeedType.RETAIL_EVAL, response.properties().osFeedType());
        Assertions.assertEquals(UpdatePolicy.NO3RD_PARTY_APP_UPDATES, response.properties().updatePolicy());
        Assertions.assertEquals(AllowCrashDumpCollection.DISABLED, response.properties().allowCrashDumpsCollection());
        Assertions.assertEquals(RegionalDataBoundary.NONE, response.properties().regionalDataBoundary());
    }
}
