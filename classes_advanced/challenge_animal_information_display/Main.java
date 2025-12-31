package com.example;

public class Main {
    public static void main(String[] args) {
        // You should write your solution here.
        Animal cat = new Animal("Cat","Garfield","Red");
        Animal dog = new Animal("Dog","Maks","Black");
        System.out.println(cat);
        System.out.println(dog);
    }
}

class Animal {
    private String type;
    private String name;
    private String color;

     public Animal(String type, String name, String color) {
        this.type = type;
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" + "type='" + type + '\'' + ", name='" + name + '\'' + ", color='" + color + '\'' + '}';
    }
}