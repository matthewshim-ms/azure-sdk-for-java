/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.machinelearningservices.v2019_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Settings for user account that gets created on each on the nodes of a
 * compute.
 */
public class UserAccountCredentials {
    /**
     * User name.
     * Name of the administrator user account which can be used to SSH to
     * nodes.
     */
    @JsonProperty(value = "adminUserName", required = true)
    private String adminUserName;

    /**
     * SSH public key.
     * SSH public key of the administrator user account.
     */
    @JsonProperty(value = "adminUserSshPublicKey")
    private String adminUserSshPublicKey;

    /**
     * Password.
     * Password of the administrator user account.
     */
    @JsonProperty(value = "adminUserPassword")
    private String adminUserPassword;

    /**
     * Get name of the administrator user account which can be used to SSH to nodes.
     *
     * @return the adminUserName value
     */
    public String adminUserName() {
        return this.adminUserName;
    }

    /**
     * Set name of the administrator user account which can be used to SSH to nodes.
     *
     * @param adminUserName the adminUserName value to set
     * @return the UserAccountCredentials object itself.
     */
    public UserAccountCredentials withAdminUserName(String adminUserName) {
        this.adminUserName = adminUserName;
        return this;
    }

    /**
     * Get sSH public key of the administrator user account.
     *
     * @return the adminUserSshPublicKey value
     */
    public String adminUserSshPublicKey() {
        return this.adminUserSshPublicKey;
    }

    /**
     * Set sSH public key of the administrator user account.
     *
     * @param adminUserSshPublicKey the adminUserSshPublicKey value to set
     * @return the UserAccountCredentials object itself.
     */
    public UserAccountCredentials withAdminUserSshPublicKey(String adminUserSshPublicKey) {
        this.adminUserSshPublicKey = adminUserSshPublicKey;
        return this;
    }

    /**
     * Get password of the administrator user account.
     *
     * @return the adminUserPassword value
     */
    public String adminUserPassword() {
        return this.adminUserPassword;
    }

    /**
     * Set password of the administrator user account.
     *
     * @param adminUserPassword the adminUserPassword value to set
     * @return the UserAccountCredentials object itself.
     */
    public UserAccountCredentials withAdminUserPassword(String adminUserPassword) {
        this.adminUserPassword = adminUserPassword;
        return this;
    }

}