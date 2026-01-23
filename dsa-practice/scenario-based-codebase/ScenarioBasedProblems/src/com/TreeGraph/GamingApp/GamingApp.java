package com.TreeGraph.GamingApp;

public class GamingApp {

	private BSTNode root;
	
	private int height(BSTNode node) {
		return node==null? 0:node.height;
	}
	
	private int getBalance(BSTNode node) {
		return node==null ? 0: height(node.left)-height(node.right);
	}
	
	private BSTNode rightRotate(BSTNode y) {
		BSTNode x = y.left;
		BSTNode t2 = x.right;
		
		x.right = y;
		y.left = t2;
		
		y.height = Math.max(height(y.left), height(y.right))+1;
		x.height = Math.max(height(x.left), height(x.right))+1;
		
		return x;
	}
	
	private BSTNode leftRotate(BSTNode x) {
		BSTNode y = x.right;
		BSTNode t2 = y.left;
		
		y.left = x;
		x.right = t2;
		
		x.height = Math.max(height(x.left), height(x.right))+1;
		y.height = Math.max(height(y.left), height(y.right))+1;
		
		return y;
	}
	
	public void insertOrUpdate(Player player) {
		root = insert(root, player);
	}
	
	private BSTNode insert(BSTNode node, Player player) {
	    if (node == null)
	        return new BSTNode(player);

	    if (player.point < node.player.point)
	        node.left = insert(node.left, player);
	    else if (player.point > node.player.point)
	        node.right = insert(node.right, player);
	    else {
	        node.player = player;
	        return node;
	    }

	    node.height = 1 + Math.max(height(node.left), height(node.right));
	    int balance = getBalance(node);

	    // LL
	    if (balance > 1 && player.point < node.left.player.point)
	        return rightRotate(node);

	    // RR
	    if (balance < -1 && player.point > node.right.player.point)
	        return leftRotate(node);

	    // LR
	    if (balance > 1 && player.point > node.left.player.point) {
	        node.left = leftRotate(node.left);
	        return rightRotate(node);
	    }

	    // RL
	    if (balance < -1 && player.point < node.right.player.point) {
	        node.right = rightRotate(node.right);
	        return leftRotate(node);
	    }

	    return node;
	}

	
	public void remove(int points) {
		root = delete(root, points);
	}
	
		
	private BSTNode delete(BSTNode node, int points) {
		if(node==null) 
			return null;
		
		if(points<node.player.point)
			node.left = delete(node.left,points);
		
		else if(points>node.player.point) 
			node.right = delete(node.right,points);
		else {
			if (node.left == null)
			    return node.right;
			else if (node.right == null)
			    return node.left;
			else {
				BSTNode temp = minValueNode(node.right);
				node.player = temp.player;
				node.right = delete(node.right, temp.player.point);
			}
		}
		if (node == null)
            return null;

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        int balance = getBalance(node);

        // Balance cases
        if (balance > 1 && getBalance(node.left) >= 0)
            return rightRotate(node);

        if (balance > 1 && getBalance(node.left) < 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && getBalance(node.right) <= 0)
            return leftRotate(node);

        if (balance < -1 && getBalance(node.right) > 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
	}
	
	private BSTNode minValueNode(BSTNode node) {
        BSTNode current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    public void displayTopPlayers(int limit) {
        System.out.println("\nTop Players:");
        reverseInOrder(root, new int[]{0}, limit);
    }

    private void reverseInOrder(BSTNode node, int[] count, int limit) {
        if (node == null || count[0] >= limit)
            return;

        reverseInOrder(node.right, count, limit);

        if (count[0] < limit) {
            System.out.println(node.player);
            count[0]++;
        }

        reverseInOrder(node.left, count, limit);
    }
}