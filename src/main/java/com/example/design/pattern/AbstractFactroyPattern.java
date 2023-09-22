package com.example.design.pattern;

interface Computer {
 void use();
}


class Laptop implements Computer {
	
 @Override
 public void use() {
     System.out.println("Using Laptop");
 }
}


class Desktop implements Computer {
	
 @Override
 public void use() {
     System.out.println("Using Desktop");
 }
}


class Lenovo implements Computer{

	@Override
	public void use() {
		System.out.println("Using Desktop");
		
	}
	
}

interface OperatingSystem {
 void run();
}

class Linux implements OperatingSystem{

	@Override
	public void run() {
		System.out.println("Running Ubuntu");
		
	}
	
}

class Windows implements OperatingSystem {
	
 @Override
 public void run() {
     System.out.println("Running Windows");
 }
}


class MacOS implements OperatingSystem {
	
 @Override
 public void run() {
     System.out.println("Running macOS");
 }
}


interface ComputerFactory {
 Computer createComputer();
 OperatingSystem createOperatingSystem();
}


class WindowsComputerFactory implements ComputerFactory {
 @Override
 public Computer createComputer() {
     return new Desktop();
 }

 @Override
 public OperatingSystem createOperatingSystem() {
     return new Windows();
 }
}


class MacOSComputerFactory implements ComputerFactory {
 @Override
 public Computer createComputer() {
     return new Laptop();
 }

 @Override
 public OperatingSystem createOperatingSystem() {
     return new MacOS();
 }
}

class LenovoComputerFactory implements ComputerFactory {

	@Override
	public Computer createComputer() {
		return new Laptop();
	}

	@Override
	public OperatingSystem createOperatingSystem() {
		return new Linux();
	}
	
}

public class AbstractFactroyPattern {
 public static void main(String[] args) {
     
     ComputerFactory windowsFactory = new WindowsComputerFactory();
     Computer windowsComputer = windowsFactory.createComputer();
     OperatingSystem windowsOS = windowsFactory.createOperatingSystem();

     windowsComputer.use();
     windowsOS.run();

    
     ComputerFactory macFactory = new MacOSComputerFactory();
     Computer macComputer = macFactory.createComputer();
     OperatingSystem macOS = macFactory.createOperatingSystem();

     macComputer.use();
     macOS.run();
     
     ComputerFactory lenovoFactory = new LenovoComputerFactory();
     Computer lenovoComputer = lenovoFactory.createComputer();
     OperatingSystem lenovoOS = lenovoFactory.createOperatingSystem();
     
     lenovoComputer.use();
     lenovoOS.run();
 }
}
