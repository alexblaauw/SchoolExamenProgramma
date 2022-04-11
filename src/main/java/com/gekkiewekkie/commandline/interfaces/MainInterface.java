package com.gekkiewekkie.commandline.interfaces;

import com.gekkiewekkie.Main;

import java.util.Scanner;

public class MainInterface {
    public void runInterface() {
        Scanner scanner = new Scanner(System.in);
        boolean actief = true;
        while (actief) {
            System.out.println("""
                    Menu
                    1) Lijst met examens
                    2) Lijst met studenten
                    3) Nieuwe student inschrijven
                    4) Student verwijderen
                    5) Examen afnemen
                    6) Is student geslaagd voor test?
                    7) Welke examens heeft student gehaald?
                    8) Welke student heeft de meeste examens gehaald? 
                    0) Exit
                    Uw keuze: """);
            int keuze = scanner.nextInt();
            switch (keuze) {
                case 1 -> Main.lijstExamen();
                case 2 -> Main.lijstStudenten();
                case 3 -> Main.nieuweStudentInschrijven();
                case 4 -> Main.studentVerwijderen();
                case 5 -> Main.examenAfnemen();
                case 6 -> Main.isStudentGeslaagdVoorTest();
                case 7 -> Main.welkeExamensHeeftStudentGehaald();
                case 8 -> Main.welkeStudentHeeftDeMeesteExamensGehaald();
                case 0 -> actief = false;
                default -> System.out.println("Maak een goede keuze");
            }
        }
    }
}
