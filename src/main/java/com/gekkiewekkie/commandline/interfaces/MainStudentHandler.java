package com.gekkiewekkie.commandline.interfaces;

import com.gekkiewekkie.commandline.core.OpenQuestion;
import com.gekkiewekkie.exam.ExamList;
import com.gekkiewekkie.exam.Examen;
import com.gekkiewekkie.exam.ResultIOHandler;
import com.gekkiewekkie.person.Student;
import com.gekkiewekkie.person.StudentList;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainStudentHandler {
    private static Scanner scanner = new Scanner(System.in);
    public static void isStudentGeslaagdVoorTest(){
        int studentenNummer = vraagStudentenNummer();
        Examen examen = ExamInterface.examChoice();
        ResultIOHandler ioHandler = new ResultIOHandler();
        try {
            ArrayList<Integer> answers = ioHandler.loadArrayList("src/main/resources/exam_" + examen.getNaam() + "_" + studentenNummer + ".json");
            int score = 0;
            for (int i = 0; i < answers.size(); i++) {
                int answer = answers.get(i);
                if (answer == examen.getCorrectAntwoord(i)) {
                    score++;
                }
            }
            double resultaat = score / examen.getAantalVragen();
            if (resultaat * 100 > examen.getSlaagPercentage()) {
                System.out.println("Geslaagd!");
            }
            else {
                System.out.println("Gefaald!");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Deze student heeft dit examen niet gemaakt.");
        }
    }

    public static void welkeExamensHeeftStudentGehaald(){
        ResultIOHandler ioHandler = new ResultIOHandler();
        int studentenNummer = vraagStudentenNummer();
        ArrayList<Examen> gehaaldeExamens = new ArrayList<>();
        for (Examen examen : ExamList.getExamenLijst()) {
            try {
                ArrayList<Integer> answers = ioHandler.loadArrayList("src/main/resources/exam_" + examen.getNaam() + "_" + studentenNummer + ".json");

                int score = 0;
                for (int i = 0; i < answers.size(); i++) {
                    int answer = answers.get(i);
                    if (answer == examen.getCorrectAntwoord(i)) {
                        score++;
                    }
                }
                double resultaat = score / examen.getAantalVragen();
                if (resultaat * 100 > examen.getSlaagPercentage()) {
                    gehaaldeExamens.add(examen);
                }
            } catch (FileNotFoundException e) {}
        }

        for (Examen examen : gehaaldeExamens) {
            System.out.println(examen.getNaam() + " is gehaald!");
        }
        if (gehaaldeExamens.size() < 1) {
            System.out.println("Deze student heeft geen examens gehaald.");
        }

        System.out.print("\n");
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
        if(meesteExamenGehaald == 0){
            System.out.println("Er zijn nog geen studenten die een examen hebben gehaald.");
        }
        else if(meestSuccesvolleStudent.size() == 1) {
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

    public static int vraagStudentenNummer() {
        OpenQuestion studentenVraag = new OpenQuestion("Voer uw studentennummer in: ");
        boolean correctAntwoord = true;
        boolean loop = true;
        int antwoord = -1;
        while (loop) {
            if (!correctAntwoord) {
                System.out.println("Dit nummer staat niet in het systeem");
            }

            studentenVraag.initQuestion();
            try {
                antwoord = Integer.parseInt(studentenVraag.awaitResponse());
                for (Student student : StudentList.getStudentLijst()) {
                    if (student.getStudentNummer() != antwoord) {
                        correctAntwoord = false;
                    }
                    else {
                        loop = false;
                    }
                }

            } catch (NumberFormatException exception) {
                System.out.println("Dit is geen valide getal");
            }
        }

        return antwoord;
    }
}
