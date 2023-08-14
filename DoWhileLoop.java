package com.javabysakshi;

public class DoWhileLoop {

	public static void main(String[] args) {
		
	
	//1) Write a Program To print 1 to 25 nos.
int n=1;
do
{
	System.out.print(n+" ");
	n++;
}
while(n<=10);
System.out.println();
System.out.println("--------------------------------");
//2) Write a Program To print 25 to 1 nos.
int n1=25;
do
{
	System.out.print(n1+" ");
	n1--;
}
while(n1>=1);
System.out.println();

System.out.println("--------------------------------");

//3) Write a Program To print 1 to 100 Odd nos.
int n2=1;
do
{
	if(n2%2!=0)
	System.out.print(n2+" ");
	n2++;
}
while(n2<=100);
System.out.println();

System.out.println("--------------------------------");
//4) Write a Program To print 1 to 100 even nos.
int n3=1;
do
{
	if(n3%2==0)
	System.out.print(n3+" ");
	n3++;
}
while(n3<=100);
System.out.println();

System.out.println("--------------------------------");
// Write a Program To print sum of 1 to 50 Odd nos.
int n4=1;
int sumOdd=0;
do
{
	if(n4%2!=0)
	sumOdd+=n4;
	n4++;
}
while(n4<=50);
System.out.println("sum of odd "+sumOdd);

System.out.println("--------------------------------");
//6) Write a Program To print sum of 1 to 50 EVEN nos.

int sumEven=0;
int n5=1;
do
{
	if(n5%2==0)
	sumEven+=n5;
	n5++;
}
while(n5<=50);
System.out.println("sum of even "+sumEven);

System.out.println("--------------------------------");

//7) Write a Program To print -45 to +45 nos.  // negative no and positive no

int a=-45;
do {
	System.out.print(a+" ");
	a++;
}
while(a<=45);
//9) Write a Program To print sum of odd and even no.
int sume=0;
int sumo=0;
int b=1;
do {
	if(b%2==0)
	{
		sume+=b;
	}
	else
	{
		
		sumo+=b;
	}
}while(b<=50);

System.out.println("sum of even "+sume+"   sumo of odd "+sumo);	
System.out.println("-------------------------------------------");
//50 to 100
int i1=50;
do
{
	System.out.print(i1+" ");
	i1++;
}
while(i1<=100);

//11) Write a Program To	 print 1 to 100 no.


int h=1;
do
{
	System.out.print(h+" ");
	h++;
}
while(h<=100);
System.out.println();
System.out.println("--------------------------------");

//12) Write a Program To print 100 to 1 no.
int h1=100;
do
{
	System.out.print(h1+" ");
	h1--;
}
while(h1>=1);
System.out.println();
System.out.println("--------------------------------");

//13) Write a    Program To print 30 to 50 no.
int i=30;
do
{
	System.out.print(i+" ");
	i++;
}
while(i<=50);
System.out.println();
System.out.println("--------------------------------");

int counteven=0;
int countOdd=0;
int bb=1;
do {
	if(bb%2==0)
	{
		counteven+=bb;
	}
	else
	{
		
		countOdd+=bb;
	}
}while(bb<=50);







}
}