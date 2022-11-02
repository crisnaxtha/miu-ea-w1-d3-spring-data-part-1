package edu.miu.springdata.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Review {
    @Id
    private int id;
    private String comment;

}
