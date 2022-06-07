package br.com.apssystem.ecommerce.checkout.resource;

import br.com.apssystem.ecommerce.checkout.entity.CheckoutEntity;
import br.com.apssystem.ecommerce.checkout.service.CheckoutService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/checkouts")
@RequiredArgsConstructor
public class CheckoutResource {

    private final CheckoutService service;

    @PostMapping("/")
    public ResponseEntity<CheckoutResponse> create(CheckoutRequest obj) {
        final CheckoutEntity checkoutEntity = service.create(obj).orElseThrow();
        CheckoutResponse response = CheckoutResponse.builder()
                .code(checkoutEntity.getCode())
                .build();

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
