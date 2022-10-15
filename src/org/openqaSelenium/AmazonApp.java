package org.openqaSelenium;

public class AmazonApp {

	public static void main(String[] args)
	{
		//ChromeDriver driver=new ChromeDriver();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		System.out.println(driver.getTitle());
		driver.findElement();
		driver.quit();
		
	}

}
