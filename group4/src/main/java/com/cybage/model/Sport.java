package com.cybage.model;

public class Sport {
	private int sId;
	private String sName;

	
	public Sport(String sName) {
		
		
		this.sName = sName;
	}	
	
	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	

	@Override
	public String toString() {
		return "Sport [sId=" + sId + ", sName=" + sName + "]";
	}

}
