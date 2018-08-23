package com.basha.customhashmap;

public class Employee {

	private String id;
	private String name;
	
	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
	public boolean equals(Object o){
		if(o==null)
		return false;
		if(this.getClass()!=o.getClass())
			return false;
		Employee e=(Employee) o;
		return e.id.equals(this.id) && e.name.equals(this.name);
	}
	
	public int hashCode(){
		return id.hashCode() + name.hashCode();
		
	}
}
