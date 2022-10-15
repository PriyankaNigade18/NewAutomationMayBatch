package javaBasics;

public class MutiDArray {

	public static void main(String[] args) 
	{
		//Using new Keyword
		
		int id[][]=new int[2][3];
		id[0][0]=10;
		id[0][1]=20;
		
		id[1][0]=30;
		id[1][1]=40;
		
		System.out.println(id[0][1]);//20
		System.out.println(id[1][1]);//40
		
		System.out.println("Number of rows: "+id.length);
		System.out.println("Number of Columns: "+id[0].length);
		
		//Iterate
		for(int i=0;i<id.length;i++)
		{
			for(int j=0;j<id[i].length;j++)
			{
				System.out.print(id[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("*********************************");
		
		for(int i[]: id)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("***********************************");
		
		//Using literals
		int arr[][]= {{10,20},{30,40},{50,60}};
		System.out.println("Number of rows: "+arr.length);//3
		System.out.println("Number of columns: "+arr[0].length);//2
		for(int i[]:arr)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("*****************************************");
		
		String name[][]= {{"Sumit","Sarika"},{"Ketaki","Mayur"}};
		
		for(String i[]:name)
		{
			for(String j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
