package com.tatsam.priority.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
//Using Lombok library for getter setters and constructors
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;
    @OneToMany(cascade = CascadeType.ALL)//cascade data to child tables
    private List<userArea> user_Area ;
}
