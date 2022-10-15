package javaBasics;

public class VariableDemo
{
	//instance(non static)
	int id;
	String name;
	//static
	static String clgname="AISSPMS";
	
	
	public void display()
	{
		int courseid=2020;//local
		System.out.println("Student id is: "+id);
		System.out.println("Student name is: "+name);
		System.out.println("Course id is: "+courseid);
		System.out.println(clgname);
		//System.out.println(marks);
	}
	
	
	

	public static void main(String[] args) 
	{
		System.out.println(clgname);
		int marks=90;//local
		//System.out.println(courseid);
		System.out.println("Marks are: "+marks);
		//System.out.println(id);
		VariableDemo v1=new VariableDemo();
		v1.id=101;
		v1.name="Smita";
		v1.display();
		
				

	}

}
