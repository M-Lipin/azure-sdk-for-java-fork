// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.implementation;

import com.azure.resourcemanager.storagecache.fluent.models.RequiredAmlFilesystemSubnetsSizeInner;
import com.azure.resourcemanager.storagecache.models.RequiredAmlFilesystemSubnetsSize;

public final class RequiredAmlFilesystemSubnetsSizeImpl implements RequiredAmlFilesystemSubnetsSize {
    private RequiredAmlFilesystemSubnetsSizeInner innerObject;

    private final com.azure.resourcemanager.storagecache.StorageCacheManager serviceManager;

    RequiredAmlFilesystemSubnetsSizeImpl(
        RequiredAmlFilesystemSubnetsSizeInner innerObject,
        com.azure.resourcemanager.storagecache.StorageCacheManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Integer filesystemSubnetSize() {
        return this.innerModel().filesystemSubnetSize();
    }

    public RequiredAmlFilesystemSubnetsSizeInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.storagecache.StorageCacheManager manager() {
        return this.serviceManager;
    }
}
