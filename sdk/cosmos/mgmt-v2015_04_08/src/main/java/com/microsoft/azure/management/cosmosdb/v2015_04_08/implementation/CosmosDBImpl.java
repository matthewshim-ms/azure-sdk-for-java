/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2015_04_08.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the CosmosDBImpl class.
 */
public class CosmosDBImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** Azure subscription ID. */
    private String subscriptionId;

    /**
     * Gets Azure subscription ID.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets Azure subscription ID.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public CosmosDBImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** Version of the API to be used with the client request. The current version is 2015-04-08. */
    private String apiVersion;

    /**
     * Gets Version of the API to be used with the client request. The current version is 2015-04-08.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /** The preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets The preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets The preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public CosmosDBImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** The retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public CosmosDBImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public CosmosDBImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The DatabaseAccountsInner object to access its operations.
     */
    private DatabaseAccountsInner databaseAccounts;

    /**
     * Gets the DatabaseAccountsInner object to access its operations.
     * @return the DatabaseAccountsInner object.
     */
    public DatabaseAccountsInner databaseAccounts() {
        return this.databaseAccounts;
    }

    /**
     * The OperationsInner object to access its operations.
     */
    private OperationsInner operations;

    /**
     * Gets the OperationsInner object to access its operations.
     * @return the OperationsInner object.
     */
    public OperationsInner operations() {
        return this.operations;
    }

    /**
     * The DatabasesInner object to access its operations.
     */
    private DatabasesInner databases;

    /**
     * Gets the DatabasesInner object to access its operations.
     * @return the DatabasesInner object.
     */
    public DatabasesInner databases() {
        return this.databases;
    }

    /**
     * The CollectionsInner object to access its operations.
     */
    private CollectionsInner collections;

    /**
     * Gets the CollectionsInner object to access its operations.
     * @return the CollectionsInner object.
     */
    public CollectionsInner collections() {
        return this.collections;
    }

    /**
     * The CollectionRegionsInner object to access its operations.
     */
    private CollectionRegionsInner collectionRegions;

    /**
     * Gets the CollectionRegionsInner object to access its operations.
     * @return the CollectionRegionsInner object.
     */
    public CollectionRegionsInner collectionRegions() {
        return this.collectionRegions;
    }

    /**
     * The DatabaseAccountRegionsInner object to access its operations.
     */
    private DatabaseAccountRegionsInner databaseAccountRegions;

    /**
     * Gets the DatabaseAccountRegionsInner object to access its operations.
     * @return the DatabaseAccountRegionsInner object.
     */
    public DatabaseAccountRegionsInner databaseAccountRegions() {
        return this.databaseAccountRegions;
    }

    /**
     * The PercentileSourceTargetsInner object to access its operations.
     */
    private PercentileSourceTargetsInner percentileSourceTargets;

    /**
     * Gets the PercentileSourceTargetsInner object to access its operations.
     * @return the PercentileSourceTargetsInner object.
     */
    public PercentileSourceTargetsInner percentileSourceTargets() {
        return this.percentileSourceTargets;
    }

    /**
     * The PercentileTargetsInner object to access its operations.
     */
    private PercentileTargetsInner percentileTargets;

    /**
     * Gets the PercentileTargetsInner object to access its operations.
     * @return the PercentileTargetsInner object.
     */
    public PercentileTargetsInner percentileTargets() {
        return this.percentileTargets;
    }

    /**
     * The PercentilesInner object to access its operations.
     */
    private PercentilesInner percentiles;

    /**
     * Gets the PercentilesInner object to access its operations.
     * @return the PercentilesInner object.
     */
    public PercentilesInner percentiles() {
        return this.percentiles;
    }

    /**
     * The CollectionPartitionRegionsInner object to access its operations.
     */
    private CollectionPartitionRegionsInner collectionPartitionRegions;

    /**
     * Gets the CollectionPartitionRegionsInner object to access its operations.
     * @return the CollectionPartitionRegionsInner object.
     */
    public CollectionPartitionRegionsInner collectionPartitionRegions() {
        return this.collectionPartitionRegions;
    }

    /**
     * The CollectionPartitionsInner object to access its operations.
     */
    private CollectionPartitionsInner collectionPartitions;

    /**
     * Gets the CollectionPartitionsInner object to access its operations.
     * @return the CollectionPartitionsInner object.
     */
    public CollectionPartitionsInner collectionPartitions() {
        return this.collectionPartitions;
    }

    /**
     * The PartitionKeyRangeIdsInner object to access its operations.
     */
    private PartitionKeyRangeIdsInner partitionKeyRangeIds;

    /**
     * Gets the PartitionKeyRangeIdsInner object to access its operations.
     * @return the PartitionKeyRangeIdsInner object.
     */
    public PartitionKeyRangeIdsInner partitionKeyRangeIds() {
        return this.partitionKeyRangeIds;
    }

    /**
     * The PartitionKeyRangeIdRegionsInner object to access its operations.
     */
    private PartitionKeyRangeIdRegionsInner partitionKeyRangeIdRegions;

    /**
     * Gets the PartitionKeyRangeIdRegionsInner object to access its operations.
     * @return the PartitionKeyRangeIdRegionsInner object.
     */
    public PartitionKeyRangeIdRegionsInner partitionKeyRangeIdRegions() {
        return this.partitionKeyRangeIdRegions;
    }

    /**
     * Initializes an instance of CosmosDB client.
     *
     * @param credentials the management credentials for Azure
     */
    public CosmosDBImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of CosmosDB client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public CosmosDBImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of CosmosDB client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public CosmosDBImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2015-04-08";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.databaseAccounts = new DatabaseAccountsInner(restClient().retrofit(), this);
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.databases = new DatabasesInner(restClient().retrofit(), this);
        this.collections = new CollectionsInner(restClient().retrofit(), this);
        this.collectionRegions = new CollectionRegionsInner(restClient().retrofit(), this);
        this.databaseAccountRegions = new DatabaseAccountRegionsInner(restClient().retrofit(), this);
        this.percentileSourceTargets = new PercentileSourceTargetsInner(restClient().retrofit(), this);
        this.percentileTargets = new PercentileTargetsInner(restClient().retrofit(), this);
        this.percentiles = new PercentilesInner(restClient().retrofit(), this);
        this.collectionPartitionRegions = new CollectionPartitionRegionsInner(restClient().retrofit(), this);
        this.collectionPartitions = new CollectionPartitionsInner(restClient().retrofit(), this);
        this.partitionKeyRangeIds = new PartitionKeyRangeIdsInner(restClient().retrofit(), this);
        this.partitionKeyRangeIdRegions = new PartitionKeyRangeIdRegionsInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s, auto-generated)", super.userAgent(), "CosmosDB", "2015-04-08");
    }
}
