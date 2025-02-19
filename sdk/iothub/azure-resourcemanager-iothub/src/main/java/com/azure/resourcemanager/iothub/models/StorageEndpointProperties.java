// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;

/** The properties of the Azure Storage endpoint for file upload. */
@Fluent
public final class StorageEndpointProperties {
    /*
     * The period of time for which the SAS URI generated by IoT Hub for file upload is valid. See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-file-upload#file-upload-notification-configuration-options.
     */
    @JsonProperty(value = "sasTtlAsIso8601")
    private Duration sasTtlAsIso8601;

    /*
     * The connection string for the Azure Storage account to which files are uploaded.
     */
    @JsonProperty(value = "connectionString", required = true)
    private String connectionString;

    /*
     * The name of the root container where you upload files. The container need not exist but should be creatable
     * using the connectionString specified.
     */
    @JsonProperty(value = "containerName", required = true)
    private String containerName;

    /*
     * Specifies authentication type being used for connecting to the storage account.
     */
    @JsonProperty(value = "authenticationType")
    private AuthenticationType authenticationType;

    /*
     * Managed identity properties of storage endpoint for file upload.
     */
    @JsonProperty(value = "identity")
    private ManagedIdentity identity;

    /** Creates an instance of StorageEndpointProperties class. */
    public StorageEndpointProperties() {
    }

    /**
     * Get the sasTtlAsIso8601 property: The period of time for which the SAS URI generated by IoT Hub for file upload
     * is valid. See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-file-upload#file-upload-notification-configuration-options.
     *
     * @return the sasTtlAsIso8601 value.
     */
    public Duration sasTtlAsIso8601() {
        return this.sasTtlAsIso8601;
    }

    /**
     * Set the sasTtlAsIso8601 property: The period of time for which the SAS URI generated by IoT Hub for file upload
     * is valid. See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-file-upload#file-upload-notification-configuration-options.
     *
     * @param sasTtlAsIso8601 the sasTtlAsIso8601 value to set.
     * @return the StorageEndpointProperties object itself.
     */
    public StorageEndpointProperties withSasTtlAsIso8601(Duration sasTtlAsIso8601) {
        this.sasTtlAsIso8601 = sasTtlAsIso8601;
        return this;
    }

    /**
     * Get the connectionString property: The connection string for the Azure Storage account to which files are
     * uploaded.
     *
     * @return the connectionString value.
     */
    public String connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The connection string for the Azure Storage account to which files are
     * uploaded.
     *
     * @param connectionString the connectionString value to set.
     * @return the StorageEndpointProperties object itself.
     */
    public StorageEndpointProperties withConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the containerName property: The name of the root container where you upload files. The container need not
     * exist but should be creatable using the connectionString specified.
     *
     * @return the containerName value.
     */
    public String containerName() {
        return this.containerName;
    }

    /**
     * Set the containerName property: The name of the root container where you upload files. The container need not
     * exist but should be creatable using the connectionString specified.
     *
     * @param containerName the containerName value to set.
     * @return the StorageEndpointProperties object itself.
     */
    public StorageEndpointProperties withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * Get the authenticationType property: Specifies authentication type being used for connecting to the storage
     * account.
     *
     * @return the authenticationType value.
     */
    public AuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: Specifies authentication type being used for connecting to the storage
     * account.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the StorageEndpointProperties object itself.
     */
    public StorageEndpointProperties withAuthenticationType(AuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the identity property: Managed identity properties of storage endpoint for file upload.
     *
     * @return the identity value.
     */
    public ManagedIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Managed identity properties of storage endpoint for file upload.
     *
     * @param identity the identity value to set.
     * @return the StorageEndpointProperties object itself.
     */
    public StorageEndpointProperties withIdentity(ManagedIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (connectionString() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property connectionString in model StorageEndpointProperties"));
        }
        if (containerName() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property containerName in model StorageEndpointProperties"));
        }
        if (identity() != null) {
            identity().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(StorageEndpointProperties.class);
}
