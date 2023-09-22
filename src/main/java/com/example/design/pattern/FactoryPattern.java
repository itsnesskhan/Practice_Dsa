package com.example.design.pattern;

interface Developer{
	
	String getSalary();
}

class AndroidDeveloper implements Developer{

	@Override
	public String getSalary() {
		System.out.print("Fecting Android Developer's Salary");
		return 35000+"Rs";
	}
	
}

class JavaDeveloper implements Developer{

	@Override
	public String getSalary() {
		System.out.print("Fecting Java Developer's Salary");
		return 45000+"Rs";
	}
	
}

class AngularsDeveloper implements Developer{

	@Override
	public String getSalary() {
		System.out.print("Fecting Angular Developer's Salary");
		return 45000+"Rs";
	}
	
}

class DeveloperFactory{
	
	public static Developer getDeveloper(String type) {
		switch (type) {
		case "JAVA": {
			return new JavaDeveloper();
		}
		case "ANDROID" : {
			return new AndroidDeveloper();
		}
		case "ANGULAR":{
			return new AngularsDeveloper();			
		}
		default:
			throw new IllegalArgumentException("No "+ type+" Developer Available!");
		}
	}
}

public class FactoryPattern {

	public static void main(String[] args) {
		Developer developer = DeveloperFactory.getDeveloper("JAVA");
		System.out.print(" : "+developer.getSalary());
		System.out.println();
		
		Developer developer2 = DeveloperFactory.getDeveloper("ANDROID");
		System.out.print(" : "+developer2.getSalary());
		System.out.println();
		
		Developer developer3 = DeveloperFactory.getDeveloper("ANGULAR");
		System.out.print(" : "+developer3.getSalary());
		System.out.println();
		
		
//		Developer developer3 = DeveloperFactory.getDeveloper("PHP");
//		System.out.print(" : "+developer3.getSalary());
		
		// it encapsulate the creation of object
		// it makes our code loosely coupled cause based on the input we get the object
		// hide the implementation how object is being created
	}
}
