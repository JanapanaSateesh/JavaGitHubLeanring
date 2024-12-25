package com.astec.automation;

public class AbstractChildCls extends AbstractionCls{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractChildCls obj=new AbstractChildCls();
		obj.Display();
		obj.Details();
	}

	@Override
	public void Details() {
		// TODO Auto-generated method stub
		System.out.println("This is Padhma");
	}

}
