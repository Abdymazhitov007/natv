package org.example.na_tv.controller;

import lombok.RequiredArgsConstructor;
import org.example.na_tv.model.request.UserRequest;
import org.example.na_tv.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody UserRequest request) {

        return ResponseEntity.ok(service.create(request));

    }

    @GetMapping("/id")
    public ResponseEntity<?> getById(@RequestParam Long id) {

        return ResponseEntity.ok(service.findById(id));

    }

    @GetMapping
    public ResponseEntity<?> getAll() {

        return ResponseEntity.ok(service.findAll());

    }

    @PostMapping("/update")
    public ResponseEntity<?> update(@RequestBody UserRequest request) {
        return ResponseEntity.ok(service.update(service.findById(request.ge)))
    }

}
