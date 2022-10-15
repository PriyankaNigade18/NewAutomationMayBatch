package org.openqaSelenium;

public class RemoteWebDriver implements WebDriver
{

	@Override
	public void findElement() {
		System.out.println("It will Identify Single webelement");
		
	}

	@Override
	public void findElements() {
		System.out.println("It will identify Group of elements");
		
	}

	@Override
	public void get(String url) {
		System.out.println("It will Open Application: "+url);
		
	}

	@Override
	public String getTitle() {
		String title="Appication Title";
		return title;
	}

	@Override
	public void quit() {
		System.out.println("It will close the browser");
		
	}

}
