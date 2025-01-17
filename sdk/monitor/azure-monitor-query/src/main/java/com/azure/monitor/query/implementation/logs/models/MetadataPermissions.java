// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.implementation.logs.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Permission information.
 *
 * <p>Permission information for the metadata call, includes apps/workspaces/resource the user didn't have access to.
 */
@Fluent
public final class MetadataPermissions {
    /*
     * The permission indication for the workspaces on the metadata request.
     */
    @JsonProperty(value = "workspaces", required = true)
    private List<MetadataPermissionsWorkspacesItem> workspaces;

    /*
     * The permission indication for the Azure resources on the metadata request.
     */
    @JsonProperty(value = "resources")
    private List<MetadataPermissionsResourcesItem> resources;

    /*
     * The permission indication for the Application Insights apps on the metadata request.
     */
    @JsonProperty(value = "applications")
    private List<MetadataPermissionsApplicationsItem> applications;

    /**
     * Creates an instance of MetadataPermissions class.
     *
     * @param workspaces the workspaces value to set.
     */
    @JsonCreator
    public MetadataPermissions(
            @JsonProperty(value = "workspaces", required = true) List<MetadataPermissionsWorkspacesItem> workspaces) {
        this.workspaces = workspaces;
    }

    /**
     * Get the workspaces property: The permission indication for the workspaces on the metadata request.
     *
     * @return the workspaces value.
     */
    public List<MetadataPermissionsWorkspacesItem> getWorkspaces() {
        return this.workspaces;
    }

    /**
     * Get the resources property: The permission indication for the Azure resources on the metadata request.
     *
     * @return the resources value.
     */
    public List<MetadataPermissionsResourcesItem> getResources() {
        return this.resources;
    }

    /**
     * Set the resources property: The permission indication for the Azure resources on the metadata request.
     *
     * @param resources the resources value to set.
     * @return the MetadataPermissions object itself.
     */
    public MetadataPermissions setResources(List<MetadataPermissionsResourcesItem> resources) {
        this.resources = resources;
        return this;
    }

    /**
     * Get the applications property: The permission indication for the Application Insights apps on the metadata
     * request.
     *
     * @return the applications value.
     */
    public List<MetadataPermissionsApplicationsItem> getApplications() {
        return this.applications;
    }

    /**
     * Set the applications property: The permission indication for the Application Insights apps on the metadata
     * request.
     *
     * @param applications the applications value to set.
     * @return the MetadataPermissions object itself.
     */
    public MetadataPermissions setApplications(List<MetadataPermissionsApplicationsItem> applications) {
        this.applications = applications;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getWorkspaces() == null) {
            throw new IllegalArgumentException("Missing required property workspaces in model MetadataPermissions");
        } else {
            getWorkspaces().forEach(e -> e.validate());
        }
        if (getResources() != null) {
            getResources().forEach(e -> e.validate());
        }
        if (getApplications() != null) {
            getApplications().forEach(e -> e.validate());
        }
    }
}
