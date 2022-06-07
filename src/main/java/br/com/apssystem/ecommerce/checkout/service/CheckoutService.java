package br.com.apssystem.ecommerce.checkout.service;

import br.com.apssystem.ecommerce.checkout.resource.CheckoutRequest;
import br.com.apssystem.ecommerce.checkout.entity.CheckoutEntity;

import java.util.Optional;

public interface CheckoutService {
    Optional<CheckoutEntity> create(CheckoutRequest obj);
}
