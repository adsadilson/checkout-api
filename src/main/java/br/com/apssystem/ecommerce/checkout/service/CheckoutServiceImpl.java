package br.com.apssystem.ecommerce.checkout.service;

import br.com.apssystem.ecommerce.checkout.resource.CheckoutRequest;
import br.com.apssystem.ecommerce.checkout.enums.Status;
import br.com.apssystem.ecommerce.checkout.entity.CheckoutEntity;
import br.com.apssystem.ecommerce.checkout.repository.CheckoutRepository;
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
                .status(Status.CREATED)
                .build();
        return Optional.of(repository.save(checkout));
    }
}
