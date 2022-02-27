package com.lession3.oopsConcept;

public class Polymorphism {

	public static void main(String[] args)
	{
		Polymorphism s = new Polymorphism(); 
		 System.out.println("The sum of 2 Numbers is : "+s.sum(10, 20)); 
		 System.out.println("The sum of 3 Numbers is : "+s.sum(10, 20, 30)); 
		 System.out.println("The sum of 2 Numbers is : "+s.sum(10.5, 20.5)); 
		 } 
		 
		  public int sum(int x, int y) 
		  { 
		  return (x + y); 
		  } 
		  public int sum(int x, int y, int z) 
		  { 
		  return (x + y + z); 
		  } 
		  public double sum(double x, double y) 
		  { 
		  return (x + y); 

	}

}
