package com.collection.pra;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;

public class Collection {

	public static void main(String[] args) {

		System.out.println("ArrayList");
	      ArrayList<String> city=new ArrayList<String>(); 
	      city.add("Patna");//
	      city.add("Ranchi"); 
	      System.out.println(city); 
	      
	      //creating vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(150); 
	      vec.addElement(301); 
	      System.out.println(vec);
	      
	      //creating linked-list
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>(); 
	      names.add("Ankit"); 
	      names.add("Jinny"); 
	      
	      Iterator<String> itr=names.iterator(); 
	      while(itr.hasNext()){ 
	      System.out.println(itr.next()); 
	 
	      //creating hash-set
	      System.out.println("\n");
	      System.out.println("HashSet");
	      HashSet<Integer> set=new HashSet<Integer>(); 
	      set.add(178); 
	      set.add(183); 
	      set.add(172);
	      set.add(194);
	      System.out.println(set);
	 
	      //creating linked-hash-set
	      System.out.println("\n");
	      System.out.println("LinkedHashSet");
	      LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>(); 
	      set2.add(15); 
	      set2.add(16); 
	      set2.add(18);
	      set2.add(19); 
	      System.out.println(set2);
	      } 
	   } 
	}
	


