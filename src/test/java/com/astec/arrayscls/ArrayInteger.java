package com.astec.arrayscls;

public class ArrayInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array- To store multiple homogeneous elements
		//Arrays are fixed in size
		//indexes start from Zero
		//we can access using index [0]
		//Arrays follows insertion order
		
		//Initilization of an array
		int[] numbers= {10,15,30,23,70};
		//System.out.println(numbers.length);
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]%2==0) {
				//System.out.println(numbers[i]);
			}else {
				System.out.println(numbers[i]);
			}
		}

		
		
		
//		int[] values=new int[4];
//		values[0]=20;
//		values[1]=30;
//		values[2]=40;
//		values[3]=50;
	}

}
