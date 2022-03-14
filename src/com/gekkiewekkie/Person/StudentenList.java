package com.gekkiewekkie.Person;
import java.util.ArrayList;

public class StudentenList {
    static ArrayList<Person> studentenLijst = new ArrayList<Person>();

    public static ArrayList<Person> StudentenLijst() {
        studentenLijst.add(new Teacher("Henk", 65));
        studentenLijst.add(new Student("", 12304987, 18));
        studentenLijst.add(new Student("", 12304987, 18));
        studentenLijst.add(new Student("", 12304987, 18));
        studentenLijst.add(new Student("", 12304987, 18));
        studentenLijst.add(new Student("", 12304987, 18));
        studentenLijst.add(new Student("", 12304987, 18));
        studentenLijst.add(new Student("", 12304987, 18));
        studentenLijst.add(new Student("", 12304987, 18));
        studentenLijst.add(new Student("", 12304987, 18));
        studentenLijst.add(new Student("", 12304987, 18));

        return StudentenLijst();


    }

}
