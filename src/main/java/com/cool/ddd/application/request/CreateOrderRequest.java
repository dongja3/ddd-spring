package com.cool.ddd.application.request;

import com.cool.ddd.domain.model.Product;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;



public class CreateOrderRequest {
    private Product product;

    @JsonCreator
    public CreateOrderRequest(@JsonProperty("product") final Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }
}
