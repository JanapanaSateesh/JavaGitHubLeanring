package com.astec.collectionscls;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> cars=new ArrayList<String>();
		cars.add("Hyundai");
		cars.add("i10");
		cars.add("audi");
		cars.contains("Benz");
		
		for(int i=0;i<cars.size();i++) {
			System.out.println(cars.get(i));
		}
		
		for(String car:cars) {
			System.out.println(car);
		}
	}

}
