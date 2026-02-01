package com.childsafety.childsafety.repository;

import com.childsafety.childsafety.models.ChildSafeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChildSafeRepo extends JpaRepository<ChildSafeModel,Integer> {
}
