package com.method;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DifferentMethods {

	public static void main(String[] a1) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Product price and percentage");
		double price=scanner.nextDouble();
		double percentage=scanner.nextDouble();
		DifferentMethods diff=new DifferentMethods();
		System.out.println(diff.toString());
		double discount=diff.findDiscount(price,percentage);
		System.out.println("your discount amount is Rs. "+discount);
		List<Employee>empList= DifferentMethods.getListEmployees();
		System.out.println(empList);
			

	}
	



	public double findDiscount(double Price)  {
		
		
		return (Price*10)/ 100;
	}
		public double findDiscount(double price,double percentage ) {
			return (price*percentage)/100;
		}
		
		public String toString() {
				return "This class overrides to String()";
				
			}
		public static List<Employee> getListEmployees() {
			
			List<Employee> list=new ArrayList<Employee>();
			
			list.add(new Employee("eid=22,ename=surya,salary=15000.0"));
			list.add(new Employee());
			list.add(new Employee());
		
		    return list;
		}
		
	
	

}
