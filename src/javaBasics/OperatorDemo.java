package javaBasics;

public class OperatorDemo {

	public static void main(String[] args) 
	{
		int a=10,b=10;
		//System.out.println(a+b);
		System.out.println("Addition is: "+(a+b));
		//System.out.println(a+b+"Addition");
		System.out.println("Subtraction is: "+(a-b));
		System.out.println("Multiplication is: "+(a*b));
		System.out.println("Division is: "+(a/b));
		System.out.println("Modulus is: "+(a%b));
		
		//Incremental (++)    Decremental(--)
		
		//Post increment
		int a1=10;
		int b1=a++;
		System.out.println(b);//10
		System.out.println(a);//11
		
		int x=99;
		int y=x++;
		System.out.println(y);//99
		System.out.println(x);//100
		
		int c=1789;
		int d=c++;
		System.out.println(d);//1789
		System.out.println(c);//1790
		
		
		//Pre increment
		int i=90;
		int j=++i;
		
		System.out.println(j);
		System.out.println(i);
		
		int p=678;
		int q=++p;
		
		System.out.println(q);//679
		System.out.println(p);//679
		
		int o=-1;
		int u=++o;
		System.out.println(u);
		System.out.println(o);
		System.out.println("****************************");
		//decrement
		//post decrement
		int e=90;
		int f=e--;
		System.out.println(f);
		System.out.println(e);
		
		//pre decrement
		int l=78;
		int m=--l;
		System.out.println(m);
		System.out.println(l);
		
		System.out.println("****************************************");
		//Relational
		System.out.println(l>e);//false
		System.out.println(e>l);//true
		System.out.println(e==l);//false
		System.out.println(e>=l);//true
		System.out.println(l<=e);//true
		System.out.println(i!=e);//true
		
		System.out.println("***************************************");
		//Logical----(xpath with operator)
		
		System.out.println(x>i && e>l);//true
		System.out.println(x>i && l>e);//false
		System.out.println(x>i || l>e);//true

			boolean s=true;
		 System.out.println(!s);
		
		 
		 
		 System.out.println(e>l?true:false);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
