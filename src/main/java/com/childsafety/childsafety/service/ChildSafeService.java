package com.childsafety.childsafety.service;

import com.childsafety.childsafety.models.ChildSafeModel;
import com.childsafety.childsafety.repository.ChildSafeRepo;
import com.childsafety.childsafety.response.ChildSafeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChildSafeService {

    @Autowired
    private ChildSafeRepo childSafeRepo;

    public ChildSafeModel createcd(ChildSafeModel childSafeModel) {
        return childSafeRepo.save(childSafeModel);
    }

    public ChildSafeResponse login(String email, String passs, String who) {

        ChildSafeModel user = childSafeRepo
                .findByEmailAndPasssAndWho(email, passs, who)
                .orElseThrow(() ->
                        new RuntimeException("Invalid credentials or role"));

        return new ChildSafeResponse(
                user.getName(),
                user.getEmail(),
                user.getWho()
        );
    }
}
