package com.gekkiewekkie.student;
import java.util.ArrayList;

public class StudentenLijsten {
    static ArrayList<Student> studentenLijst = new ArrayList<Student>();

    public static ArrayList<Student> StudentenLijst() {
        studentenLijst.add(new Student("Henk", 21104964, 19));
        return StudentenLijst();


    }

}
