package com.gekkiewekkie.person;

public class Student extends Person{
    public Integer studentNummer;

    public Student(String name, Integer leeftijd, Integer studentNummer) {
        super(name, leeftijd);
        this.studentNummer = studentNummer;
    }
}
