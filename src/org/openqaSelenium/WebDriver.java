package org.openqaSelenium;

public interface WebDriver extends SearchContext
{
	public void get(String url);
	public String getTitle();
	public void quit();
}
