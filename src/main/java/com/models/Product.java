package com.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class Product {
    @Id
    private String id;
    private String prodName;
    private String prodDesc;
    private Double prodPrice;
    private String prodImage;

    Product() {
    }

    Product(String prodName, String prodDesc, Double prodPrice, String prodImage) {
        this.prodName = prodName;
        this.prodDesc = prodDesc;
        this.prodPrice = prodPrice;
        this.prodImage = prodImage;
    }

    public void assignValuesFrom(Product product) {
        if(product.getProdName() != null)
            this.prodName = product.getProdName();
        if(product.getProdDesc() != null)
            this.prodDesc = product.getProdDesc();
        if(product.getProdPrice() != null)
            this.prodPrice = product.getProdPrice();
        if(product.getProdImage() != null)
            this.prodImage = product.getProdImage();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdDesc() {
        return prodDesc;
    }

    public void setProdDesc(String prodDesc) {
        this.prodDesc = prodDesc;
    }

    public Double getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(Double prodPrice) {
        this.prodPrice = prodPrice;
    }

    public String getProdImage() {
        return prodImage;
    }

    public void setProdImage(String prodImage) {
        this.prodImage = prodImage;
    }
}
