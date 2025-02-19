// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.synapse.models.EntityResource;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * SparkConfiguration response details.
 */
@Fluent
public final class SparkConfigurationResourceInner extends EntityResource {
    /*
     * SparkConfiguration properties.
     */
    private SparkConfigurationInfo innerProperties = new SparkConfigurationInfo();

    /*
     * Resource Etag.
     */
    private String etag;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of SparkConfigurationResourceInner class.
     */
    public SparkConfigurationResourceInner() {
    }

    /**
     * Get the innerProperties property: SparkConfiguration properties.
     * 
     * @return the innerProperties value.
     */
    private SparkConfigurationInfo innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: Resource Etag.
     * 
     * @return the etag value.
     */
    @Override
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the description property: Description about the SparkConfiguration.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Description about the SparkConfiguration.
     * 
     * @param description the description value to set.
     * @return the SparkConfigurationResourceInner object itself.
     */
    public SparkConfigurationResourceInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SparkConfigurationInfo();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the configs property: SparkConfiguration configs.
     * 
     * @return the configs value.
     */
    public Map<String, String> configs() {
        return this.innerProperties() == null ? null : this.innerProperties().configs();
    }

    /**
     * Set the configs property: SparkConfiguration configs.
     * 
     * @param configs the configs value to set.
     * @return the SparkConfigurationResourceInner object itself.
     */
    public SparkConfigurationResourceInner withConfigs(Map<String, String> configs) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SparkConfigurationInfo();
        }
        this.innerProperties().withConfigs(configs);
        return this;
    }

    /**
     * Get the annotations property: Annotations for SparkConfiguration.
     * 
     * @return the annotations value.
     */
    public List<String> annotations() {
        return this.innerProperties() == null ? null : this.innerProperties().annotations();
    }

    /**
     * Set the annotations property: Annotations for SparkConfiguration.
     * 
     * @param annotations the annotations value to set.
     * @return the SparkConfigurationResourceInner object itself.
     */
    public SparkConfigurationResourceInner withAnnotations(List<String> annotations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SparkConfigurationInfo();
        }
        this.innerProperties().withAnnotations(annotations);
        return this;
    }

    /**
     * Get the notes property: additional Notes.
     * 
     * @return the notes value.
     */
    public String notes() {
        return this.innerProperties() == null ? null : this.innerProperties().notes();
    }

    /**
     * Set the notes property: additional Notes.
     * 
     * @param notes the notes value to set.
     * @return the SparkConfigurationResourceInner object itself.
     */
    public SparkConfigurationResourceInner withNotes(String notes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SparkConfigurationInfo();
        }
        this.innerProperties().withNotes(notes);
        return this;
    }

    /**
     * Get the createdBy property: The identity that created the resource.
     * 
     * @return the createdBy value.
     */
    public String createdBy() {
        return this.innerProperties() == null ? null : this.innerProperties().createdBy();
    }

    /**
     * Set the createdBy property: The identity that created the resource.
     * 
     * @param createdBy the createdBy value to set.
     * @return the SparkConfigurationResourceInner object itself.
     */
    public SparkConfigurationResourceInner withCreatedBy(String createdBy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SparkConfigurationInfo();
        }
        this.innerProperties().withCreatedBy(createdBy);
        return this;
    }

    /**
     * Get the created property: The timestamp of resource creation.
     * 
     * @return the created value.
     */
    public OffsetDateTime created() {
        return this.innerProperties() == null ? null : this.innerProperties().created();
    }

    /**
     * Set the created property: The timestamp of resource creation.
     * 
     * @param created the created value to set.
     * @return the SparkConfigurationResourceInner object itself.
     */
    public SparkConfigurationResourceInner withCreated(OffsetDateTime created) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SparkConfigurationInfo();
        }
        this.innerProperties().withCreated(created);
        return this;
    }

    /**
     * Get the configMergeRule property: SparkConfiguration merge configs.
     * 
     * @return the configMergeRule value.
     */
    public Map<String, String> configMergeRule() {
        return this.innerProperties() == null ? null : this.innerProperties().configMergeRule();
    }

    /**
     * Set the configMergeRule property: SparkConfiguration merge configs.
     * 
     * @param configMergeRule the configMergeRule value to set.
     * @return the SparkConfigurationResourceInner object itself.
     */
    public SparkConfigurationResourceInner withConfigMergeRule(Map<String, String> configMergeRule) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SparkConfigurationInfo();
        }
        this.innerProperties().withConfigMergeRule(configMergeRule);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerProperties in model SparkConfigurationResourceInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SparkConfigurationResourceInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SparkConfigurationResourceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SparkConfigurationResourceInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SparkConfigurationResourceInner.
     */
    public static SparkConfigurationResourceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SparkConfigurationResourceInner deserializedSparkConfigurationResourceInner
                = new SparkConfigurationResourceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedSparkConfigurationResourceInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedSparkConfigurationResourceInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedSparkConfigurationResourceInner.type = reader.getString();
                } else if ("etag".equals(fieldName)) {
                    deserializedSparkConfigurationResourceInner.etag = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedSparkConfigurationResourceInner.innerProperties
                        = SparkConfigurationInfo.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSparkConfigurationResourceInner;
        });
    }
}
