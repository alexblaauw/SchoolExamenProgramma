package com.gekkiewekkie.commandline.interfaces;

import com.gekkiewekkie.exam.Examen;
import com.gekkiewekkie.person.Student;
import com.gekkiewekkie.person.StudentList;

import java.util.ArrayList;
import java.util.Scanner;

public class MainStudentHandler {
    private static Scanner scanner = new Scanner(System.in);
    public static void isStudentGeslaagdVoorTest(){

    }

    public static void welkeExamensHeeftStudentGehaald(){

    }

    public static void welkeStudentHeeftDeMeesteExamensGehaald(){
        ArrayList<Student> studentenLijst = StudentList.getStudentLijst();
        int meesteExamenGehaald = 0;
        ArrayList<Student> meestSuccesvolleStudent = new ArrayList<>();
        for (int i = 0; i < studentenLijst.size(); i++) {
            if(studentenLijst.get(i).getGehaaldeExamen().size() == meesteExamenGehaald){
                meestSuccesvolleStudent.add(studentenLijst.get(i));
            }
            if(studentenLijst.get(i).getGehaaldeExamen().size() > meesteExamenGehaald){
                meesteExamenGehaald = studentenLijst.get(i).getGehaaldeExamen().size();
                for (int j = meestSuccesvolleStudent.size() - 1; j >= 0; j--) {
                    meestSuccesvolleStudent.remove(j);
                }
                meestSuccesvolleStudent.add(studentenLijst.get(i));
            }
        }
        if(meestSuccesvolleStudent.size() == 1) {
            System.out.printf("De student die de meeste examens heeft gehaald is: %s (%d)\n", meestSuccesvolleStudent.get(0).getName(), meestSuccesvolleStudent.get(0).getStudentNummer());
        }else{
            System.out.println("De studenten die de meeste examens hebben gehaald zijn:");
            for (int i = 0; i < meestSuccesvolleStudent.size(); i++) {
                System.out.printf("- %s (%d)\n",meestSuccesvolleStudent.get(i).getName(), meestSuccesvolleStudent.get(i).getStudentNummer());
            }
        }
        System.out.println("Druk enter als u terug wilt naar het menu.");
        scanner.nextLine();
    }
    public static void lijstStudenten(){
        StudentList.printStudenten();
        System.out.println("Druk enter als u terug wilt naar het menu.");
        scanner.nextLine();

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
        System.out.println("Druk enter als u terug wilt naar het menu.");
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
        System.out.println("Druk enter als u terug wilt naar het menu.");
        scanner.nextLine();
    }
}
