package com.gekkiewekkie.commandline.interfaces;

import com.gekkiewekkie.Main;
import com.gekkiewekkie.exam.ExamHandler;
import com.gekkiewekkie.person.StudentHandler;

import java.util.Scanner;

public class MainInterface implements IInterface {
    @Override
    public void runInterface() {
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
                Uw keuze:""");
        while (actief) {
            int keuze = scanner.nextInt();
            switch (keuze) {
                case 1 -> ExamHandler.lijstExamen();
                case 2 -> StudentHandler.lijstStudenten();
                case 3 -> StudentHandler.nieuweStudentInschrijven();
                case 4 -> StudentHandler.studentVerwijderen();
                case 5 -> ExamHandler.examenAfnemen();
                case 6 -> StudentHandler.isStudentGeslaagdVoorTest();
                case 7 -> StudentHandler.welkeExamensHeeftStudentGehaald();
                case 8 -> StudentHandler.welkeStudentHeeftDeMeesteExamensGehaald();
                case 0 -> actief = false;
                default -> System.out.println("maak een goede keuze");
            }
        }
    }
}
