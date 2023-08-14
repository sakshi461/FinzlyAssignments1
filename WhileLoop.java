package com.javabysakshi;

public class WhileLoop {
	public static void main(String[] args) {
		
	
	//1) Write a Program To print 1 to 25 nos.
	int i=1;
	System.out.println("-----------------------------------------");

	while(i<=25)
	{
		System.out.print(i+" ");
		i++;
	}
	System.out.println();
	System.out.println("-----------------------------------------");

	//	2) Write a Program To print 25 to 1 nos.
	int a =25;

	while(a>=1)
	{
		System.out.print(a+" ");
		a--;
	}
	System.out.println();
	System.out.println("-----------------------------------------");

	
//	3) Write a Program To print 1 to 100 Odd nos.
	int b=1;

	while(b<=100)
	{
		
		if(b%2!=0)
			{
			System.out.print(b+" ");
			}
			
		b++;
	}
	System.out.println();
	System.out.println("-----------------------------------------");

	
	
//	4) Write a Program To print 1 to 100 even nos.
	int b2=1;

	while(b2<=100)
	{
		
		if(b2%2==0)
			{
			System.out.print(b2+" ");
			}
			
		b2++;
	}
	System.out.println();
	System.out.println("-----------------------------------------");

//	5) Write a Program To print sum of 1 to 50 Even  nos.
	int b1=1;
   int sumEven=0;
	while(b1<=50)
	{
		
		if(b1%2!=0)
			{
			sumEven+=b1;
			}
			
		b1++;
	}
	System.out.println(" sumeven is "+sumEven);
	System.out.println("-----------------------------------------");
	//9) Write a Program To print sum of odd and even no.

	int bb=1;
	   int sumOdd=0;
		while(bb<=50)
		{
			
			if(bb%2!=0)
				{
				sumOdd+=bb;
				}
				
			bb++;
		}
		System.out.println(" sumeven is "+sumOdd);
		
	//11) Write a Program To	 print 1 to 100 no.
	int c=1;
	while(c<=100)
	{
		System.out.print( c+" ");
		c++;
	}
	System.out.println("-----------------------------------------");

	//12) Write a Program To print 100 to 1 no.
	int  d =100;
	while(d>=1)
	{
		System.out.print(" "+d);
		d--;
	}
	System.out.println("-----------------------------------------");

	//13) Write a Program To print 30 to 50 no.
	int e=30;
	while(e<=50)
	{
		System.out.print(" "+e);
		e++;
	}
	System.out.println("-----------------------------------------");

	
	///15) Write a Program To print count of odd No 1 to 25 no.	
	int k=1;
	int countodd=0;
	while(k<=25)
	{
		if(k%2==0)
		{
			countodd++;
		}
		k++;
	}
	System.out.println(" even count"+countodd);
	System.out.println("-----------------------------------------");
//7) Write a Program To print -45 to +45 nos.  // negative no and positive no
int r =-45;
while(r<=45)
{
	
	System.out.print(r+" ");
	r++;
}
//8) Write a Program To print 50 to 100 nos.
int p =50;
while(p<=100)
{
	
	System.out.print(p+" ");
	p++;
}
//11) Write a Program To	 print 1 to 100 no.

int b3=1;

while(b3<=100)
{
		System.out.print(b3+" ");
		b3++;
}
System.out.println();
System.out.println("-----------------------------------------");
//12) Write a Program To print 100 to 1 no.
int b4=100;

while(b4>=1)
{
		System.out.print(b4+" ");
		b4--;
}
System.out.println();
System.out.println("-----------------------------------------");
//14) Write a Program To print count of even No 1 to 25 no.
	int s=1;
	int count=0;
	while(s<=25)
	{
		if(s%2==0)
		{
			count++;
		}
		
	}
	System.out.println(" even count"+count);
	System.out.println("-----------------------------------------");
	///15) Write a Program To print count of odd No 1 to 25 no.	
		int k1=1;
		int countoddd=0;
		while(k1<=25)
		{
			if(k1%2==0)
			{
				countoddd++;
			}
			k1++;
		}
		System.out.println(" even count"+countoddd);
		System.out.println("-----------------------------------------");

}
}
