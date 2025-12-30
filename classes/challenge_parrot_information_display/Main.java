package com.example;

class Parrot {
    String name;
    int age;
    String color;
    boolean canParrotTalk;

   @Override
    public String toString() {
        return "Class Parrot: " + System.lineSeparator()
                + "name='" + name + "'" + System.lineSeparator()
                + ", age=" + age + System.lineSeparator()
                + ", color='" + color + "'" + System.lineSeparator()
                + ", canParrotTalk=" +canParrotTalk +
                '.';

        
    }
    

    public Parrot(String name, int age, String color, boolean canParrotTalk) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.canParrotTalk = canParrotTalk;
    }
}

public class Main {
    public static void main(String[] args) {
        Parrot bubba = new Parrot("Bubba", 1, "Yellow", true);
        Parrot rio = new Parrot("Rio", 3, "Blue", false);
        Parrot ollie = new Parrot("Ollie", 2, "Red", true);
        System.out.println(bubba);
        System.out.println(rio);
        System.out.println(ollie);
    }
}