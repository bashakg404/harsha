package com.emusicstore.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.emusicstore.model.Product;

public class ProductDao {

    private List<Product> productList;

    public List<Product> getProductList() {
        Product product1=new Product();
        product1.setProductId("P101");
        product1.setProductName("Guitar1");
        product1.setProductCategory("Instrument ");
        product1.setProductDescription("This is a fender stretch guitar");
        product1.setProductPrice(1200);
        product1.setProductCondition("New");
        product1.setProductStatus("Active");
        product1.setUnitInStock(14);
        product1.setProductManufacturer("Fender");

        Product product2 =new Product();
        product2.setProductId("P102");
        product2.setProductName("Record1");
        product2.setProductCategory("Record ");
        product2.setProductDescription("This is a awesome mix of 21st Century!");
        product2.setProductPrice(2300);
        product2.setProductCondition("New");
        product2.setProductStatus("Active");
        product2.setUnitInStock(10);
        product2.setProductManufacturer("EMI");

        Product product3 =new Product();
        product3.setProductId("P103");
        product3.setProductName("Speaker");
        product3.setProductCategory("Accessory");
        product3.setProductDescription("This is a bose speaker!");
        product3.setProductPrice(3500);
        product3.setProductCondition("New");
        product3.setProductStatus("Active");
        product3.setUnitInStock(50);
        product3.setProductManufacturer("bose");

        productList=new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        return productList;


            }
    public Product getProductById(String productId) throws IOException{
    	for(Product product:getProductList()){
    		if(product.getProductId().equals(productId)){
    			return product;
    		}
    	}
    	
    	throw new IOException("No Product Found.");
    }
}
