package com.basha.comparable;

public class Player implements Comparable{
	
	private String name;
	private int ranking;
	private int age;
	private String country;

	public Player(String name, int ranking, int age, String country) {
		this.name = name;
		this.ranking = ranking;
		this.age = age;
		this.country = country;
	}


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getRanking() {
		return ranking;
	}



	public void setRanking(int ranking) {
		this.ranking = ranking;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	@Override
	public String toString() {
		return " [name=" + name + ", ranking=" + ranking + ", age=" + age + ", country=" + country + "]";
	}



	@Override
	public int compareTo(Object o) {
		Player p=(Player)o;
		if(this.getRanking()==p.getRanking()){
			return 0;
		}else{
			return (this.getRanking()-p.getRanking());	
		}
	
	
	}
}
