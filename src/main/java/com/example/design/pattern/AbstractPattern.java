package com.example.design.pattern;

interface Developers{
	
	String name();
	int salary();
}

class NodeDeveloper implements Developers{

	@Override
	public int salary() {
		return 45000;
	}

	@Override
	public String name() {
		return "Nasser Khan";
	}
	
}

class AngularDeveloper implements Developers{

	@Override
	public int salary() {
		return 40000;
	}

	@Override
	public String name() {
		return "Nazeem Khan";
	}
	
}

abstract class AbstractDeveloperFactory{
	
	public abstract Developers getDev();
}


class AngularDeveloperFactory extends AbstractDeveloperFactory{

	@Override
	public Developers getDev() {
		return new AngularDeveloper();
	}
	
}

class NodeDeveloperFactory extends AbstractDeveloperFactory{

	@Override
	public Developers getDev() {
		return new NodeDeveloper();
	}
	
}

class DevelopersFactory{
	
	public static Developers getDeveloper(AbstractDeveloperFactory abstractDeveloperFactory) {
		return abstractDeveloperFactory.getDev();
	}
}




public class AbstractPattern {

	public static void main(String[] args) {
		
		Developers developer = DevelopersFactory.getDeveloper(new NodeDeveloperFactory());
		System.out.println(developer.name()+" "+developer.salary());
		
		Developers developer2 = DevelopersFactory.getDeveloper(new AngularDeveloperFactory());
		System.out.println(developer2.name()+" "+developer2.salary());
	}
}
