package com.childsafety.childsafety.repository;

import com.childsafety.childsafety.models.ChildSafeModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ChildSafeRepo extends JpaRepository<ChildSafeModel,Integer> {
    boolean existsByEmailAndPasss(String email,String passs);
    Optional<ChildSafeModel> findByEmail(String email);
}
