package com.childsafety.childsafety.controller;

import com.childsafety.childsafety.models.ChildSafeModel;
import com.childsafety.childsafety.service.ChildSafeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/child")
public class ChildSafeController {
    @Autowired
    ChildSafeService childSafeService;
    @PostMapping("/create")
    ResponseEntity<?>createchild(@RequestBody ChildSafeModel childSafeModel){
        return new ResponseEntity<>(childSafeService.createcd(childSafeModel), HttpStatus.OK);
    }
}
