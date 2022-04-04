package com.gekkiewekkie;

import com.gekkiewekkie.commandline.interfaces.ExamInterface;
import com.gekkiewekkie.commandline.interfaces.MainInterface;
import com.gekkiewekkie.person.Student;
import com.gekkiewekkie.person.StudentList;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    /*
    de main geeft een menu waarin je kan kiezen voor bepaalde acties.
    deze acties worden uitgevoerd in de methodes waar die dan ook naar doorverwijst.
    en nadat de actie is uitgevoerd kan je opnieuw kiezen vooor een optie totdat je 0 kiest.
     */

    public static void main(String[] args) {
        StudentList.StudentenLijst();
        MainInterface mainInterface = new MainInterface();
        mainInterface.runInterface();
    }
}
