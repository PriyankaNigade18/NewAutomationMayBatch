package oop.Encapsulation;

public class LoginPage
{
	private String username;
	private String password;
	
	//Access
	public void setUserName(String name)
	{
		this.username=name;
	}
	public void setPassword(String psw)
	{
		this.password=psw;
	}
	
	public String getUserName()
	{
		return this.username;
	}
	
	public String getPassword()
	{
		return this.password;
	}
	
	//Business logic 
	public void doLogin(String un,String ps)
	{
		System.out.println("User Name is: "+un);
		System.out.println("Password is: "+ps);
	}
	
//	public void writeun(String un)
//	{
//		System.out.println(un);
//	}
//	
	
	
	

}
