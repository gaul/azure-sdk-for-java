// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.networkcloud.NetworkCloudManager;
import com.azure.resourcemanager.networkcloud.models.OperationStatusResult;
import com.azure.resourcemanager.networkcloud.models.SkipShutdown;
import com.azure.resourcemanager.networkcloud.models.VirtualMachinePowerOffParameters;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class VirtualMachinesPowerOffMockTests {
    @Test
    public void testPowerOff() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"id\":\"zfova\",\"resourceId\":\"rvaprtgelgwe\",\"name\":\"kfyaqandmymnq\",\"status\":\"qjumovs\",\"percentComplete\":99.1592,\"startTime\":\"2021-07-04T13:36:07Z\",\"endTime\":\"2021-07-05T03:23:03Z\",\"operations\":[{\"id\":\"mfmvsmc\",\"resourceId\":\"xfaxdtnq\",\"name\":\"bsat\",\"status\":\"oiauesugmocpcj\",\"percentComplete\":19.800335,\"startTime\":\"2021-09-12T18:19:26Z\",\"endTime\":\"2021-09-30T20:45:51Z\",\"operations\":[{\"id\":\"wfldsiuorinik\",\"resourceId\":\"dpk\",\"name\":\"iwm\",\"status\":\"tmqrxrzqv\",\"percentComplete\":79.912384,\"startTime\":\"2021-05-04T07:33:29Z\",\"endTime\":\"2020-12-22T20:01:34Z\",\"operations\":[{\"status\":\"tg\"},{\"status\":\"bxiqahragpxmibpl\"}]},{\"id\":\"o\",\"resourceId\":\"yefqmwovyztx\",\"name\":\"omfpb\",\"status\":\"ceeg\",\"percentComplete\":76.99202,\"startTime\":\"2021-03-19T02:35:38Z\",\"endTime\":\"2021-06-22T16:53:33Z\",\"operations\":[{\"status\":\"nji\"},{\"status\":\"l\"},{\"status\":\"kkreh\"}]},{\"id\":\"mjodu\",\"resourceId\":\"vulxfar\",\"name\":\"vjlgdez\",\"status\":\"jqwahoyi\",\"percentComplete\":24.621027,\"startTime\":\"2021-05-10T10:57:12Z\",\"endTime\":\"2021-03-12T00:08:49Z\",\"operations\":[{\"status\":\"wtc\"}]},{\"id\":\"dn\",\"resourceId\":\"vbooqbmdqrxy\",\"name\":\"ae\",\"status\":\"scflwtjdtlri\",\"percentComplete\":15.551186,\"startTime\":\"2021-01-15T17:14:16Z\",\"endTime\":\"2021-06-05T19:31:26Z\",\"operations\":[{\"status\":\"dtzcqi\"},{\"status\":\"sdudgcoz\"},{\"status\":\"omehx\"},{\"status\":\"antolamlbijuxkq\"}]}]},{\"id\":\"i\",\"resourceId\":\"wdtgckzdqiqdl\",\"name\":\"trkwxo\",\"status\":\"uwxsuykznhrfgsl\",\"percentComplete\":76.29438,\"startTime\":\"2021-03-17T10:19:29Z\",\"endTime\":\"2021-04-04T13:51:46Z\",\"operations\":[{\"id\":\"huioaeoc\",\"resourceId\":\"jtfeyvkbdgddkr\",\"name\":\"ccxbeuuqutkz\",\"status\":\"tjwwg\",\"percentComplete\":63.36705,\"startTime\":\"2021-05-01T01:18:11Z\",\"endTime\":\"2020-12-25T15:40:25Z\",\"operations\":[{\"status\":\"nondegjdyd\"}]},{\"id\":\"kkbjuckcatuq\",\"resourceId\":\"powcnxtpzdlys\",\"name\":\"dtoakatpryt\",\"status\":\"rhzbqfdpfaw\",\"percentComplete\":82.89093,\"startTime\":\"2021-06-23T18:35:29Z\",\"endTime\":\"2021-03-06T14:26:54Z\",\"operations\":[{\"status\":\"utzcttbqgdirda\"},{\"status\":\"m\"}]},{\"id\":\"gcfjfxtbwjjirmu\",\"resourceId\":\"gftt\",\"name\":\"ofgeoagf\",\"status\":\"oftnxodwxm\",\"percentComplete\":93.54171,\"startTime\":\"2021-06-01T19:09:40Z\",\"endTime\":\"2021-01-22T01:23:44Z\",\"operations\":[{\"status\":\"sevmdmzenlrstg\"},{\"status\":\"czljdnci\"}]}]},{\"id\":\"amyyznmrgcdogcv\",\"resourceId\":\"gytoxuwhtt\",\"name\":\"qsaqmebgszplu\",\"status\":\"dekpdzzmssg\",\"percentComplete\":98.44238,\"startTime\":\"2021-09-27T12:48:36Z\",\"endTime\":\"2020-12-25T21:06:22Z\",\"operations\":[{\"id\":\"bdqzsqunycwz\",\"resourceId\":\"vvw\",\"name\":\"mrkkyjtr\",\"status\":\"pwpwfkcauxuva\",\"percentComplete\":36.006676,\"startTime\":\"2021-01-12T22:16:55Z\",\"endTime\":\"2021-01-27T14:31:15Z\",\"operations\":[{\"status\":\"ckcl\"},{\"status\":\"txluevs\"},{\"status\":\"lzwilfngojf\"},{\"status\":\"qebuuxjxhfxfjwp\"}]},{\"id\":\"tpmbmxbmbrwgz\",\"resourceId\":\"ljbkhxsdplau\",\"name\":\"dmhweqjfyxydgto\",\"status\":\"vq\",\"percentComplete\":52.457535,\"startTime\":\"2021-09-14T09:59:06Z\",\"endTime\":\"2021-05-30T12:55:16Z\",\"operations\":[{\"status\":\"vxakglh\"},{\"status\":\"ses\"},{\"status\":\"fga\"},{\"status\":\"qiy\"}]}]},{\"id\":\"gdhyhgoq\",\"resourceId\":\"oyqyxyjrcbqpb\",\"name\":\"pglqjo\",\"status\":\"tdahneaoovtyjzti\",\"percentComplete\":70.834885,\"startTime\":\"2021-06-17T15:12:27Z\",\"endTime\":\"2021-10-22T05:39:36Z\",\"operations\":[{\"id\":\"fsr\",\"resourceId\":\"uklajvcfoc\",\"name\":\"apejovtkwx\",\"status\":\"hwhhnoyrzaaoe\",\"percentComplete\":26.431053,\"startTime\":\"2021-11-18T14:44:42Z\",\"endTime\":\"2021-08-16T00:53:56Z\",\"operations\":[{\"status\":\"eat\"},{\"status\":\"axxcrxoxdj\"}]},{\"id\":\"n\",\"resourceId\":\"yyi\",\"name\":\"kd\",\"status\":\"lrndwdbvxvza\",\"percentComplete\":25.453287,\"startTime\":\"2021-10-20T20:05:42Z\",\"endTime\":\"2021-01-09T13:50:06Z\",\"operations\":[{\"status\":\"nkfthmcxqqxmyz\"},{\"status\":\"laoanpohrvmz\"},{\"status\":\"qr\"}]}]}]}";

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

        NetworkCloudManager manager = NetworkCloudManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        OperationStatusResult response = manager.virtualMachines()
            .powerOff("uworimmov", "wdehk", new VirtualMachinePowerOffParameters().withSkipShutdown(SkipShutdown.TRUE),
                com.azure.core.util.Context.NONE);

        Assertions.assertEquals("zfova", response.id());
        Assertions.assertEquals("kfyaqandmymnq", response.name());
        Assertions.assertEquals("qjumovs", response.status());
        Assertions.assertEquals(99.1592F, response.percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-04T13:36:07Z"), response.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-05T03:23:03Z"), response.endTime());
        Assertions.assertEquals("mfmvsmc", response.operations().get(0).id());
        Assertions.assertEquals("bsat", response.operations().get(0).name());
        Assertions.assertEquals("oiauesugmocpcj", response.operations().get(0).status());
        Assertions.assertEquals(19.800335F, response.operations().get(0).percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-12T18:19:26Z"), response.operations().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-30T20:45:51Z"), response.operations().get(0).endTime());
        Assertions.assertEquals("wfldsiuorinik", response.operations().get(0).operations().get(0).id());
        Assertions.assertEquals("iwm", response.operations().get(0).operations().get(0).name());
        Assertions.assertEquals("tmqrxrzqv", response.operations().get(0).operations().get(0).status());
        Assertions.assertEquals(79.912384F, response.operations().get(0).operations().get(0).percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-04T07:33:29Z"),
            response.operations().get(0).operations().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-22T20:01:34Z"),
            response.operations().get(0).operations().get(0).endTime());
        Assertions.assertEquals("tg", response.operations().get(0).operations().get(0).operations().get(0).status());
    }
}
