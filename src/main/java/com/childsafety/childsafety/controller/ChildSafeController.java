package com.childsafety.childsafety.controller;

import com.childsafety.childsafety.models.ChildSafeModel;
import com.childsafety.childsafety.service.ChildSafeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/child")
public class ChildSafeController {

    @Autowired
    private ChildSafeService service;

    // REGISTER
    @PostMapping("/create")
    public ResponseEntity<?> register(@RequestBody ChildSafeModel model) {
        return ResponseEntity.ok(service.createcd(model));
    }

    // LOGIN
    @PostMapping("/verify")
    public ResponseEntity<?> login(@RequestBody ChildSafeModel req) {
        return ResponseEntity.ok(
                service.login(
                        req.getEmail(),
                        req.getPasss(),
                        req.getWho()
                )
        );
    }
}
