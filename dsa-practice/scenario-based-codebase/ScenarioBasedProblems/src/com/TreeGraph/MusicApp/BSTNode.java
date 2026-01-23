package com.TreeGraph.MusicApp;

public class BSTNode {
	public Music music;
	public BSTNode left, right;
	
	public BSTNode(Music music) {
		this.music = music;
		this.left = null;
		this.right =null;
	}
}