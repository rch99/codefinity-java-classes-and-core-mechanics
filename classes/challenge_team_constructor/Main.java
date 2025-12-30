package com.example;

class Team {
    String name;
    String sport;
    int yearFounded;
    String city;

    public Team(String name, String sport, int yearFounded, String city) {
        this.name = name;
        this.sport = sport;
        this.yearFounded = yearFounded;
        this.city = city;
    }

    public void displayTeamInfo() {
        System.out.println("Team: " + name);
        System.out.println("Sport: " + sport);
        System.out.println("Year Founded: " + yearFounded);
        System.out.println("City: " + city);
    }
}

public class Main {
    public static void main(String[] args) {
        Team team = new Team("Lakers", "Basketball", 1947, "Los Angeles");
        team.displayTeamInfo();
    }
}