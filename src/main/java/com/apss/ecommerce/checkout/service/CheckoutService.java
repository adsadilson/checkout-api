package com.apss.ecommerce.checkout.service;

import com.apss.ecommerce.checkout.controller.checkout.CheckoutRequest;
import com.apss.ecommerce.checkout.entity.CheckoutEntity;

import java.util.Optional;

public interface CheckoutService {
    Optional<CheckoutEntity> create(CheckoutRequest obj);
}
