package oop.Inheritance;

public class TestCar {

	public static void main(String[] args) 
	{
		//parent class ref and parent class object
		Car c1=new Car();
		c1.start();//individuals
		c1.refule();
		c1.stop();
		c1.engine();
		
		System.out.println("*************");
		//child class ref and child class Object
		BMW b1=new BMW();
		b1.start();//Inherited 
		b1.refule();//Inherited 
		b1.autoParking();//Individual
		b1.stop();//Inherited 
		b1.engine();
		
		System.out.println("*************");
		//Parent class ref and child class Object
		Car c2=new BMW();
		c2.start();
		c2.refule();
		c2.stop();
		c2.engine();
		
		
//		Vehical v1=new Vehical();
//		v1.engine();
//		
//		
//		Audi a1=new Audi();
//		a1.start();
//		a1.engine();
//		a1.autoGear();
//		a1.refule();
//		a1.stop();
//		
//		
		
		
		
		
		
		
		
		
		

	}

}
