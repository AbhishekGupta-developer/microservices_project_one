package com.myorganisation.order.controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    @GetMapping("/{id}")
    public ResponseEntity<String> getOrder(@PathVariable Long id) {
        String body = "Returning order details of order id: " + id;

        return new ResponseEntity<>(body, HttpStatusCode.valueOf(200));
    }

    @PostMapping
    public ResponseEntity<String> createOrder() {
        String body = "Creating order on " + new Date();
        return new ResponseEntity<>(body, HttpStatusCode.valueOf(201));
    }
}
