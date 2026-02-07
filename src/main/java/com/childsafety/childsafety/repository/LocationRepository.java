package com.childsafety.childsafety.repository;

import com.childsafety.childsafety.models.ChildLocation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LocationRepository extends JpaRepository<ChildLocation, Long> {

    Optional<ChildLocation> findTopByEmailOrderByUpdatedAtDesc(String email);
}
