package com.childsafety.childsafety.service;

import com.childsafety.childsafety.models.ChildSafeModel;
import com.childsafety.childsafety.repository.ChildSafeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChildSafeService {
    @Autowired
    ChildSafeRepo childSafeRepo;
    public ChildSafeModel createcd(ChildSafeModel childSafeModel){
        return childSafeRepo.save(childSafeModel);
    }

}
