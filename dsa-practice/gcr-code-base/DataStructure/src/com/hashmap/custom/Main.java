package com.hashmap.custom;

public class Main {
    public static void main(String[] args) {

        MyHashMap<String, Integer> map = new MyHashMap<>();

        map.put("apple", 10);
        map.put("banana", 20);
        map.put("orange", 30);

        System.out.println(map.get("apple"));   // 10
        System.out.println(map.get("banana"));  // 20

        map.remove("banana");
        System.out.println(map.get("banana"));  // null
    }
}
