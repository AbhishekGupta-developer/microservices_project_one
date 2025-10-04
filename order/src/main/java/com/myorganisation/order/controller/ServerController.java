package com.myorganisation.order.controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ServerController {

    @GetMapping
    public ResponseEntity<String> homeApi() {
        return new ResponseEntity<>("Order microservice is live", HttpStatusCode.valueOf(200));
    }

    @GetMapping("/api")
    public ResponseEntity<String> serverApi() {
        return new ResponseEntity<>("Order API is live", HttpStatusCode.valueOf(200));
    }
}
