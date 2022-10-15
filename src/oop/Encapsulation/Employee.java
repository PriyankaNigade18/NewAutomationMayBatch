package oop.Encapsulation;

public class Employee 
{
	private int id=101;
	private String name="Smita";
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	public void display()
	{
		System.out.println("Employee name: "+name);
		System.out.println("Employee id is: "+id);
	}
	public static void main(String[] args)
	{
		Employee  e1=new Employee ();
		System.out.println(e1.id);
		e1.display();

	}

}
