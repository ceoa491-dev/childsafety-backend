package com.childsafety.childsafety.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "newchild")   // ✅ table name in MySQL
@Data
public class ChildSafeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String email;
    private String passs;
    private String who;   // Parent or Children
}
