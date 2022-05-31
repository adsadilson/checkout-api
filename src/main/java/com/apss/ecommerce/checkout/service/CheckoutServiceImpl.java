package com.apss.ecommerce.checkout.service;

import com.apss.ecommerce.checkout.controller.checkout.CheckoutRequest;
import com.apss.ecommerce.checkout.entity.CheckoutEntity;
import com.apss.ecommerce.checkout.repository.CheckoutRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CheckoutServiceImpl implements CheckoutService {

    private  final CheckoutRepository repository;

    @Override
    public Optional<CheckoutEntity> create(CheckoutRequest obj) {
        CheckoutEntity checkout = CheckoutEntity.builder()
                .code(UUID.randomUUID().toString())
                .build();
        return Optional.of(repository.save(checkout));
    }
}
