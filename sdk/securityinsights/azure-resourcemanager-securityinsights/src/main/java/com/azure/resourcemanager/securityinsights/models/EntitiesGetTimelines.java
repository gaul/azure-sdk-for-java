// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of EntitiesGetTimelines.
 */
public interface EntitiesGetTimelines {
    /**
     * Timeline for an entity.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param entityId entity ID.
     * @param parameters The parameters required to execute an timeline operation on the given entity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the entity timeline result operation response along with {@link Response}.
     */
    Response<EntityTimelineResponse> listWithResponse(String resourceGroupName, String workspaceName, String entityId,
        EntityTimelineParameters parameters, Context context);

    /**
     * Timeline for an entity.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param entityId entity ID.
     * @param parameters The parameters required to execute an timeline operation on the given entity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the entity timeline result operation response.
     */
    EntityTimelineResponse list(String resourceGroupName, String workspaceName, String entityId,
        EntityTimelineParameters parameters);
}
