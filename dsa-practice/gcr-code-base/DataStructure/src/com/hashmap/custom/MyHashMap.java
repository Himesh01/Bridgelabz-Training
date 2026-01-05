package com.hashmap.custom;

import java.util.LinkedList;

public class MyHashMap<K, V> {

    private static class Node<K, V> {
        K key;
        V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity = 10;
    private LinkedList<Node<K, V>>[] buckets;

    @SuppressWarnings("unchecked")
    public MyHashMap() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    // Hash function
    private int getIndex(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    // Insert or update
    public void put(K key, V value) {
        int index = getIndex(key);
        LinkedList<Node<K, V>> bucket = buckets[index];

        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }
        bucket.add(new Node<>(key, value));
    }

    // Retrieve value
    public V get(K key) {
        int index = getIndex(key);
        LinkedList<Node<K, V>> bucket = buckets[index];

        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null;
    }

    // Remove key
    public void remove(K key) {
        int index = getIndex(key);
        LinkedList<Node<K, V>> bucket = buckets[index];

        bucket.removeIf(node -> node.key.equals(key));
    }
}
