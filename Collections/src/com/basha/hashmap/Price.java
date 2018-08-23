package com.basha.hashmap;

public class Price {
	
	private String item;
    private int price;

	public Price(String itm, int pr) {
		this.item=itm;
		this.price=pr;
	
	}
	
	public int hashCode(){
		System.out.println("In hashCode Method");
		int hashCode=0;
		hashCode=price*20;
		hashCode +=item.hashCode();
		return hashCode;
		
	}
	
	public boolean equals(Object obj){
		System.out.println("In equals Method");
		if (obj instanceof Price){
			Price pp=(Price) obj;
			return (pp.item.equals(this.item) && pp.price==this.price);
		}else{
			return false;
		}
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Price [item=" + item + ", price=" + price + "]";
	}
	
}
