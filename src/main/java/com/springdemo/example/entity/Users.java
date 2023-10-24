package com.springdemo.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name = "Users")
public class Users {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int age;
    private String gender;
}
