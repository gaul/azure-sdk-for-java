// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

/**
 * Samples for HybridRunbookWorkerGroup Get.
 */
public final class HybridRunbookWorkerGroupGetSamples {
    /*
     * x-ms-original-file: specification/automation/resource-manager/Microsoft.Automation/stable/2022-02-22/examples/
     * getHybridRunbookWorkerGroup.json
     */
    /**
     * Sample code: Get a hybrid worker group.
     * 
     * @param manager Entry point to AutomationManager.
     */
    public static void getAHybridWorkerGroup(com.azure.resourcemanager.automation.AutomationManager manager) {
        manager.hybridRunbookWorkerGroups()
            .getWithResponse("rg", "testaccount", "TestHybridGroup", com.azure.core.util.Context.NONE);
    }
}
