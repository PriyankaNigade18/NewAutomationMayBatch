package javaBasics;
//Assignment1
public class Employee 
{
	//data
	int eid;
	String ename;

	//method
	public void details()
	{
		System.out.println("Employee id is: "+eid);
		System.out.println("Employee name is: "+ename);
	}
	
	
	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		e1.eid=101;
		e1.ename="Sarang";
		e1.details();
		
		Employee e2=new Employee();
		e2.eid=102;
		e2.ename="Vidya";
		e2.details();
	}

}
