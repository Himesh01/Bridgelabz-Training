package com.bridgelabz.oops.relationship;

public class Faculty {
    private String name;
    private int id;

    public Faculty(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Faculty{ID=" + id + ", Name='" + name + "'}";
    }
}