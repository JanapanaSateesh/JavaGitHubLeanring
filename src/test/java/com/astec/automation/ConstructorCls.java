package com.astec.automation;

public class ConstructorCls {
	
	int x;
	int y;
	public ConstructorCls(int x,int y) {
		this.x=x;
		this.y=y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorCls obj=new ConstructorCls(10,20);
//		obj.x=10;
//		obj.y=20;
		int sum=obj.x+obj.y;
		System.out.println(sum);

	}

}
