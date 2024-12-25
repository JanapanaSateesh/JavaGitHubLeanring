package com.astec.automation;

public class StringCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String is a immutable class
		//go for StringBuilder/buffer
//		
//		String str1="Padhma";
//		String str2="Padhma";
//		String val="1000";
//		int num=Integer.valueOf(val);
		
		
		String val2="PRJ-123456AS";
		
		int firstindex=val2.indexOf('-');
		
		String afterExtraction= val2.substring(firstindex+1,10);
		
		System.out.println(afterExtraction);
		
		
		
//		System.out.println(str1);
//		System.out.println(str2);
//		if(str1.equals(str2)) { //It compare the address
//			System.out.println("Both are equal");
//		}else {	
//			System.out.println("Both are not equal");
//		}
//		
//		String name1=new String("Padhma");
//		String name2=new String("Padhma");
//		System.out.println(name1);
//		System.out.println(name2);
//		
//		if(name1.equals(name2)) {
//			System.out.println("Both are equal");
//		}else {
//			System.out.println("Both are not equal");
//		}
//		//System.out.println(name1);
	}

}
