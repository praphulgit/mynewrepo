package com.spring.ioc;

public class Account {

	private int accnum;
	private String atype;
	private double bal;

	private Account() {
		System.out.println("In side account -D-C");
	}

	public int getAccnum() {
		return accnum;
	}

	public void setAccnum(int accnum) {
		this.accnum = accnum;
	}

	public String getAtype() {
		return atype;
	}

	public void setAtype(String atype) {
		this.atype = atype;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	@Override
	public String toString() {
		return "Account [accnum=" + accnum + ", atype=" + atype + ", bal=" + bal + "]";
	}

}
