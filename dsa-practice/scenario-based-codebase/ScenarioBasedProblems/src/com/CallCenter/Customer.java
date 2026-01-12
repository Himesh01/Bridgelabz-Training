package com.CallCenter;

public class Customer {
	private String id;
	private String name;
	private boolean vip;
	
	public Customer(String id, String name, boolean vip) {
		this.id = id;
		this.name = name;
		this.vip = vip;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public boolean isVip() {
		return vip;
	}
}
