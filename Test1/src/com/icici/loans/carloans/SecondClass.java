package com.icici.loans.carloans;

public class SecondClass 

{
	
	//data---properties(data variables)
	//operations--behaviors(methods)
	
int a=10,b=15,c;

public void add() 

{
	c=a+b;
	System.out.println("Addition of a&bis:"+c);
}

public void sub() 

{
	c=b-a;
	System.out.println("Substraction of a&bis:"+c);
}

public static void main(String[] args) 

{
System.out.println("Hi Thanish how are you!");

SecondClass obj=new SecondClass();

obj.add();
obj.sub();
System.out.println(obj.c);

}

}
