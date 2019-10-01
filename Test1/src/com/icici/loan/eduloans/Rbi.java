package com.icici.loan.eduloans;

public interface Rbi 

{
public void Withdrawl();
public void Deposit();

public static void main(String[] args) 

{
	/*Hdfc obj1=new Hdfc();
	obj1.Withdrawl();
	obj1.Deposit();
	
	icici obj=new icici();
	obj.Withdrawl();
	obj.Deposit();*/
	
	/*Rbi i =new icici();
	i.Withdrawl();
	i.Deposit();
	
	Rbi i1=new Hdfc();
	i1.Withdrawl();
	i1.Deposit();*/
	
	Rbi i;
	i =new icici();
	i.Withdrawl();
	i.Deposit();
	
	i =new Hdfc();
	i.Withdrawl();
	i.Deposit();
	
	
	
	
}
	
}
