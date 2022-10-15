package oop.DataAbstraction;

public class NobleHs implements IndianMA,USMA 
{

	public void medicalService()
	{
		System.out.println("Noble .....Medical Service");
	}

	@Override
	public void physioService() 
	{
		System.out.println("Noble .....PhysioService");
		
	}

	@Override
	public void dentalService() {
		System.out.println("Noble .....DentalService");
		
	}

	@Override
	public void neroService() {
		System.out.println("Noble....NeroService");
		
	}

	@Override
	public void cardioService() {
		System.out.println("Noble......CardioService");
		
	}

	@Override
	public void covid19Test()
	{
		System.out.println("Noble .....Covid19Test");
		
	}
	
	
	
	
}
