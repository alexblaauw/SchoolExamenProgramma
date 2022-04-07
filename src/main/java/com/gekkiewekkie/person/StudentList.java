package com.gekkiewekkie.person;


import java.util.ArrayList;

public class StudentList {
    private static ArrayList<Student> studentLijst = new ArrayList<>();

    public static ArrayList<Student> StudentenLijst() {
        studentLijst.add(new Student("Henk Hofwegen", 35, 21234409));
        studentLijst.add(new Student("Natasja de Ven", 27, 2462652));
        studentLijst.add(new Student("Jonas Abbing", 42, 2557052));
        studentLijst.add(new Student("Liesanne Reinders", 28, 7560455));
        studentLijst.add(new Student("Hendrik de Wit", 35, 2805852));


        studentLijst.add(new Student("Lars Post", 19, 2532402));
        studentLijst.add(new Student("Ruud van Heijningen", 17, 1238495));
        studentLijst.add(new Student("Loes Houtkooper", 20, 1290375));
        studentLijst.add(new Student("Mees Bakker", 20, 3100584));
        studentLijst.add(new Student("Annika Blauw", 18, 2348095));

        return studentLijst;

    }

    public static ArrayList<Student> getStudentLijst() {
        return studentLijst;
    }

    public static void addStudent(String naam, int leeftijd, int studentNummer){

        studentLijst.add(new Student(naam, leeftijd, studentNummer));
        System.out.println("Student succesvol toegevoegd.");

    }
   
    public static boolean removeStudent(String naam, Integer leeftijd, Integer studentNummer){
        for (int i = 0; i < studentLijst.size(); i++) {
            if (naam.equals(studentLijst.get(i).getName()) && leeftijd.equals(studentLijst.get(i).getLeeftijd()) &&
                    studentNummer.equals(studentLijst.get(i).getStudentNummer())) {
                System.out.printf("Student: %s (%d) Leeftijd: %d succesvol verwijderd.", studentLijst.get(i).getName(),
                        studentLijst.get(i).getLeeftijd(), studentLijst.get(i).getStudentNummer());
                studentLijst.remove(i);
                return true;
            }
        }
        System.out.println("Student niet gevonden.");
        return false;
    }

    public static void printStudenten(){

        for (Student student : studentLijst) {

            System.out.println("Naam: " + student.getName() + "\nLeeftijd: " + student.getLeeftijd()
                    + "\nstudentNummer: " + student.getStudentNummer() + "\n");

        }
    }

    public static Student getStudentByNummer(int studentenNummer) {
        for (int i = 0; i < studentLijst.size(); i++) {
            if (studentLijst.get(i).getStudentNummer() == studentenNummer) {
                return studentLijst.get(i);
            }
        }

        return null;
    }
}