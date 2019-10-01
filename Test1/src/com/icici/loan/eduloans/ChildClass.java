package com.icici.loan.eduloans;

public class ChildClass extends FirstAbstract


{

	public static void main(String[] args) 
	
	{
		ChildClass c=new ChildClass();
		c.m1();
		c.m2();
	}
	
	
	  public void m1()
	  
	  { System.out.println("i am m1 overridden from class FirstAbstract"); }
	 
	
	@Override
	public void m2() 
	
	{
		System.out.println("i am m2 overridden from class FirstAbstract");
		
	}



}
