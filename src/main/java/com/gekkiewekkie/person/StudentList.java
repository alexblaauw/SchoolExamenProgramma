package com.gekkiewekkie.person;


import java.util.ArrayList;

public class StudentList {
    private static ArrayList<Student> studentLijst = new ArrayList<Student>();

    public static void StudentenLijst() {
        studentLijst.add(new Student("Henk", 65, 2532452));
        studentLijst.add(new Student("Natasja", 27, 2532452));
        studentLijst.add(new Student("Jonas", 48, 2532452));
        studentLijst.add(new Student("Liesanne", 28, 2532452));
        studentLijst.add(new Student("Hendrik", 35, 2532452));


        studentLijst.add(new Student("Rob", 19, 2532452));
        studentLijst.add(new Student("Ruud", 17, 1238495));
        studentLijst.add(new Student("Loes", 20, 1298375));
        studentLijst.add(new Student("Mees", 20, 3140584));
        studentLijst.add(new Student("Annika", 18, 2348095));


    }
    //public void addTeacher(String naam, int leeftijd){

      //  studentLijst.add(new Teacher(naam, leeftijd));

    //}
    public static void addStudent(String naam, int leeftijd, int studentNummer){

        studentLijst.add(new Student(naam, leeftijd, studentNummer));
        System.out.println("Student succesvol toegevoegd.");

    }
   
    public static void removeStudent(String naam, Integer leeftijd, Integer studentNummer){
        int teller = 0;
        for (int i = 0; i < studentLijst.size(); i++) {
            if (naam.equals(studentLijst.get(i).getName()) && leeftijd.equals(studentLijst.get(i).getLeeftijd()) &&
                    studentNummer.equals(studentLijst.get(i).getStudentNummer())) {
                System.out.printf("Student: %s (%d) Leeftijd: %d succesvol verwijderd.", studentLijst.get(i).getName(),
                        studentLijst.get(i).getLeeftijd(), studentLijst.get(i).getStudentNummer());
                teller++;
                studentLijst.remove(i);
            }
        }
        if (teller == 0){
            System.out.println("Student niet gevonden.");
        }
    }

    public static void printStudenten(){

        for (int i = 0; i < studentLijst.size(); i++) {

                System.out.println("Naam: " + studentLijst.get(i).getName() + "\nLeeftijd: " + studentLijst.get(i).getLeeftijd()
                 + "\nstudentNummer: " + studentLijst.get(i).getStudentNummer() + "\n");

        }
    }
}