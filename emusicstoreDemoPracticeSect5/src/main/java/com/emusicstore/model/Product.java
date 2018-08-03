package com.emusicstore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;


import org.hibernate.annotations.GenericGenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;



@Entity
public class Product {

	/*@Id
	@GeneratedValue(strategy=GenerationType.AUTO)*/
	


	@Id @GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	
	//Validator annotations 
	//@NotEmpty (message="The product name must not be null")
	private String productId;
    private String productName;
    private String productCategory;
    private String productDescription;
    
   //@Min(value=0, message="The Product price must not be less than Zero. ")
    private double productPrice;
    private String productCondition;
    private String productStatus;
    
    //@Min(value=0, message="The ProductUnit must not less than Zero")
    private int unitInStock;
    private String ProductManufacturer;
    
    //make the product image as transient bcz when we persist the POJO we dont want file to be part of the process
    @Transient
    private MultipartFile productImage;
    
    public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductCondition() {
        return productCondition;
    }

    public void setProductCondition(String productCondition) {
        this.productCondition = productCondition;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public int getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }

    public String getProductManufacturer() {
        return ProductManufacturer;
    }

    public void setProductManufacturer(String productManufacture) {
        ProductManufacturer = productManufacture;
    }

	public MultipartFile getProductImage() {
		return productImage;
	}

	public void setProductImage(MultipartFile productImage) {
		this.productImage = productImage;
	}
    
}
