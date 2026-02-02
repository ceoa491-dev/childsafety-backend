package com.childsafety.childsafety.controller;

import com.childsafety.childsafety.models.ChildSafeModel;
import com.childsafety.childsafety.service.ChildSafeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(
        origins = "https://ceoa491-dev.github.io",
        allowedHeaders = "*",
        methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE}
)
@RequestMapping("/child")
public class ChildSafeController {
    @Autowired
    ChildSafeService childSafeService;
    @PostMapping("/create")
    ResponseEntity<?>createchild(@RequestBody ChildSafeModel childSafeModel){
        return new ResponseEntity<>(childSafeService.createcd(childSafeModel), HttpStatus.OK);
    }
}
