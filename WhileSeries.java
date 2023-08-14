package com.javabysakshi;

public class WhileSeries {
	public static void main(String[] args) {
		
	
	//1) Generate the Series... 2 4 6 8 10 12 14 16 18 20.
	int i=1;
	while(i<=10)
	{
	    System.out.print(" "+i*2);
	    i++;
	}
	System.out.println();
	
	System.out.println("-----------------------------------------");

	//2) Generate the Series... 9 18 27 36 45 54 63 72 81 90. 
	
	int j=1;
	while(j<=10)
	{
	    System.out.print(" "+j*9);
	    j++;
	}
	System.out.println();
	
	System.out.println("-----------------------------------------");

//3) Generate the Series... 8 16 24 32 40 48 56 64 72 80.

		int a=1;
			while(a<=10)
			{
			    System.out.print(" "+a*8);
			    a++;
			}
			System.out.println();
			
			System.out.println("-----------------------------------------");
	
//			10) Generate the series... 3 6 9 12 15 18 21 24 27 30.
			int b=1;
			while(b<=10)
			{
			    System.out.print(" "+b*3);
			    b++;
			}
		
			System.out.println();
			

			System.out.println("-----------------------------------------");



//11) Generate the Series... 7 14 21 28 35 42 49 56 63 70. 
			int c=1;
			while(c<=10)
			{
			    System.out.print(" "+c*7);
			    c++;
			}

			System.out.println();
			
			
			
			System.out.println("-----------------------------------------");
	
			//12) Generate the Series... 4 8 12 16 20 24 28 32 36 40. 
			int d=1;
			while(d<=10)
			{
			    System.out.print(" "+d*4);
			    d++;
			}
			System.out.println();
			
			System.out.println("-----------------------------------------");


//13) Generate the Series... 10 20 30 40 50 60 70 80 90 100. 

	int z=1;
	while(z<=10)
	{
	    System.out.print(" "+z*10);
	    z++;
	}
	System.out.println();
	
	System.out.println("-----------------------------------------");


	//4) Generate the Series... 5 10 15 20 25 30 35 40 45 50.
	int k=1;
	while(k<=10)
	{
	    System.out.print(" "+k*5);
	    k++;
	}
	System.out.println();
	
	System.out.println("-----------------------------------------");



//5) Generate the Series... 1 10 100 1000.
	int q=1;
	while(q<=1000)
	{
	    System.out.print(" "+q);
	    q=q*10;
	}
     System.out.println();
	System.out.println("-----------------------------------------");
	
	//8) Generate the Series... 0 1 1 2 3 5 8 13 21.
	 int ii = 1, n = 10, firstTerm = 0, secondTerm = 1;

	    while (ii<= n) {
	      System.out.print(firstTerm + " ");

	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;

	      ii++;
	    }
	    System.out.println();
		System.out.println("-----------------------------------------");
		
//	 int n1=0,n2=1,n3,i1,count=10;    
//	 System.out.print(n1+" "+n2);//printing 0 and 1    
//	    
//	 for(i1=2;i<count;++i1)//loop starts from 2 because 0 and 1 are already printed    
//	 {    
//	  n3=n1+n2;    
//	  System.out.print(" "+n3);    
//	  n1=n2;    
//	  n2=n3;    
//	 }    
	  //7 
		int k1=1;
		while(k1<=10)
		{
		    System.out.print(" "+k1*8);
		    k1++;
		}
		System.out.println();
		
		System.out.println("-----------------------------------------");

//14) Generate the Series... 1 2 3 4 5 4 3 2 1. 
int n1=1;
int n2=4;
while(n1<=5)
{
	System.out.print(n1+" ");
	n1++;
}
while(n2>=1)
{
	System.out.print(n2+" ");
	n2--;
}
System.out.println();
	System.out.println("-----------------------------------------");
	
//3) Generate the Series... 1 -2 3 -4 5 -6 7 -8 9 -10.
int num=1;
while(num<=10)
{
	if(num%2==0)
	{
		System.out.print(num*(-1)+"  ");
	}
	else
	{
		System.out.print(num+" ");
	}
num++;
}
System.out.println();
	System.out.println("-----------------------------------------");
	
//6) Generate the Series... 1  3  6  10  15  21  28  36  45.   
int sum=0;
int number=1;
while(number<10)
{
	sum+=number;
	System.out.print(sum+" ");
	number++;
}
System.out.println();
	System.out.println("-----------------------------------------");
	//   //8) Generate the Series... 0 1 1 2 3 5 8 13 21.
	System.out.println("********printing the Series   0 1 1 2 3 5 8 13 21 *******");

	int a1=0;int b1=1;
	int c1;
	System.out.print(a1+" ");
	System.out.print(b1+" ");
	int l=1;
	while(l<8)
	{
		c1=a1+b1;
		System.out.print(c+" ");
		a1=b1;
		b1=c1;
		l++;
	}
////9) Generate the series... 1 4 9 16 25 36 49 64 81 100.
	
	System.out.println();
	System.out.println("-----------------------------------------");
	System.out.println("********printing the Series n 1 4 9 16 25 36 49 64 81 100"
			+ "  *******");
	int y=1;
	while(y<=10)
	{
		   System.out.print(" "+y*y);
		   y++;
	}
	System.out.println();
	System.out.println("-----------------------------------------");
 
	//15
	int p=1;
	while(p<=10)
	{
	    System.out.print(" "+p*6);
	    p++;
	}
	System.out.println();
	
	System.out.println("-----------------------------------------");

	
	
	}
}
