// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.resourcemanager.azurestackhci.fluent.models.PasswordCredentialInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of PasswordCredential. */
public interface PasswordCredential {
    /**
     * Gets the secretText property: The secretText property.
     *
     * @return the secretText value.
     */
    String secretText();

    /**
     * Gets the keyId property: The keyId property.
     *
     * @return the keyId value.
     */
    String keyId();

    /**
     * Gets the startDateTime property: The startDateTime property.
     *
     * @return the startDateTime value.
     */
    OffsetDateTime startDateTime();

    /**
     * Gets the endDateTime property: The endDateTime property.
     *
     * @return the endDateTime value.
     */
    OffsetDateTime endDateTime();

    /**
     * Gets the inner com.azure.resourcemanager.azurestackhci.fluent.models.PasswordCredentialInner object.
     *
     * @return the inner object.
     */
    PasswordCredentialInner innerModel();
}
