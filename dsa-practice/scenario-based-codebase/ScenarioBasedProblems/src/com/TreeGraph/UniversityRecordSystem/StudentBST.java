package com.TreeGraph.UniversityRecordSystem;

public class StudentBST {

	private BstNode root;
	
	public StudentBST() {
		root =null;
	}
	
	public void insert(Student student) {
		root = insertRec(root,student);
	}
	
	private BstNode insertRec(BstNode node, Student student) {
		if(node==null) {
			return new BstNode(student);
		}
		
		if(student.rollNo < node.student.rollNo) {
			node.left = insertRec(node.left, student);
		}
		else if(student.rollNo > node.student.rollNo) {
			node.right = insertRec(node.right, student);
		}
		else {
			System.out.println("Roll number "+student.rollNo+ " already exists.");
		}
		return node;
	}
	
	public Student search(int rollNumber) {
		BstNode node = searchRec(root,rollNumber);
		return node!=null ? node.student: null;
	}
	
	private BstNode searchRec(BstNode node, int rollNumber) {
		if(node==null || node.student.rollNo==rollNumber) {
			return node;
		}
		
		if(rollNumber<node.student.rollNo) return searchRec(node.left, rollNumber);
		else return searchRec(node.right, rollNumber);
	}
	
	public void delete(int rollNumber) {
		root = deleteRec(root, rollNumber);
	}
	
	private BstNode deleteRec(BstNode node, int rollNumber) {
        if (node == null) return null;

        if (rollNumber < node.student.rollNo) {
            node.left = deleteRec(node.left, rollNumber);
        } else if (rollNumber > node.student.rollNo) {
            node.right = deleteRec(node.right, rollNumber);
        } else {
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;

            BstNode successor = minValueNode(node.right);
            node.student = successor.student;
            node.right = deleteRec(node.right, successor.student.rollNo);
        }
        return node;
	}
	
	private BstNode minValueNode(BstNode node) {
        BstNode current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }
	
	public void displayInOrder() {
        System.out.println("Students in Sorted Order by Roll Number:");
        inOrderRec(root);
    }

    private void inOrderRec(BstNode node) {
        if (node != null) {
            inOrderRec(node.left);
            System.out.println(node.student);
            inOrderRec(node.right);
        }
    }
}