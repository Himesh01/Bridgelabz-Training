package com.TreeGraph.MusicApp;

public class MusicBST {
	
	BSTNode root;
	
	public MusicBST() {
		this.root = null;
	}
	
	public void insert(Music music) {
		root = insertRec(root, music);
	}
	public BSTNode insertRec(BSTNode node, Music music) {
		if(node==null)
			return new BSTNode(music);
		
		if(music.track<node.music.track)
			node.left = insertRec(node.left,music);
		else if(music.track>node.music.track)
			node.right = insertRec(node.right, music);
		else {
			node.music.name = music.name;
		}
		return node;
	}
	
	public Music search(int track) {
		BSTNode node = searchRec(root, track);
		return node!=null? node.music:null;
	}
	
	private BSTNode searchRec(BSTNode node, int track) {
		if(node==null || node.music.track==track) 
			return node;
		
		if(track<node.music.track) {
			return searchRec(node.left, track);
		}
		else {
			return searchRec(node.right,track);
		}
	}
	public void displaySorted() {
		System.out.println("Music in sorted by track id: ");
		inOrderRec(root);
	}
	private void inOrderRec(BSTNode node) {
		if(node!=null) {
			inOrderRec(node.left);
			System.out.println(node.music);
			inOrderRec(node.right);
		}
	}
}