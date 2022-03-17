package com.gekkiewekkie.person;
import java.util.ArrayList;

public class StudentenList {
    static ArrayList<Person> studentenLijst = new ArrayList<Person>();

    public static ArrayList<Person> StudentenLijst() {
        studentenLijst.add(new Teacher("Henk", 65));
        studentenLijst.add(new Teacher("Natasja", 28));
        studentenLijst.add(new Teacher("Jonas", 48));
        studentenLijst.add(new Teacher("Liesanne", 18));
        studentenLijst.add(new Teacher("Hendrik", 18));


        studentenLijst.add(new Student("Amalia", 18, 1234125));
        studentenLijst.add(new Student("Rob", 12304987, 18));
        studentenLijst.add(new Student("Ruud", 12304987, 18));
        studentenLijst.add(new Student("Loes", 12304987, 18));
        studentenLijst.add(new Student("Mees", 12304987, 18));
        studentenLijst.add(new Student("Annika", 12304987, 18));

        return StudentenLijst();


    }

}
