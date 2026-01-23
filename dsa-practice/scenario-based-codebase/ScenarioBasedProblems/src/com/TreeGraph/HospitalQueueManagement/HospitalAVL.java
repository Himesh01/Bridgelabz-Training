package com.TreeGraph.HospitalQueueManagement;

public class HospitalAVL {

    PatientNode root;

    int height(PatientNode n) {
        return (n == null) ? 0 : n.height;
    }

    int getBalance(PatientNode n) {
        return (n == null) ? 0 : height(n.left) - height(n.right);
    }

    PatientNode rightRotate(PatientNode y) {
        PatientNode x = y.left;
        PatientNode T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    PatientNode leftRotate(PatientNode x) {
        PatientNode y = x.right;
        PatientNode T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    PatientNode insert(PatientNode node, int time, String name) {

        if (node == null)
            return new PatientNode(time, name);

        if (time < node.time)
            node.left = insert(node.left, time, name);
        else
            node.right = insert(node.right, time, name);

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);

        // LL
        if (balance > 1 && time < node.left.time)
            return rightRotate(node);

        // RR
        if (balance < -1 && time > node.right.time)
            return leftRotate(node);

        // LR
        if (balance > 1 && time > node.left.time) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // RL
        if (balance < -1 && time < node.right.time) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    public void registerPatient(int time, String name) {
        root = insert(root, time, name);
    }

    PatientNode minValueNode(PatientNode node) {
        PatientNode current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    PatientNode delete(PatientNode root, int time) {

        if (root == null)
            return root;

        if (time < root.time)
            root.left = delete(root.left, time);
        else if (time > root.time)
            root.right = delete(root.right, time);
        else {

            if ((root.left == null) || (root.right == null)) {
                PatientNode temp = null;

                if (root.left != null)
                    temp = root.left;
                else
                    temp = root.right;

                if (temp == null)
                    root = null;
                else
                    root = temp;
            } else {
                PatientNode temp = minValueNode(root.right);
                root.time = temp.time;
                root.name = temp.name;
                root.right = delete(root.right, temp.time);
            }
        }

        if (root == null)
            return root;

        root.height = Math.max(height(root.left), height(root.right)) + 1;

        int balance = getBalance(root);

        // LL
        if (balance > 1 && getBalance(root.left) >= 0)
            return rightRotate(root);

        // LR
        if (balance > 1 && getBalance(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // RR
        if (balance < -1 && getBalance(root.right) <= 0)
            return leftRotate(root);

        // RL
        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    public void dischargePatient(int time) {
        root = delete(root, time);
    }

    public void displayPatients() {
        System.out.println("\n Patients by Arrival Time:");
        inorder(root);
    }

    void inorder(PatientNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.println(" " + node.time + " → " + node.name);
            inorder(node.right);
        }
    }
}
