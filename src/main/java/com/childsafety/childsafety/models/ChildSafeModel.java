package com.childsafety.childsafety.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "childsafety2")
public class ChildSafeModel {
    @Id
    @GeneratedValue
    Integer id;
    String name;
    String email;
    String passs;
    String who;
}
