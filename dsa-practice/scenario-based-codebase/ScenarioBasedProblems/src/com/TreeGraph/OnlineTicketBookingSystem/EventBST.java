package com.TreeGraph.OnlineTicketBookingSystem;

public class EventBST {

    EventNode root;

    EventNode insert(EventNode node, int time, String eventName) {

        if (node == null)
            return new EventNode(time, eventName);

        if (time < node.time)
            node.left = insert(node.left, time, eventName);
        else
            node.right = insert(node.right, time, eventName);

        return node;
    }

    public void addEvent(int time, String eventName) {
        root = insert(root, time, eventName);
    }


    EventNode minValueNode(EventNode node) {
        EventNode current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    EventNode delete(EventNode root, int time) {

        if (root == null)
            return root;

        if (time < root.time)
            root.left = delete(root.left, time);
        else if (time > root.time)
            root.right = delete(root.right, time);
        else {

            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            EventNode temp = minValueNode(root.right);
            root.time = temp.time;
            root.eventName = temp.eventName;

            root.right = delete(root.right, temp.time);
        }
        return root;
    }

    public void cancelEvent(int time) {
        root = delete(root, time);
    }

    public void showEvents() {
        System.out.println("\nUpcoming Events (Sorted by Time):");
        inorder(root);
    }

    void inorder(EventNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.println(node.time + " → " + node.eventName);
            inorder(node.right);
        }
    }
}