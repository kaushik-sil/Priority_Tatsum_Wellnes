package com.tatsam.priority.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class userArea {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long area_id;
    String area ;
    Long satisfaction_rating;
}
