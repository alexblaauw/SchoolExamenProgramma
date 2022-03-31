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

    public static void lijstExamen(){

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

    public static void studentVerwijderen(){
        System.out.println("Voer de naam van de student in die u wilt verwijderen:");
        String naam = scanner.nextLine();
        System.out.println("Voer de leeftijd van de student in die u wilt verwijderen:");
        Integer leeftijd = scanner.nextInt();
        System.out.println("Voer het leerlingnummer van de student in die u wilt verwijderen:");
        Integer leerlingnummer = scanner.nextInt();
        StudentList.removeStudent(naam, leeftijd, leerlingnummer);
        scanner.nextLine();
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
