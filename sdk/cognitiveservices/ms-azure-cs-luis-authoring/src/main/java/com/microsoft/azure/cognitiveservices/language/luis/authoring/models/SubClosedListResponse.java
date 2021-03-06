/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.authoring.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Sublist of items for a list entity.
 */
public class SubClosedListResponse extends SubClosedList {
    /**
     * The sublist ID.
     */
    @JsonProperty(value = "id")
    private int id;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public int id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the SubClosedListResponse object itself.
     */
    public SubClosedListResponse withId(int id) {
        this.id = id;
        return this;
    }

}
