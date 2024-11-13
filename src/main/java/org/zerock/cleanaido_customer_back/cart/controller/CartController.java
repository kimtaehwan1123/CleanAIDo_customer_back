package org.zerock.cleanaido_customer_back.cart.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.cleanaido_customer_back.cart.dto.CartDetailDTO;
import org.zerock.cleanaido_customer_back.cart.service.CartService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cart")
@Log4j2
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;

    @GetMapping("list")
    public ResponseEntity<List<CartDetailDTO>> list() {

        String customerId = "customer0@aaa.com";
        return ResponseEntity.ok(cartService.listCartDetail(customerId));
    }
}