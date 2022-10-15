package oop.Encapsulation;

class StudentData
{
	private int sid=101;
	

	private String name="Sagar";
	
	//Access
	
	

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	
	public void setSid(int id)
	{
		this.sid=id;
	}
	
	public int getSid()
	{
		return this.sid;
	}
	
	//business login---Method
	public void show()
	{
		System.out.println(sid);
		System.out.println(name);
	}
	
	
}

public class EmcapsulationDemo {

	public static void main(String[] args)
	{
		StudentData s1=new StudentData();
		//s1.name="Smita";
		//System.out.println(s1.name);
		s1.setSid(201);
		int id=s1.getSid();
		System.out.println(id);
		s1.setName("Piyush");
		System.out.println(s1.getName());
		//s1.show();

	}

}
