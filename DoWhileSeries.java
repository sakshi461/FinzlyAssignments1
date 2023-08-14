package com.javabysakshi;

public class DoWhileSeries {
public static void main(String[] args) {
	//1 Generate the Series... 2 4 6 8 10 12 14 16 18 20.
			int i=2;
			 do{
				if(i%2==0)
					System.out.print(i+" ");
				i++;
			}while(i<=20);
		System.out.println();		
	    System.out.println("-------------------------------");
	
	//1 Generate the Series..9 18 27 36 45 54 63 72 81 90.. 
	int q=1;
	 do{
		System.out.print(q*9+" ");
		q++;
	 }
	 while(q<=10);
      System.out.println();		
      System.out.println("-------------------------------");

	//////9 Generate the series... 1 4 9 16 25 36 49 64 81 100.
	
			int i1=1;
			 do{
			
				System.out.print(i1*i1+" ");
				i1++;
			}while(i1<=10);
					
			 System.out.println();		
				System.out.println("-------------------------------");
		
				
			//3) Generate the Series... 1 -2 3 -4 5 -6 7 -8 9 -10.
                 int r =1;
                 do
                 {
                	 if(r%2==0) {
                	 System.out.print(" "+r*(-1));
                	 }
                	 else
                	 {
                		 System.out.print(" "+r);
                	 }
                	 r++;
                 }while(r<=10);
			//4Generate the Series... 5 10 15 20 25 30 35 40 45 50.
						 		int bb=5;
			 		 do{
			 			if(bb%5==0)
			 				System.out.print( bb+" ");
			 			bb++;
			 		}while(bb<=50);
			 		System.out.println();		
					System.out.println("-------------------------------");
					 
					
			 //5 Generate the Series... 1 10 100 1000.
			 				int c=1;
			 				 do{
			 						System.out.print(c+" ");
			 					c=c*10;
			 						
			 				}while(c<=1000);
			 				System.out.println();		
							System.out.println("-------------------------------");
							 
								
			 			
			 ///6 Generate the Series... 1  3  6  10  15  21  28  36  45.  
			 							int ans=0, j=1;
			 						do{
			 							ans+=j;
			 							System.out.print(ans+" ");
			 							j++;
			 						}while(j<10);
			 						
			 						System.out.println();		
			 						System.out.println("-------------------------------");
			 						 
			 						

			 		////7 Generate the Series... 8 16 24 32 40 48 56 64 72 80.
			 		      int k=8;
			 				do
			 				{
			 				if(k%8==0)
			 				System.out.print(k+" ");
			 			    k++;
			 			     }
			 				while(k<=80);
			 				System.out.println();		
							System.out.println("-------------------------------");
							 
						
			 	////8 Generate the Series... 0 1 1 2 3 5 8 13 21.
				int a=0, b1=1, answer=0, d=0;
				 do{
					answer=a+b1;
					System.out.print(a+" ");
					a=b1;
					b1=answer;
					
					d++;
				}while(d<10);
			

				System.out.println();		
				System.out.println("-------------------------------");
			 						 
			 					
								
			 	////Generate the Series... 8 16 24 32 40 48 56 64 72 80.
			 		int g=8;
					 do{
						if(g%8==0)
							System.out.print(g+" ");
						g++;
					}while(g<=80);
						
					System.out.println();		
					System.out.println("-------------------------------");
					
			 	////10 Generate the Series...3 6 9 12 15 18 21 24 27 30 .
			int num=1;
			 do{
				System.out.print(3*num+" ");
				num++;
			}while(num<=10);
			 System.out.println();		
				System.out.println("-------------------------------");
				
			 //11) Generate the Series... 7 14 21 28 35 42 49 56 63 70.

				int t=1;
				 do{
					System.out.print(7*t+" ");
					t++;
				}while(t<=10);
				 System.out.println();		
					System.out.println("-------------------------------");
					
          ////12Generate the Series... 4 8 12 16 20 24 28 32 36 40. 
					
					int s=1;
					 do{
						System.out.print(4*s+" ");
						s++;
					}while(s<=10);
				 System.out.println();		
					System.out.println("-------------------------------");
				

			 //13 Generate the Series... 10 20 30 40 50 60 70 80 90 100
			int w=1;
			 do{
				System.out.print(10*w+" ");
				w++;
			}while(w<=10);
		
					 System.out.println();		
						System.out.println("-------------------------------");
					
						
						
						
			//// 14 Generate the Series... 1 2 3 4 5 4 3 2 1.
				int ii=1;
				 do{
					System.out.print(ii+" ");
					ii++;
				}while(ii<=5);
				 
				int jj=4;
				 do{
					System.out.print(jj+" ");
					jj--;
				}while(jj>=1);
				 System.out.println();		
				System.out.println("-------------------------------");
				
							
							
							
			//15 Generate the Series... 6 12 18 24 30 36 42 48 54 60.
			 int p=1;
			 do{
				System.out.print(6*p+" ");
				p++;
			}while(p<=10);
		
			 System.out.println();		
				System.out.println("-------------------------------");
			 	
		
	}
	
}

