package com.gekkiewekkie.person;


import java.util.ArrayList;

public class PersonsList {
    private static ArrayList<Person> personenLijst;

    public static ArrayList<Person> StudentenLijst() {
        if (personenLijst != null) return personenLijst;

        personenLijst = new ArrayList<>();

        personenLijst.add(new Teacher("Henk", 65));
        personenLijst.add(new Teacher("Natasja", 27));
        personenLijst.add(new Teacher("Jonas", 48));
        personenLijst.add(new Teacher("Liesanne", 28));
        personenLijst.add(new Teacher("Hendrik", 35));


        personenLijst.add(new Student("Rob", 19, 2532452));
        personenLijst.add(new Student("Ruud", 17, 1238495));
        personenLijst.add(new Student("Loes", 20, 1298375));
        personenLijst.add(new Student("Mees", 20, 3140584));
        personenLijst.add(new Student("Annika", 18, 2348095));

        return personenLijst;
    }
    public void addTeacher(String naam, int leeftijd){

        personenLijst.add(new Teacher(naam, leeftijd));

    }
    public void addStudent(String naam, int leeftijd, int studentNummer){

        personenLijst.add(new Student(naam, leeftijd, studentNummer));


    }
    public static void printStudenten(){
        for (int i = 0; i < personenLijst.size(); i++) {
            //System.out.println(personenLijst.get(i).getClass().toString());
            if (personenLijst.get(i).getClass().toString().equals("class com.gekkiewekkie.person.Student")){
                System.out.println("gelukt" + personenLijst.get(i).getName());
                //System.out.println("Naam: " + personenLijst.get(i).getName() + "\nLeeftijd: " + personenLijst.get(i).getLeeftijd()
                // + "\nstudentNummer: " + personenLijst.get(i).getStudentNummer());
            }

        }
    }
    //PersonsList.StudentenLijst();
    //PersonsList.printStudenten();
}