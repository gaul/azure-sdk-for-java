// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appconfiguration.fluent.models.ApiKeyInner;
import com.azure.resourcemanager.appconfiguration.models.ApiKeyListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ApiKeyListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApiKeyListResult model = BinaryData.fromString(
            "{\"value\":[{\"id\":\"kyfi\",\"name\":\"fidfvzw\",\"value\":\"uht\",\"connectionString\":\"wisdkft\",\"lastModified\":\"2021-06-08T12:42:14Z\",\"readOnly\":true},{\"id\":\"eiwaopvkmi\",\"name\":\"mmxdcu\",\"value\":\"fsrpymzidnse\",\"connectionString\":\"xtbzsgfyccsne\",\"lastModified\":\"2021-01-16T10:20:52Z\",\"readOnly\":false}],\"nextLink\":\"eiachboosflnr\"}")
            .toObject(ApiKeyListResult.class);
        Assertions.assertEquals("eiachboosflnr", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApiKeyListResult model = new ApiKeyListResult().withValue(Arrays.asList(new ApiKeyInner(), new ApiKeyInner()))
            .withNextLink("eiachboosflnr");
        model = BinaryData.fromObject(model).toObject(ApiKeyListResult.class);
        Assertions.assertEquals("eiachboosflnr", model.nextLink());
    }
}
