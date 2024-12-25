package com.astec.arrayscls;

public class StringRevUsingStrBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Padhma";
		
		StringBuilder strbuilder=new StringBuilder("Padhma");
		System.out.println(strbuilder.reverse());
		
		
//		char[] nameToCharArray= name.toCharArray();
//		
//		
//		for(int i=nameToCharArray.length-1;i>=0;i--) {
//			strbuilder.append(nameToCharArray[i]);
//		}
//		System.out.println(strbuilder);
	}

}
