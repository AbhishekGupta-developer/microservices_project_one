package com.myorganisation.invoice.controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/api/invoice")
public class InvoiceController {
    @GetMapping("/{id}")
    public ResponseEntity<String> getInvoice(@PathVariable Long id) {
        String body = "Returning product details of Product id: " + id;
        return new ResponseEntity<>(body, HttpStatusCode.valueOf(200));
    }

    @PostMapping
    public ResponseEntity<String> createInvoice() {
        String body = "Creating invoice on " + new Date();
        return new ResponseEntity<>(body, HttpStatusCode.valueOf(201));
    }

}
