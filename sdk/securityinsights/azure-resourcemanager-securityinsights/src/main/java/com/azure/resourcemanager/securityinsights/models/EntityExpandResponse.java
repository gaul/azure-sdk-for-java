// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.resourcemanager.securityinsights.fluent.models.EntityExpandResponseInner;

/**
 * An immutable client-side representation of EntityExpandResponse.
 */
public interface EntityExpandResponse {
    /**
     * Gets the metadata property: The metadata from the expansion operation results.
     * 
     * @return the metadata value.
     */
    ExpansionResultsMetadata metadata();

    /**
     * Gets the value property: The expansion result values.
     * 
     * @return the value value.
     */
    EntityExpandResponseValue value();

    /**
     * Gets the inner com.azure.resourcemanager.securityinsights.fluent.models.EntityExpandResponseInner object.
     * 
     * @return the inner object.
     */
    EntityExpandResponseInner innerModel();
}
