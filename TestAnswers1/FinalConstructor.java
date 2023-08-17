package com.javabysakshi.TestAnswers1;

public class FinalConstructor {
public FinalConstructor()
{
	System.out.println("you are using free please update !!!!!!!!!!!!!!!!!!");
}
public FinalConstructor(Transaction t)
{
	if(t!=null)
	{
		System.out.println("Your product key is "+t.productKey+"  ******!!!Enjoy your plan !!!*****");
	}
	else
	{
		System.out.println("Transaction is not done yet first activate your productkey !!");
	}
}

public static void main(String[] args) {
	Transaction t=new Transaction();
	FinalConstructor f=new FinalConstructor(t);
	FinalConstructor f1=new FinalConstructor(null);
}
}
