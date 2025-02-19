// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cognitiveservices.fluent.models.DeploymentInner;
import com.azure.resourcemanager.cognitiveservices.models.Deployment;
import com.azure.resourcemanager.cognitiveservices.models.DeploymentProperties;
import com.azure.resourcemanager.cognitiveservices.models.Sku;

public final class DeploymentImpl implements Deployment, Deployment.Definition, Deployment.Update {
    private DeploymentInner innerObject;

    private final com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public Sku sku() {
        return this.innerModel().sku();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public DeploymentProperties properties() {
        return this.innerModel().properties();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public DeploymentInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String deploymentName;

    public DeploymentImpl withExistingAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public Deployment create() {
        this.innerObject = serviceManager.serviceClient()
            .getDeployments()
            .createOrUpdate(resourceGroupName, accountName, deploymentName, this.innerModel(), Context.NONE);
        return this;
    }

    public Deployment create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getDeployments()
            .createOrUpdate(resourceGroupName, accountName, deploymentName, this.innerModel(), context);
        return this;
    }

    DeploymentImpl(String name, com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager serviceManager) {
        this.innerObject = new DeploymentInner();
        this.serviceManager = serviceManager;
        this.deploymentName = name;
    }

    public DeploymentImpl update() {
        return this;
    }

    public Deployment apply() {
        this.innerObject = serviceManager.serviceClient()
            .getDeployments()
            .createOrUpdate(resourceGroupName, accountName, deploymentName, this.innerModel(), Context.NONE);
        return this;
    }

    public Deployment apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getDeployments()
            .createOrUpdate(resourceGroupName, accountName, deploymentName, this.innerModel(), context);
        return this;
    }

    DeploymentImpl(DeploymentInner innerObject,
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "accounts");
        this.deploymentName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "deployments");
    }

    public Deployment refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getDeployments()
            .getWithResponse(resourceGroupName, accountName, deploymentName, Context.NONE)
            .getValue();
        return this;
    }

    public Deployment refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getDeployments()
            .getWithResponse(resourceGroupName, accountName, deploymentName, context)
            .getValue();
        return this;
    }

    public DeploymentImpl withSku(Sku sku) {
        this.innerModel().withSku(sku);
        return this;
    }

    public DeploymentImpl withProperties(DeploymentProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}
