package com.childsafety.childsafety.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ChildSafeModel {
    @Id
    @GeneratedValue
    Integer id;
    String name;
    String email;
    String passs;
    String who;
}
