package com.astec.automation;

public class EncapsulationCls {

	
	public int acountNumber1=2;
	public int amount1=1000;
	
	//To make the data members private, For security reasons
	private int acountNumber;
	private int amount;
	
	public int getAcountNumber() {
		return acountNumber;
	}
	public void setAcountNumber(int acountNumber) {
		this.acountNumber = acountNumber;
	}
	
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
