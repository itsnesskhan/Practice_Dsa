package com.example.design.pattern;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
class User{
	
	private int id;
	private String name;
	private String city;
	
	
	
	public User(Userbuilder userbuilder) {
		this.id = userbuilder.id;
		this.name = userbuilder.name;
		this.city = userbuilder.city;
	}



	static class Userbuilder{
		
		private int id;
		private String name;
		private String city;
		
		public Userbuilder setId(int id) {
			this.id = id;
			return this;
		}
		
		public Userbuilder setName(String name) {
			this.name = name;
			return this;
		}
		
		public Userbuilder setCity(String city) {
			this.city = city;
			return this;
		}
		
		public User build() {
			User user = new User(this);
			return user;
		}
		
		
		
	}
	
}

public class BuilderDesignPattern {

	public static void main(String[] args) {
		
		User user = new User.Userbuilder()
						.setId(101)
						.setName("Nasser Khan")
						.setCity("Dharampuri")
						.build();
		
		System.out.println(user);
	}
}
