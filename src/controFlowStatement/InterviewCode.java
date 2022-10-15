package controFlowStatement;

public class InterviewCode {

	public static void main(String[] args) 
	{

		//factorial of number
		int fact=1;
		for(int i=5;i>=1;i--)
		{
			fact=fact*i;
		}

		System.out.println("Factorial of num 5 is: "+fact);
		
		System.out.println("*********************************");
		//Print sum of 100 naturals number=5050
		//1+2+3+4....+100
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			sum=sum+i;
			
		}
		System.out.println("Sum of 100 Naturals number is:  "+sum);
		
		System.out.println("*********************************");
		
		int a=10,b=20;
		System.out.println("Before Swapping a="+a+" & "+"b="+b);
		
//		int temp=a;
//		a=b;
//		b=temp;
		
		a=a+b;//a=30
		b=a-b;//b=10
		a=a-b;//a=20
		
		System.out.println("After Swapping a="+a+" & "+"b="+b);
		
		System.out.println("******************************************");
		
		int num=123,temp=num;
		int rem,res=0;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			res=res*10+rem;
			
		}
		
		System.out.println("Reverse of number "+temp+" is: "+res );
		
		if(temp==res)
		{
			System.out.println(temp+ " is palindrome number");
		}
		else
		{
			System.out.println(temp+ " is not palindrome number");
		}
		
		System.out.println("*******************************");

		
		
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print(j+" ");	
			}
			System.out.println();
		}
		
		
		System.out.println("**********************************");
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print(i+" ");	
			}
			System.out.println();
		}
		
		
		System.out.println("********************************");
		
		int k=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
		
		
		System.out.println("**********************************");
		
		
		
		for(int i=1;i<=10;i++)
		{
			if(i>=5)
			{
				System.out.print(i+" ");
			}else
			{
				System.out.println(i);
			}
		}
		
		System.out.println("**************************************");
		
		int num1=153,rem1,sum1=0;
		int temp1=num1;
		while(num1>0)
		{
			rem1=num1%10;
			num1=num1/10;
			sum1=sum1+rem1*rem1*rem1;
			
		}
		if(temp1==sum1)
		{
			System.out.println(temp1+ " is an Armstrong number");
		}else
		{
			System.out.println(temp1+ " is not an Armstrong number");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
