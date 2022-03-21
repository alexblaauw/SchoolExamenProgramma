package com.gekkiewekkie;

import com.gekkiewekkie.commandline.core.MultipleNumberChoice;
import com.gekkiewekkie.commandline.core.YesNoChoice;
import com.gekkiewekkie.commandline.interfaces.MainInterface;
import com.gekkiewekkie.exam.ResultIOHandler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean actief = true;
        System.out.println("""
                Menu
                1) Lijst met examens
                2) Lijst met studenten
                3) Nieuwe student inschrijven
                4) Student verwijderen
                5) Examen afnemen
                6) Is student geslaagd voor test?
                7) Welke examens heeft student gehaald?
                8) welke student heeft de meeste examens gehaald? 
                0) Exit
                Uw keuze: """);
        while (actief) {
            int keuze = scanner.nextInt();
            switch (keuze) {
                case 1 -> lijstExamen();
                case 2 -> lijstStudenten();
                case 3 -> nieuweStudentInschrijven();
                case 4 -> studentVerwijderen();
                case 5 -> examenAfnemen();
                case 6 -> isStudentGeslaagdVoorTest();
                case 7 -> welkeExamensHeeftStudentGehaald();
                case 8 -> welkeStudentHeeftDeMeesteExamensGehaald();
                case 0 -> actief = false;
                default -> System.out.println("maak een goede keuze");
            }
        }
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
        Examen Examen1 = new Examen(3);
        Examen1.Examen1();
        Examen Examen2 = new Examen(3);
        Examen2.Examen2();
    }

    public static void isStudentGeslaagdVoorTest(){

    }

    public static void welkeExamensHeeftStudentGehaald(){

    }

    public static void welkeStudentHeeftDeMeesteExamensGehaald(){

    }

}
