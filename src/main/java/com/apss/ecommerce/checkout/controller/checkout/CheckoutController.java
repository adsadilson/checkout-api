package com.apss.ecommerce.checkout.controller.checkout;

import com.apss.ecommerce.checkout.service.CheckoutService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/checkout")
@RequiredArgsConstructor
public class CheckoutController {

    private final CheckoutService service;

    @PostMapping("/")
    public ResponseEntity<Void> create(CheckoutRequest obj) {
        service.create(obj);
        return ResponseEntity.ok().build();
    }
}
