package com.astec.collectionscls;

import java.util.HashSet;

public class DuplicatesInaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="abccbdgff"; //abcdgf
		
		char[] strchar= str.toCharArray();
		HashSet<Character> chars=new HashSet<Character>(); //a//b//c//c
		HashSet<Character> duplicatechars=new HashSet<Character>();
		
		String stroriginal="";
		
		for(int i=0;i<strchar.length;i++) {
			if(chars.add(strchar[i])) 
			{
				stroriginal=stroriginal+strchar[i];
			}else {
				duplicatechars.add(strchar[i]);
			}
		}
		System.out.println("Original:"+chars);
		System.out.println("Duplicate Chars:"+duplicatechars);
		System.out.println(stroriginal);
	}

}
