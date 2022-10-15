package javaBasics;

public class StudentData
{
	//data
	int id;
	String name;
	//method
	public void display()
	{
		System.out.println("Student id is: "+id);
		System.out.println("Student name is: "+name);
	}
	
	public static void main(String args[])
	{
		StudentData s1=new StudentData();
		//s1.display();
		s1.id=101;
		s1.name="Pooja";
		s1.display();
		
		
		StudentData s2=new StudentData();
		s2.id=102;
		s2.name="Sarang";
		s2.display();
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
