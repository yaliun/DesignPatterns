package com.yaliun.builder;

public class PersonInfo {
	private String name;
	private int age;
	private String phoneNumber;

	private PersonInfo(){}
	
	private PersonInfo(Builder builder){
		this.name = builder.name;
		this.age = builder.age;
		this.phoneNumber = builder.phoneNumber;
	}

	@Override
	public String toString() {
		return "PersonInfo [name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber + "]";
	}



	public static class Builder{
		private final String name;
		private int age;
		private String phoneNumber;
		
		public Builder(String name){
			this.name = name;
		}
		
		public Builder setAge(int age){
			this.age = age;
			return this;
		}
		
		public Builder setPhoneNumber(String phoneNumber){
			this.phoneNumber = phoneNumber;
			return this;
		}
		
		public PersonInfo build(){
			return new PersonInfo(this);
		}
	}
}
