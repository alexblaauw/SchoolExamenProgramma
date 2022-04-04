package com.gekkiewekkie.person;

import com.gekkiewekkie.commandline.interfaces.ExamInterface;

public class StudentHandler {
    public static void lijstStudenten(){
        for (Person person : PersonsList.StudentenLijst()) {
            if (person instanceof Student) {
                System.out.println(person.getName() + " (" + ((Student) person).studentNummer + "), " + person.getLeeftijd());
            }
        }
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
