package com.yaliun.decorator;

public class Main {

	public static void main(String[] args) {
		Beverage coffee = new Espresso();
		
		System.out.println(coffee.getDescription());
		System.out.println(coffee.cost());

		Beverage houseblend = new HouseBlend();
		houseblend = new Mocha(houseblend);
		
		System.out.println(houseblend.getDescription());
		System.out.println(houseblend.cost());
		
		
	}

}
