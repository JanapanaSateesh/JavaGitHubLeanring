package com.astec.arrayscls;

public class CharCountInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Welcome to automation training";
//		char[] charstr= str.toCharArray();
//		System.out.println(charstr.length);
		//count number of words
		//reverse of sentence
		
		String[] strarray= str.split(" "); //["Welcome", "to","automation","training"]
		String rev="";
		
		for(int i=strarray.length-1;i>=0;i--) {
			rev=rev+strarray[i];
			rev=rev+" ";
		}
		System.out.println(rev);
		
		
	}

}
