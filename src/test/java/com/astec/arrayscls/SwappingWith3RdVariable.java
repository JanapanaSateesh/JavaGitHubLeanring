package com.astec.arrayscls;

public class SwappingWith3RdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int box1=10;
		int box2=20;
		int box3;
		System.out.println("Before Swapping:"+box1+" "+box2);
		
		box3=box1;
		box1=box2;
		box2=box3;
		System.out.println("After Swapping:"+box1+" "+box2);
	}

}
