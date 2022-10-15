package oop.DataAbstraction;

public class TestHospital {

	public static void main(String[] args)
	{
			NobleHs nh=new NobleHs();
			nh.cardioService();
			nh.dentalService();
			nh.physioService();
			nh.neroService();
			nh.covid19Test();
			System.out.println("***********");
			
			IndianMA im=new NobleHs();
			im.dentalService();
			im.physioService();
			im.covid19Test();
			System.out.println("*************");
			
			USMA um=new NobleHs();
			um.cardioService();
			um.neroService();
			um.covid19Test();

	}

}
