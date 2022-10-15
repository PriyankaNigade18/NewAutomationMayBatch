package oop.Encapsulation;

public class TestEmployee {

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		//e1.id=102;
		e1.setId(102);
		e1.setName("Vidya");
		System.out.println(e1.getId());
		System.out.println(e1.getName());

	}

}
