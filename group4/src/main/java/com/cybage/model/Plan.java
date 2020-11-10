package com.cybage.model;

public class Plan {

	private String pOffer;
	private String pBatch;
	private String pTime;
	private String pPrice;
	public Plan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Plan(String pOffer, String pBatch, String pTime, String pPrice) {
		super();
		this.pOffer = pOffer;
		this.pBatch = pBatch;
		this.pTime = pTime;
		this.pPrice = pPrice;
	}
	public String getpOffer() {
		return pOffer;
	}
	public void setpOffer(String pOffer) {
		this.pOffer = pOffer;
	}
	public String getpBatch() {
		return pBatch;
	}
	public void setpBatch(String pBatch) {
		this.pBatch = pBatch;
	}
	public String getpTime() {
		return pTime;
	}
	public void setpTime(String pTime) {
		this.pTime = pTime;
	}
	public String getpPrice() {
		return pPrice;
	}
	public void setpPrice(String pPrice) {
		this.pPrice = pPrice;
	}
	@Override
	public String toString() {
		return "Plan [pOffer=" + pOffer + ", pBatch=" + pBatch + ", pTime=" + pTime + ", pPrice=" + pPrice + "]";
	}
	
}
