package com.astec.collectionscls;

import java.util.HashSet;
import java.util.Iterator;

public class SetExm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set ->It doesn't allow duplicates
		//It doesn't follow insertion order
		//It allows only one null values
		//To add values we can use add method
		
		

		HashSet<String> carsset=new HashSet<String>();
		carsset.add("Hyundai");
		carsset.add("i10");
		carsset.add("audi");
		carsset.add("Hyundai");
//		carsset.add(null);
//		carsset.add(null);
		System.out.println(carsset);
		Iterator<String> itr=carsset.iterator(); //[audi, i10, Hyundai]
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		for(String car:carsset) {
			
			System.out.println(car);
		}
		
		
	}

}
