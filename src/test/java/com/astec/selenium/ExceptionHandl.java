package com.astec.selenium;

import junit.framework.Assert;

public class ExceptionHandl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Exception -> 
		 // checked exception Run Time Exce /static- 
		//unchecked exception Compile Time Exce/dynamic-
		//we can handle using try catch
		try {
			int[] arr= {20,10,30};
			System.out.println(arr[5]);
			
			
		}catch (Exception e) {
			// TODO: handle exception
			throw new ArrayIndexOutOfBoundsException("Index out of range");
			
		}finally {
			System.out.println("Final Block executed");
		}
		
	}

}
