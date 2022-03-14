package com.gekkiewekkie.Person;

public abstract class Person {
    private String name;
    private Integer leeftijd;

    public Person(String name, Integer leeftijd) {
        this.name = name;
        this.leeftijd = leeftijd;
    }

    public String getName() {
        return name;
    }

    public Integer getLeeftijd() {
        return leeftijd;
    }
}
