package com.childsafety.childsafety.controller;

import com.childsafety.childsafety.models.ChildLocation;
import com.childsafety.childsafety.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private LocationRepository repo;

    // CHILD → send location
    @PostMapping("/update")
    public String update(@RequestBody ChildLocation location) {
        repo.save(location);
        return "Location saved";
    }

    // PARENT → get child location
    @GetMapping("/by-email/{email}")
    public ChildLocation get(@PathVariable String email) {
        return repo.findTopByEmailOrderByUpdatedAtDesc(email)
                .orElseThrow(() -> new RuntimeException("No location found"));
    }
}
