package com.gekkiewekkie.Person;
import java.util.ArrayList;

public class StudentenList {
    static ArrayList<Student> studentenLijst = new ArrayList<Student>();

    public static ArrayList<Student> StudentenLijst() {
        studentenLijst.add(new Student("Henk", 21104964, 19));
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
