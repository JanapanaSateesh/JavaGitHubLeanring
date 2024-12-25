package com.astec.collectionscls;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArrayList-> Group of heterogeneous elements/objects
		//It follows insertion order
		//It is dynamic size;
		//It allows multiple null values
		//To get length -> use size method
		// To access the element -> .get(index)
		

				
		//List is a interface -> ArrayList -> Class
		List<Integer> list=new ArrayList<Integer>();
		list.add(20);
		list.add(10);
		list.add(50);
		list.add(45);
//		list.add(null);
//		list.add(null);
//		list.add(null);
		
		//list.remove(2);
		System.out.println(list);
		//list.set(1, 30);
		//System.out.println(list);
		for(int i=0;i<list.size();i++) {
			//System.out.println(list.get(i)+50);
			
			if(list.get(i)%2==0) {
				System.out.println(list.get(i));
			}
		}
		
		//Advanced For loop
		for(Integer number:list) {
			System.out.println(number+100);
		}
		
		
		ArrayList ele=new ArrayList();
		ele.add(20);
		ele.add("Padhma");
		ele.add('P');
		
		System.out.println(ele);
		
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(20);
		list1.add(40);
		list1.add(50);
		list1.add(23);
		System.out.println(list.equals(list1));
		System.out.println( list1.contains(20));
		
		
		//You have Purchase Requisition PR123
		//Step1-DB Connect 
		//Step2- Select RequistionNumber from ["PR"   " PR1" PR2 PR3....PR123]
		//Step3 - Empty List crreate list.add(renumber)
		//list.contains(
		
		
	}

}
