package com.icici.loan.eduloans;

public class icici implements Rbi

{
public static void main(String[] args) 

{
	icici obj=new icici();
	obj.Withdrawl();
	obj.Deposit();
}
	@Override
	public void Withdrawl() 
	
	{
		System.out.println("I have overridden Withdrawl from ICICI");
		
	}

	@Override
	public void Deposit() 
	{
		System.out.println("I have overridden Deposit from ICICI");
		
	}

}
