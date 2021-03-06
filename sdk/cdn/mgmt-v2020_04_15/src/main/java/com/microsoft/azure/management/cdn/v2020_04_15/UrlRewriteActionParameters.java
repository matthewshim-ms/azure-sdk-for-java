/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_04_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the parameters for the url rewrite action.
 */
public class UrlRewriteActionParameters {
    /**
     * The odatatype property.
     */
    @JsonProperty(value = "@odata\\.type", required = true)
    private String odatatype;

    /**
     * define a request URI pattern that identifies the type of requests that
     * may be rewritten. If value is blank, all strings are matched.
     */
    @JsonProperty(value = "sourcePattern", required = true)
    private String sourcePattern;

    /**
     * Define the relative URL to which the above requests will be rewritten
     * by.
     */
    @JsonProperty(value = "destination", required = true)
    private String destination;

    /**
     * Whether to preserve unmatched path. Default value is true.
     */
    @JsonProperty(value = "preserveUnmatchedPath")
    private Boolean preserveUnmatchedPath;

    /**
     * Creates an instance of UrlRewriteActionParameters class.
     * @param sourcePattern define a request URI pattern that identifies the type of requests that may be rewritten. If value is blank, all strings are matched.
     * @param destination define the relative URL to which the above requests will be rewritten by.
     */
    public UrlRewriteActionParameters() {
        odatatype = "#Microsoft.Azure.Cdn.Models.DeliveryRuleUrlRewriteActionParameters";
    }

    /**
     * Get the odatatype value.
     *
     * @return the odatatype value
     */
    public String odatatype() {
        return this.odatatype;
    }

    /**
     * Set the odatatype value.
     *
     * @param odatatype the odatatype value to set
     * @return the UrlRewriteActionParameters object itself.
     */
    public UrlRewriteActionParameters withOdatatype(String odatatype) {
        this.odatatype = odatatype;
        return this;
    }

    /**
     * Get define a request URI pattern that identifies the type of requests that may be rewritten. If value is blank, all strings are matched.
     *
     * @return the sourcePattern value
     */
    public String sourcePattern() {
        return this.sourcePattern;
    }

    /**
     * Set define a request URI pattern that identifies the type of requests that may be rewritten. If value is blank, all strings are matched.
     *
     * @param sourcePattern the sourcePattern value to set
     * @return the UrlRewriteActionParameters object itself.
     */
    public UrlRewriteActionParameters withSourcePattern(String sourcePattern) {
        this.sourcePattern = sourcePattern;
        return this;
    }

    /**
     * Get define the relative URL to which the above requests will be rewritten by.
     *
     * @return the destination value
     */
    public String destination() {
        return this.destination;
    }

    /**
     * Set define the relative URL to which the above requests will be rewritten by.
     *
     * @param destination the destination value to set
     * @return the UrlRewriteActionParameters object itself.
     */
    public UrlRewriteActionParameters withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Get whether to preserve unmatched path. Default value is true.
     *
     * @return the preserveUnmatchedPath value
     */
    public Boolean preserveUnmatchedPath() {
        return this.preserveUnmatchedPath;
    }

    /**
     * Set whether to preserve unmatched path. Default value is true.
     *
     * @param preserveUnmatchedPath the preserveUnmatchedPath value to set
     * @return the UrlRewriteActionParameters object itself.
     */
    public UrlRewriteActionParameters withPreserveUnmatchedPath(Boolean preserveUnmatchedPath) {
        this.preserveUnmatchedPath = preserveUnmatchedPath;
        return this;
    }

}
