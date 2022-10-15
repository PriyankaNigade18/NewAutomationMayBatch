package oop.DataAbstraction;

abstract class GoogleMap
{
	//Implemented
	public void currentloc()
	{
		System.out.println("Takes current location of user");
	}
	
	//abstract---non implemented
	public abstract void destloc();
	
}


public class AbstarctClassDemo extends GoogleMap
{
//	@Override
//	public void destloc()
//	{
//		System.out.println("This is dest locaton");
//		
//	}
	public static void main(String[] args) {
		//GoogleMap gp=new GoogleMap();
		
		GoogleMap gp=new AbstarctClassDemo();
		gp.currentloc();
		gp.destloc();
		
	}

	@Override
	public void destloc() {
		System.out.println("This is dest locaton");
		
	}

}
