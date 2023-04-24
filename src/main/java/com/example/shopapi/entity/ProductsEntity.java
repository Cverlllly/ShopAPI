package com.example.shopapi.entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.sql.Timestamp;

@Entity
@Table(name = "products")
public class ProductsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_id")
    private Long product_id;
    @Column(name="name")
    private String name;
    @Column(name = "price")
    private Double price;
    @Column(name = "serial_number")
    private String serial_number;
    @Column(name = "description")
    private String description;
    @Column(name="lastupdate")
    private Timestamp lastupdate;
    @Column(name="qty")
    private String QTY;

    @Column(name="image")
    private byte[] image;

    public ProductsEntity() {
    }

    public ProductsEntity(Long product_id, String name, Double price, String serial_number, String description, Timestamp lastupdate, String QTY,byte[] image) {
        this.product_id = product_id;
        this.name = name;
        this.price = price;
        this.serial_number = serial_number;
        this.description = description;
        this.lastupdate = lastupdate;
        this.QTY = QTY;
        this.image=image;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Timestamp lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getQTY() {
        return QTY;
    }

    public void setQTY(String QTY) {
        this.QTY = QTY;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
