package com.emusicstore.dao;

import com.emusicstore.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by snow on 27/07/2016.
 */
public class ProductDao {

    List<Product> productList;

    public List<Product> getProductList() {
        Product product1=new Product();
        Product product2=new Product();
        Product product3=new Product();

        product1.setProductName("Guitar");
        product1.setProductCatagory("Instrument");
        product1.setProductDescription("This is guitar");
        product1.setProductPrice(1200);
        product1.setProductCondition("new");
        product1.setUnitOnStock(11);

        product2.setProductName("Guitar");
        product2.setProductCatagory("Instrument");
        product2.setProductDescription("This is guitar");
        product2.setProductPrice(1200);
        product2.setProductCondition("new");
        product2.setUnitOnStock(11);

        product3.setProductName("Guitar");
        product3.setProductCatagory("Instrument");
        product3.setProductDescription("This is guitar");
        product3.setProductPrice(1200);
        product3.setProductCondition("new");
        product3.setUnitOnStock(11);

         productList= new ArrayList<Product>();
         productList.add(product1);
         productList.add(product2);
         productList.add(product3);



        return productList;
    }
}
