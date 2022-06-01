package com.apss.ecommerce.checkout.Enums;

public enum Status {

    CREATED("Criado"),
    APPROVED("Aprovado"),
    CANCELED("Cancelado");

    private String description;

    Status(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}


