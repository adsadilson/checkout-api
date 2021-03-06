package br.com.apssystem.ecommerce.checkout.enums;

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


