package com.gekkiewekkie;

import com.gekkiewekkie.commandline.interfaces.ExamInterface;
import com.gekkiewekkie.commandline.interfaces.MainInterface;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MainInterface mainInterface = new MainInterface();
        mainInterface.runInterface();
    }

    public static void lijstExamen(){

    }

    public static void lijstStudenten(){

    }

    public static void nieuweStudentInschrijven(){

    }

    public static void studentVerwijderen(){

    }

    public static void examenAfnemen() {
        ExamInterface examInterface = new ExamInterface();
        examInterface.runInterface();
    }

    public static void isStudentGeslaagdVoorTest(){

    }

    public static void welkeExamensHeeftStudentGehaald(){

    }

    public static void welkeStudentHeeftDeMeesteExamensGehaald(){

    }

}
