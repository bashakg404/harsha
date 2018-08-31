package com.springdemo.annqualifier;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Active implements Bike {


	@Autowired
	@Qualifier("beneli")
	private Brands brands;

	public void setBrands(Brands brands) {
		System.out.println("inside setter method");
		this.brands = brands;
	}

	/*@Autowired
	public void doMyCrazyStuffs(Brands brands){
		System.out.println("inside domycrazystuffs method");
		this.brands=brands;
	}*/

	
	@Override
	public String getYourBikeCC() {
		
		return "My Honda Active 100CC";
	}


	@Override
	public String myBikeBrand() {
		
		return "mybike:" + brands.myBikeBrand();
	}

}
