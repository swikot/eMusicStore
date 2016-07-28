package com.emusicstore.model;

/**
 * Created by snow on 27/07/2016.
 */
public class Product {

   public String productName;
   public  String productCatagory;
   public  int productPrice;
   public String productDescription;
    public  String productCondition;
    public int unitOnStock;

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductCondition() {
        return productCondition;
    }

    public void setProductCondition(String productCondition) {
        this.productCondition = productCondition;
    }

    public int getUnitOnStock() {
        return unitOnStock;
    }

    public void setUnitOnStock(int unitOnStock) {
        this.unitOnStock = unitOnStock;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCatagory() {
        return productCatagory;
    }

    public void setProductCatagory(String productCatagory) {
        this.productCatagory = productCatagory;
    }

    public int  getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }
}
