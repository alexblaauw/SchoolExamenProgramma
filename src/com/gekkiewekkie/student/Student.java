package com.gekkiewekkie.student;

public class Student {
    private String name;
    private Integer studentNummer;
    private Integer leeftijd;

    public Student(String name, Integer studentNummer, Integer leeftijd) {
        this.name = name;
        this.studentNummer = studentNummer;
        this.leeftijd = leeftijd;
    }

    public String getName() {
        return name;
    }

    public Integer getStudentNummer() {
        return studentNummer;
    }

    public Integer getLeeftijd() {
        return leeftijd;
    }
}
