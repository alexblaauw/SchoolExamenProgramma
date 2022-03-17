package com.gekkiewekkie.person;

import java.util.ArrayList;

public class StudentenList {
    private static ArrayList<Person> personenLijst = new ArrayList<Person>();

    public   static ArrayList<Person> StudentenLijst() {
        personenLijst.add(new Teacher("Henk", 65));
        personenLijst.add(new Teacher("Natasja", 28));
        personenLijst.add(new Teacher("Jonas", 48));
        personenLijst.add(new Teacher("Liesanne", 18));
        personenLijst.add(new Teacher("Hendrik", 18));


        personenLijst.add(new Student("Amalia", 18, 1234125));
        personenLijst.add(new Student("Rob", 12304987, 18));
        personenLijst.add(new Student("Ruud", 12304987, 18));
        personenLijst.add(new Student("Loes", 12304987, 18));
        personenLijst.add(new Student("Mees", 12304987, 18));
        personenLijst.add(new Student("Annika", 12304987, 18));

        return StudentenLijst();


    }
    public void addTeacher(String naam, int leeftijd){

        personenLijst.add(new Teacher(naam, leeftijd));

    }
    public void addStudent(String naam, int leeftijd, int studentNummer){

        personenLijst.add(new Student(naam, leeftijd, studentNummer));

    }

}
