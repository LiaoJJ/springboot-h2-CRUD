package com.example.demo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table
public class Student {

    public Student(){}

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Id
    @Column
    @Setter
    @Getter
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;

    @Column
    @Setter
    @Getter
    public String name;
}
