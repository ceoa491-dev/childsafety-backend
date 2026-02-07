package com.childsafety.childsafety.models;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
public class ChildLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;      // SAME email for parent & child
    private double latitude;
    private double longitude;

    @CreationTimestamp
    private LocalDateTime updatedAt;
}
