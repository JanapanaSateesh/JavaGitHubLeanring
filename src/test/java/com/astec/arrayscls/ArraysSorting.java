package com.astec.arrayscls;

public class ArraysSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] numbers= {45,30,60,20,5,15};
       //5,15,20,30,45,60
       //[0]=45 => compare with all remaining elements
       //[1=0+1]=30 => 
       
       //box3=after swap 30,20=>20=>5
       
       //ascending done
       //descemding done
       //Min Done
       //Max Done
       int temp=0;
       
       for(int i=0;i<numbers.length;i++) {
    	   for(int j=i+1;j<numbers.length;j++) 
    	   {
    		   if(numbers[i]>numbers[j]) 
    		   {
    			   temp=numbers[i];
    			   numbers[i]=numbers[j];
    			   numbers[j]=temp;
    		   }
    	   }
       }
       
       for(int i=0;i<numbers.length;i++) {
    	   System.out.println(numbers[i]);
       }
        System.out.println("Min Value:"+numbers[0]);
        System.out.println("Max Value is:"+numbers[numbers.length-1]);
       
       
	}

}
