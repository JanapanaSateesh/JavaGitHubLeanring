package com.astec.arrayscls;

public class SwappingWithOut3RdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=10;
		int b=20;
		a=a+b; //a=10+20
		b=a-b;//b=10+20-20=10;
		a=a-b;//a=10+20-10=20
		System.out.println("After Swap:"+a+" "+b);
	}

}
