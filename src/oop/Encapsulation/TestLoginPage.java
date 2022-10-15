package oop.Encapsulation;

public class TestLoginPage {

	public static void main(String[] args)
	{

		LoginPage lp=new LoginPage();
		lp.setUserName("Priyanka");
		lp.setPassword("Priyanka");
		lp.doLogin(lp.getUserName(),lp.getPassword());

		System.out.println("**********************************");
		
		lp.setUserName("Vidya");
		lp.setPassword("Vidya");
		lp.doLogin(lp.getUserName(),lp.getPassword());
		
		
		
		
		
	}

}
