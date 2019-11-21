/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.ProductSubscriptions;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.ProductSubscriptionContract;

class ProductSubscriptionsImpl extends WrapperImpl<ProductSubscriptionsInner> implements ProductSubscriptions {
    private final ApiManagementManager manager;

    ProductSubscriptionsImpl(ApiManagementManager manager) {
        super(manager.inner().productSubscriptions());
        this.manager = manager;
    }

    public ApiManagementManager manager() {
        return this.manager;
    }

    private ProductSubscriptionContractImpl wrapModel(SubscriptionContractInner inner) {
        return  new ProductSubscriptionContractImpl(inner, manager());
    }

    @Override
    public Observable<ProductSubscriptionContract> listAsync(final String resourceGroupName, final String serviceName, final String productId) {
        ProductSubscriptionsInner client = this.inner();
        return client.listAsync(resourceGroupName, serviceName, productId)
        .flatMapIterable(new Func1<Page<SubscriptionContractInner>, Iterable<SubscriptionContractInner>>() {
            @Override
            public Iterable<SubscriptionContractInner> call(Page<SubscriptionContractInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SubscriptionContractInner, ProductSubscriptionContract>() {
            @Override
            public ProductSubscriptionContract call(SubscriptionContractInner inner) {
                return wrapModel(inner);
            }
        });
    }

}