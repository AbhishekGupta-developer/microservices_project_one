package com.myorganisation.invoice.controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/invoice")
public class InvoiceController {
    @GetMapping("/{id}")
    public ResponseEntity<String> getInvoice(@PathVariable Long id) {
        String body = "Returning product details of Product id: " + id;
        return new ResponseEntity<>(body, HttpStatusCode.valueOf(200));
    }

}
