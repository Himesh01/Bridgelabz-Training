package com.TreeGraph.GamingApp;

public class Player {
	public String name;
	public int point;
	
	public Player(String name, int point) {
		this.name = name;
		this.point = point;
	}
	
	@Override
	public String toString() {
		return "Name: "+name+", points: "+point;
	}
}