package com.TreeGraph.ProductInventory;

public class ProductBST {
	
	private BSTNode root;
	
	public ProductBST() {
		root =null;
	}
	
	public void insertOrUpdate(Product product) {
		root= insertorUpdateRec(root, product);
	}
	
	public BSTNode insertorUpdateRec(BSTNode node, Product product) {
		if(node==null)
			return new BSTNode(product);
					
		if(product.sku<node.product.sku) {
			node.left =insertorUpdateRec(node.left,product);
		}
		else if(product.sku>node.product.sku) {
			node.right = insertorUpdateRec(node.right, product);
		}
		else {
			node.product.name = product.name;
			node.product.price = product.price;
		}
		return node;
	}
	public Product search(int sku) {
		BSTNode node = searchRec(root,sku);
		return node!=null ? node.product:null;
	}
	
	private BSTNode searchRec(BSTNode node, int sku) {
		if(node==null || node.product.sku==sku)
			return node;
		
		if(sku<node.product.sku)
			return searchRec(node.left,sku);
		else
			return searchRec(node.right, sku);
	}
	
	public void displaySorted() {
		System.out.println("\nProducts in sortrd SKU order: ");
		inOrderRec(root);
	}
	private void inOrderRec(BSTNode node) {
		if(node!=null) {
			inOrderRec(node.left);
			System.out.println(node.product);
			inOrderRec(node.right);
		}
	}
}