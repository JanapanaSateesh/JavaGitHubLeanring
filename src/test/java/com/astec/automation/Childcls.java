package com.astec.automation;

public class Childcls extends parentCls{
	String name2="Sateesh";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childcls obj=new Childcls();
		obj.soundAnimal();
		
		EncapsulationCls obj2=new EncapsulationCls();
		System.out.println(obj2.amount1);
		
		//obj2.setAcountNumber(1);
		System.out.println(obj2.getAcountNumber());
		
		//obj2.setAmount(1000);
		System.out.println(obj2.getAmount());

	}
	
	@Override
	public void soundAnimal() {
		System.out.println("Lion roar");
	}
	
  
}
