package com.childsafety.childsafety.service;

import com.childsafety.childsafety.models.ChildSafeModel;
import com.childsafety.childsafety.repository.ChildSafeRepo;
import com.childsafety.childsafety.response.ChildSafeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;

@Service
public class ChildSafeService {
    @Autowired
    ChildSafeRepo childSafeRepo;
    public ChildSafeModel createcd(ChildSafeModel childSafeModel){
        return childSafeRepo.save(childSafeModel);
    }
    public ChildSafeResponse getidss(String email,String passs){
        boolean em_nd_pas=childSafeRepo.existsByEmailAndPasss(email,passs);
        if (!em_nd_pas){
            throw new RuntimeException("Table was dont have that email");
        }
        ChildSafeModel childSafeModel=childSafeRepo.findByEmail(email)
                .orElseThrow(()->new RuntimeException("no client found"));
        return new ChildSafeResponse(
                childSafeModel.getName(),
                childSafeModel.getEmail(),
                childSafeModel.getWho()

        );
    }

}
