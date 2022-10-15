package javaBasics;

public class BuilderPattern
{
	public BuilderPattern startBrowser()
	{
		System.out.println("Start Browser......");
		return this;
	}
	
	public BuilderPattern runApp()
	{
		System.out.println("Run Application.....");
		return this;
	}
	
	public BuilderPattern closeBrowser()
	{
		System.out.println("Close Browser.......");
		return this;
	}
	
	
	

	public static void main(String[] args) 
	{
		BuilderPattern b1=new BuilderPattern();
		b1.startBrowser().runApp().closeBrowser().startBrowser();
		
//		b1.runApp();
//		b1.closeBrowser();
		

	}

}
