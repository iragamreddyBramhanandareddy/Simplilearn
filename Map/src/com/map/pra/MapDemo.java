package com.map.pra;
import java.util.*;
public class MapDemo{

	public static void main(String[] args) {
	
			// map
			//Hashmap
			HashMap<Integer,String> hm=new HashMap<Integer,String>(); 
			hm.put(1,"Satwi"); 
			hm.put(2,"Yas"); 
			hm.put(3,"Sai"); 
		 
			System.out.println("\nThe elements of Hashmap are "); 
			for(Map.Entry m:hm.entrySet()){ 
			System.out.println(m.getKey()+" "+m.getValue()); 
		 }
		 
			//HashTable
		 
			 Hashtable<Integer,String> ht=new Hashtable<Integer,String>(); 
			 
			 ht.put(4,"Arjun"); 
			 ht.put(5,"Nandu"); 
			 ht.put(6,"Aswini"); 
			 ht.put(7,"Kasi"); 
			 System.out.println("\nThe elements of HashTable are "); 
			 for(Map.Entry n:ht.entrySet()){ 
			 System.out.println(n.getKey()+" "+n.getValue()); 
		 }
		 
		 
			 //TreeMap
		 
			 TreeMap<Integer,String> map=new TreeMap<Integer,String>(); 
			 map.put(8,"Yoga"); 
			 map.put(9,"Mahi"); 
			 map.put(10,"Bhoom"); 
		 
			 System.out.println("\nThe elements of TreeMap are "); 
			 for(Map.Entry l:map.entrySet()){ 
			 System.out.println(l.getKey()+" "+l.getValue()); 
		 } 
		 
		  
		

	}

}
