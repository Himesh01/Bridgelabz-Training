package com.TreeGraph.GamingApp;

public class BSTNode {
	public Player player;
	public BSTNode left, right;
	public int height;
	
	public BSTNode(Player player) {
		this.player = player;
		this.left = null;
		this.right = null;
		this.height=1;
	}
}
