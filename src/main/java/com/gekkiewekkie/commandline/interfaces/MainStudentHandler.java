package com.gekkiewekkie.commandline.interfaces;

import com.gekkiewekkie.person.StudentList;

import java.util.Scanner;

public class MainStudentHandler {
    private static Scanner scanner = new Scanner(System.in);
    public static void isStudentGeslaagdVoorTest(){

    }

    public static void welkeExamensHeeftStudentGehaald(){

    }

    public static void welkeStudentHeeftDeMeesteExamensGehaald(){

    }
    public static void lijstStudenten(){
        StudentList.printStudenten();

    }

    public static void nieuweStudentInschrijven(){
        System.out.println("Voer de naam van de student in die u wilt toevoegen:");
        String naam = scanner.nextLine();
        System.out.println("Voer de leeftijd van de student in die u wilt toevoegen:");
        Integer leeftijd = scanner.nextInt();
        System.out.println("Voer het leerlingnummer van de student in die u wilt toevoegen:");
        Integer leerlingnummer = scanner.nextInt();
        StudentList.addStudent(naam, leeftijd, leerlingnummer);
        scanner.nextLine();

    }

    public static void studentVerwijderen() {
        System.out.println("Voer de naam van de student in die u wilt verwijderen:");
        String naam = scanner.nextLine();
        System.out.println("Voer de leeftijd van de student in die u wilt verwijderen:");
        Integer leeftijd = scanner.nextInt();
        System.out.println("Voer het leerlingnummer van de student in die u wilt verwijderen:");
        Integer leerlingnummer = scanner.nextInt();
        StudentList.removeStudent(naam, leeftijd, leerlingnummer);
        scanner.nextLine();
    }
}
