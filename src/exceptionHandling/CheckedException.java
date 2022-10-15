package exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CheckedException {

	public static void main(String[] args) 


	{
		
		//example 1
		System.out.println("Program starts.....");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Pausing for 3sec.");
			//e.printStackTrace();
		}
		System.out.println("Program Ends......");

		
		File f1=new File("");//FileNotFoundException
		Properties p1=new Properties();
		FileInputStream fs;
		
		try {
			fs=new FileInputStream(f1);
			p1.load(fs);//IOException
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}

}
