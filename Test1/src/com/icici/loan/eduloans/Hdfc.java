package com.icici.loan.eduloans;

public class  Hdfc implements Rbi

{
	public static void main(String[] args) 
	
	{
		
		Hdfc obj1=new Hdfc();
		obj1.Withdrawl();
		obj1.Deposit();
		
		icici obj=new icici();
		obj.Withdrawl();
		obj.Deposit();
		
	}

	@Override
	public void Withdrawl() 
	
	{
		// TODO Auto-generated method stub
		System.out.println("I have overridden Withdrawl from Hdfc");
	}

	@Override
	public void Deposit() 
	
	{
		System.out.println("I have overridden Deposit from Hdfc");
		
	}

}
