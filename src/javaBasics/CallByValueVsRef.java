package javaBasics;

public class CallByValueVsRef
{
	public void callByValue(int a)//local a=200
	{
		System.out.println("Call by value is:"+a);
	}
	
	
	public void callByRef(CallByValueVsRef b)//b=c1
	{
		System.out.println("Call by reference is.....");
		b.callByValue(50);
	}
	
	public void getInfo(String msg)
	{
		System.out.println(msg);
	}
	
	
	
	
	public void callByOtherRef(Employee emp)//emp=e1
	{
		emp.eid=111;
		emp.ename="Kirti";
		emp.details();
	}

	public static void main(String[] args)
	{
		CallByValueVsRef c1=new CallByValueVsRef();
		c1.callByValue(200);
		System.out.println("********************************");
		c1.getInfo("Hello All");//non primitive
		//we are calling method by passing reference .....
		c1.callByRef(c1);
		System.out.println("********************************");
		Employee  e1=new Employee ();
		c1.callByOtherRef(e1);
		
		
		
		
		
		
				


	}

}
