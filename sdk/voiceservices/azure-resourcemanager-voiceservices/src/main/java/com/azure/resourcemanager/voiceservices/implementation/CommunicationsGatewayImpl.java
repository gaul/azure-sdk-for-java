// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.voiceservices.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.voiceservices.fluent.models.CommunicationsGatewayInner;
import com.azure.resourcemanager.voiceservices.models.AutoGeneratedDomainNameLabelScope;
import com.azure.resourcemanager.voiceservices.models.CommunicationsGateway;
import com.azure.resourcemanager.voiceservices.models.CommunicationsGatewayUpdate;
import com.azure.resourcemanager.voiceservices.models.CommunicationsPlatform;
import com.azure.resourcemanager.voiceservices.models.Connectivity;
import com.azure.resourcemanager.voiceservices.models.E911Type;
import com.azure.resourcemanager.voiceservices.models.ProvisioningState;
import com.azure.resourcemanager.voiceservices.models.ServiceRegionProperties;
import com.azure.resourcemanager.voiceservices.models.Status;
import com.azure.resourcemanager.voiceservices.models.TeamsCodecs;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class CommunicationsGatewayImpl
    implements CommunicationsGateway, CommunicationsGateway.Definition, CommunicationsGateway.Update {
    private CommunicationsGatewayInner innerObject;

    private final com.azure.resourcemanager.voiceservices.VoiceServicesManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Status status() {
        return this.innerModel().status();
    }

    public List<ServiceRegionProperties> serviceLocations() {
        List<ServiceRegionProperties> inner = this.innerModel().serviceLocations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Connectivity connectivity() {
        return this.innerModel().connectivity();
    }

    public List<TeamsCodecs> codecs() {
        List<TeamsCodecs> inner = this.innerModel().codecs();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public E911Type e911Type() {
        return this.innerModel().e911Type();
    }

    public List<CommunicationsPlatform> platforms() {
        List<CommunicationsPlatform> inner = this.innerModel().platforms();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Object apiBridge() {
        return this.innerModel().apiBridge();
    }

    public AutoGeneratedDomainNameLabelScope autoGeneratedDomainNameLabelScope() {
        return this.innerModel().autoGeneratedDomainNameLabelScope();
    }

    public String autoGeneratedDomainNameLabel() {
        return this.innerModel().autoGeneratedDomainNameLabel();
    }

    public String teamsVoicemailPilotNumber() {
        return this.innerModel().teamsVoicemailPilotNumber();
    }

    public Boolean onPremMcpEnabled() {
        return this.innerModel().onPremMcpEnabled();
    }

    public List<String> emergencyDialStrings() {
        List<String> inner = this.innerModel().emergencyDialStrings();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public CommunicationsGatewayInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.voiceservices.VoiceServicesManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String communicationsGatewayName;

    private CommunicationsGatewayUpdate updateProperties;

    public CommunicationsGatewayImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public CommunicationsGateway create() {
        this.innerObject = serviceManager.serviceClient()
            .getCommunicationsGateways()
            .createOrUpdate(resourceGroupName, communicationsGatewayName, this.innerModel(), Context.NONE);
        return this;
    }

    public CommunicationsGateway create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getCommunicationsGateways()
            .createOrUpdate(resourceGroupName, communicationsGatewayName, this.innerModel(), context);
        return this;
    }

    CommunicationsGatewayImpl(String name,
        com.azure.resourcemanager.voiceservices.VoiceServicesManager serviceManager) {
        this.innerObject = new CommunicationsGatewayInner();
        this.serviceManager = serviceManager;
        this.communicationsGatewayName = name;
    }

    public CommunicationsGatewayImpl update() {
        this.updateProperties = new CommunicationsGatewayUpdate();
        return this;
    }

    public CommunicationsGateway apply() {
        this.innerObject = serviceManager.serviceClient()
            .getCommunicationsGateways()
            .updateWithResponse(resourceGroupName, communicationsGatewayName, updateProperties, Context.NONE)
            .getValue();
        return this;
    }

    public CommunicationsGateway apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getCommunicationsGateways()
            .updateWithResponse(resourceGroupName, communicationsGatewayName, updateProperties, context)
            .getValue();
        return this;
    }

    CommunicationsGatewayImpl(CommunicationsGatewayInner innerObject,
        com.azure.resourcemanager.voiceservices.VoiceServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.communicationsGatewayName = Utils.getValueFromIdByName(innerObject.id(), "communicationsGateways");
    }

    public CommunicationsGateway refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getCommunicationsGateways()
            .getByResourceGroupWithResponse(resourceGroupName, communicationsGatewayName, Context.NONE)
            .getValue();
        return this;
    }

    public CommunicationsGateway refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getCommunicationsGateways()
            .getByResourceGroupWithResponse(resourceGroupName, communicationsGatewayName, context)
            .getValue();
        return this;
    }

    public CommunicationsGatewayImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public CommunicationsGatewayImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public CommunicationsGatewayImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateProperties.withTags(tags);
            return this;
        }
    }

    public CommunicationsGatewayImpl withServiceLocations(List<ServiceRegionProperties> serviceLocations) {
        this.innerModel().withServiceLocations(serviceLocations);
        return this;
    }

    public CommunicationsGatewayImpl withConnectivity(Connectivity connectivity) {
        this.innerModel().withConnectivity(connectivity);
        return this;
    }

    public CommunicationsGatewayImpl withCodecs(List<TeamsCodecs> codecs) {
        this.innerModel().withCodecs(codecs);
        return this;
    }

    public CommunicationsGatewayImpl withE911Type(E911Type e911Type) {
        this.innerModel().withE911Type(e911Type);
        return this;
    }

    public CommunicationsGatewayImpl withPlatforms(List<CommunicationsPlatform> platforms) {
        this.innerModel().withPlatforms(platforms);
        return this;
    }

    public CommunicationsGatewayImpl withApiBridge(Object apiBridge) {
        this.innerModel().withApiBridge(apiBridge);
        return this;
    }

    public CommunicationsGatewayImpl
        withAutoGeneratedDomainNameLabelScope(AutoGeneratedDomainNameLabelScope autoGeneratedDomainNameLabelScope) {
        this.innerModel().withAutoGeneratedDomainNameLabelScope(autoGeneratedDomainNameLabelScope);
        return this;
    }

    public CommunicationsGatewayImpl withTeamsVoicemailPilotNumber(String teamsVoicemailPilotNumber) {
        this.innerModel().withTeamsVoicemailPilotNumber(teamsVoicemailPilotNumber);
        return this;
    }

    public CommunicationsGatewayImpl withOnPremMcpEnabled(Boolean onPremMcpEnabled) {
        this.innerModel().withOnPremMcpEnabled(onPremMcpEnabled);
        return this;
    }

    public CommunicationsGatewayImpl withEmergencyDialStrings(List<String> emergencyDialStrings) {
        this.innerModel().withEmergencyDialStrings(emergencyDialStrings);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
