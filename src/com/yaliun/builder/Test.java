package com.yaliun.builder;
public class Test {

	public static void main(String[] args) {
		PersonInfo info = new PersonInfo.Builder("tom")
				.setAge(20)
				.setPhoneNumber("0101112233")
				.build();				
		
		System.out.println("info " + info);
	}

}
