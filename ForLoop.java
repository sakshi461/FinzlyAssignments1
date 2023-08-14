package com.javabysakshi;

public class ForLoop {
  
	public static void main(String[] args) {
		
		//1) Write a Program To print 1 to 25 nos.
		System.out.println( "------------------print 1 to 25 nos.-----------------");
		
			for(int i=1;i<=25;i++)
			   {
				System.out.print(i+" ");   
			   }
			System.out.println();
			
	   //2) Write a Program To print 25 to 1 nos.
			System.out.println( "------------------print 25 to 1 nos.-----------------");
			for(int i=25;i>=1;i--)
		   {
			System.out.print(i+" ");   
		   }
		
		System.out.println();
		
				
		//3) Write a Program To print 1 to 100 Odd nos.
		System.out.println( "------------------print 1 to 100  Odd nos.-----------------");
		for(int i=1;i<=100;i++)
		{
			if(i%2!=0)
			{
			System.out.print(i+" ");   
		   }
		}
		
		System.out.println( "------------------print 25 to 1 nos.-----------------");

		//4) Write a Program To print 1 to 100 even nos.
		System.out.println();
		System.out.println( "------------------print 1 to 100  EVEN nos.-----------------");

		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
			System.out.print(i+" ");   
		   }
			}
		//5) Write a Program To print sum of 1 to 50 Odd nos.
		System.out.println();
		System.out.println( "------------------print 25 to 1 nos.-----------------");

		int sumodd=0;
		for(int i=1;i<=50;i++)
		{
			if(i%2!=0)
			{
			sumodd+=i;
		   }
			}
         System.out.println("sum of all odd number between 1 to 50 is "+sumodd);
		
		//	6) Write a Program To print sum of 1 to 50 EVEN nos.
	     System.out.println();

		   int sumeven=0;
			for(int i=1;i<=50;i++)
			{
				if(i%2==0)
				{
				sumeven+=i;
			   }
				}
		System.out.println("sum of all odd number between 1 to 50 is "+sumeven);
			
		System.out.println( "------------------print 25 to 1 nos.-----------------");

		//Write a Program To print -45 to +45 nos.  // negative no and positive no
		System.out.println("********printing of -45 to 45*******");
		System.out.println();

		for(int i=-45;i<=45;i++)
			{
				System.out.print(i+" ");   
			}
			System.out.println();

			
			
			System.out.println( "------------------print 25 to 1 nos.-----------------");

			
		//	8) Write a Program To print 50 to 100 nos.
			System.out.println("******printing of 50 to 100*******");

			for(int i=50;i<=100;i++)
			{
				System.out.print(i+" ");   
			}
			System.out.println();
			
			
			
			System.out.println( "------------------print 25 to 1 nos.-----------------");

		//	9) Write a Program To print sum of odd and even no.
             int sumEven=0;
             int sumOdd=0;
			for(int i=1;i<=10;i++)
			{
				if(i%2==0)
				{
					sumEven+=i;
				}
				if(i%2!=0)
				{
					sumOdd+=i;
				}
				
			}
			
	
			System.out.println( "------------------print 25 to 1 nos.-----------------");

			//10) Write a Program To print even and odd No
			for(int i=1;i<50;i++)
			{
				if(i%2==0)
				{
             System.out.print(i+" ");
				}
			}
			for(int i=1;i<50;i++)
			{
				if(i%2!=0)
				{
              System.out.println(i+" ");
				}
			}
			
			System.out.println( "------------------print 25 to 1 nos.-----------------");

			
			
		//11) Write a Program To	 print 1 to 100 no.
			System.out.println("printing of 1 to 100");

			for(int i=1;i<=100;i++)
			   {
				System.out.print(i+" ");   
			   }
			System.out.println();
			System.out.println( "------------------print 25 to 1 nos.-----------------");

			
		//	12) Write a Program To print 100 to 1 no.
			System.out.println("********printing of 100 to 1*******");

			for(int i=100;i>=1;i--)
			   {
				System.out.print(i+" ");   
			   }
			System.out.println();

			System.out.println( "------------------print 25 to 1 nos.-----------------");

			
		//13) Write a Program To print 30 to 50 no.
			System.out.println("********printing of 30 to 50*******");
			for(int i=30;i<=50;i++)
			   {
				System.out.print(i+" ");   
			   }
			System.out.println();
			System.out.println( "------------------print 25 to 1 nos.-----------------");

   //14) Write a Program To print count of even No 1 to 25 no.
			System.out.println("********printing of  count of even No 1 to 25 no.*******");
			System.out.println();
                int counteven=0;
			for(int i=1;i<=25;i++)
			   {
				if(i%2==0)
				{
				counteven++;
				}
				}
			System.out.println(counteven);
			
			System.out.println( "------------------print 25 to 1 nos.-----------------");

			
			
//15) Write a Program To print count of odd No 1 to 25 no.			

			System.out.println("********printing of  count of odd No 1 to 25 no.*******");
			 int countOdd=0;
				for(int i=1;i<=25;i++)
				   {
					if(i%2!=0)
					{
					countOdd++;
					}
					}
				System.out.println(countOdd);

		}
	
	
	}
