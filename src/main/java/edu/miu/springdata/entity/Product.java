package edu.miu.springdata.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "products")
public class Product {
    @Id
    private int id;
    @Column(name="name", updatable = false)
    private String name;
    private double price;
    private String description;
    // This will create Product_id in Reviews Table without this it will create
    // separate table with Product Id and Review Table. To Create Bidirectional We need to remove it.
//    @JoinColumn(name="product_id")
    // mappedBy is used on strong side when bidirectional
    @OneToMany(mappedBy="product")
    private List<Review> reviews;

}
