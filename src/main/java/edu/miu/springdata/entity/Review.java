package edu.miu.springdata.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Review {
    @Id
    private int id;
    private String comment;
    @ManyToOne
    //it is optional, need if we need to change the name of product, Join Column is alwasy
    // on weak entity side but except
    @JoinColumn
    Product product;

}
