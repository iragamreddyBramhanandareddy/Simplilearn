package com.lession2.practice;
class Std
{
	int id;
	String name;
	Std(int i,String n)
	{
	id=i;
	name=n;
	}
	void display() 
	{
	System.out.println(id+" "+name);
	}
	}
public class ParConstructor {

	public static void main(String[] args) {
		Std std1=new Std(7,"Surya");
		Std std2=new Std(25,"Jeeva");
		std1.display();
		std2.display();

	}

}
