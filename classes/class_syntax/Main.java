package com.example;

public class Main {
    public static void main(String[] args) {
        Person bob = new Person();
        bob.name = "Bob";
        bob.age = 30;

        Person alice = new Person();
        alice.name = "Alice";
        alice.age = 27;

        boolean foundFriend = alice.findFriend(bob, 25, 30);

        System.out.println("Friend found: " + foundFriend);
    }
}

class Person {
    String name;
    int age;

    boolean findFriend(Person person, int minAge, int maxAge) {
        if (person.age >= minAge && person.age <= maxAge) {
            return true;
        }
        return false;
    }
}