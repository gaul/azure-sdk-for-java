// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * KubernetesClusterRestartNodeParameters represents the body of the request to restart the node of a Kubernetes
 * cluster.
 */
@Fluent
public final class KubernetesClusterRestartNodeParameters {
    /*
     * The name of the node to restart.
     */
    @JsonProperty(value = "nodeName", required = true)
    private String nodeName;

    /** Creates an instance of KubernetesClusterRestartNodeParameters class. */
    public KubernetesClusterRestartNodeParameters() {
    }

    /**
     * Get the nodeName property: The name of the node to restart.
     *
     * @return the nodeName value.
     */
    public String nodeName() {
        return this.nodeName;
    }

    /**
     * Set the nodeName property: The name of the node to restart.
     *
     * @param nodeName the nodeName value to set.
     * @return the KubernetesClusterRestartNodeParameters object itself.
     */
    public KubernetesClusterRestartNodeParameters withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (nodeName() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property nodeName in model KubernetesClusterRestartNodeParameters"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(KubernetesClusterRestartNodeParameters.class);
}
