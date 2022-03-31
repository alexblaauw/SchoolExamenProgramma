package com.gekkiewekkie.exam;

import com.gekkiewekkie.commandline.core.CommandLineChoice;
import com.gekkiewekkie.commandline.core.MultipleNumberChoice;
import com.gekkiewekkie.exam.ResultIOHandler;
import com.gekkiewekkie.person.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Examen {
    private static ArrayList<Examen> examenLijst = new ArrayList();
    private ArrayList<CommandLineChoice> vragenLijst;
    private static int slaagPercentage = 55;
    private ArrayList<Student> geslaagden = new ArrayList();
    private String naam;
    private int aantalVragen;
    private int totaalScore = 0;

    public Examen(String naam, int aantalVragen) {
        this.naam = naam;
        this.aantalVragen = aantalVragen;
        int soortVraag;
    }

    public ArrayList<Examen> getExamenLijst() {
        return examenLijst;
    }

    public String getNaam() {
        return naam;
    }

    public ArrayList<Student> getGeslaagden() {
        return geslaagden;
    }

    public void examenAfnemen() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < vragenLijst.size(); i++) {
            System.out.println(vragenLijst.get(i));
            scanner.next();
        }
    }

    public double getTotaalScore() {
        return totaalScore / aantalVragen * 100;
    }
}


//Examen Revamp
/*


    public Examen(int aantalVragen) {
        this.aantalVragen = aantalVragen;
        MultipleNumberChoice examenkeuze;
        examenkeuze = new MultipleNumberChoice("Kies welk examen u wilt maken:",
                "Examen 1: Kennis en inzicht",
                "Examen 2: Speciale verkeerssituaties",
                "Cancel");
        examenkeuze.initChoice();
        int keuze = examenkeuze.awaitResponse();
        if (keuze == 0) {
            System.out.println();
            Examen1();
        }
        if (keuze == 1) {
            System.out.println();
            Examen2();
        }
        if (keuze == 2) {
            return;
        }
        else {
            System.out.println("Geen geldige keuze");
            return;
        }
    }

    public void Examen1() {

        ResultIOHandler ioHandler = new ResultIOHandler();
        ArrayList<Integer> exam1Answers = new ArrayList<>();
        System.out.println("Welkom bij examen nummer 1, dit examen bestaat uit 3 vragen. Veel succes!");


        System.out.println("Vraag 1:");
        MultipleNumberChoice choice1;
        choice1 = new MultipleNumberChoice("Wanneer mag je over een doorgetrokken streep rijden?",
                "Altijd",
                "Alleen als er aan jouw kant een niet-doorgetrokken streep er voor staat",
                "Nooit");
        choice1.initChoice();
        int answer = choice1.awaitResponse();
        int correctAnswer = 1;

        if (answer == correctAnswer) {
            totaalScore++;
            System.out.println("Goed");
        }
        else {
            System.out.println("Fout");
        }
        System.out.println("Het juiste antwoord is: " + (correctAnswer + 1));
        System.out.println("Totaalscore: " + totaalScore + "\n");
        exam1Answers.add(answer);


        System.out.println("Vraag 2:");
        MultipleNumberChoice choice2;
        choice2 = new MultipleNumberChoice("Wanneer is er meer slipgevaar op de weg na een droge periode?",
                "Als het net begonnen is met regenen",
                "Als het al uren aan het regenen is");
        choice2.initChoice();
        answer = choice2.awaitResponse();
        correctAnswer = 0;

        if (answer == correctAnswer) {
            totaalScore++;
            System.out.println("Goed");
        }
        else {
            System.out.println("Fout");
        }
        System.out.println("Het juiste antwoord is: " + (correctAnswer + 1));
        System.out.println("Totaalscore: " + totaalScore + "\n");
        exam1Answers.add(answer);


        System.out.println("Vraag 3:");
        MultipleNumberChoice choice3;
        choice3 = new MultipleNumberChoice("Wie moet je voor laten bij haaientanden (als je recht door gaat)?",
                "Alle verkeersdeelnemers",
                "Alle bestuurders",
                "Alle voertuigen met een motor");
        choice3.initChoice();
        answer = choice3.awaitResponse();
        correctAnswer = 1;

        if (answer == correctAnswer) {
            totaalScore++;
            System.out.println("Goed");
        }
        else {
            System.out.println("Fout");
        }
        System.out.println("Het juiste antwoord is: " + (correctAnswer + 1));
        System.out.println("Totaalscore: " + totaalScore + "\n");
        exam1Answers.add(answer);
        ioHandler.saveArrayList(exam1Answers, "src/main/resources/exam1answers.json");
        return;
    }

    public void Examen2() {
        ResultIOHandler ioHandler = new ResultIOHandler();
        ArrayList<Integer> exam1Answers = new ArrayList<>();
        System.out.println("Welkom bij examen nummer 2, dit examen bestaat uit 3 vragen. Veel succes!");


        System.out.println("Vraag 1:");
        MultipleNumberChoice choice1;
        choice1 = new MultipleNumberChoice("Wanneer mag je over een doorgetrokken streep rijden?",
                "Altijd",
                "Alleen als er aan jouw kant een niet-doorgetrokken streep er voor staat",
                "Nooit");
        choice1.initChoice();
        int answer = choice1.awaitResponse();
        int correctAnswer = 1;

        if (answer == correctAnswer) {
            totaalScore++;
            System.out.println("Goed");
        }
        else {
            System.out.println("Fout");
        }
        System.out.println("Het juiste antwoord is: " + (correctAnswer + 1));
        System.out.println("Totaalscore: " + totaalScore + "\n");
        exam1Answers.add(answer);


        System.out.println("Vraag 2:");
        MultipleNumberChoice choice2;
        choice2 = new MultipleNumberChoice("Wanneer is er meer slipgevaar op de weg na een droge periode?",
                "Als het net begonnen is met regenen",
                "Als het al uren aan het regenen is");
        choice2.initChoice();
        answer = choice2.awaitResponse();
        correctAnswer = 0;

        if (answer == correctAnswer) {
            totaalScore++;
            System.out.println("Goed");
        }
        else {
            System.out.println("Fout");
        }
        System.out.println("Het juiste antwoord is: " + (correctAnswer + 1));
        System.out.println("Totaalscore: " + totaalScore + "\n");
        exam1Answers.add(answer);


        System.out.println("Vraag 3:");
        MultipleNumberChoice choice3;
        choice3 = new MultipleNumberChoice("Wie moet je voor laten bij haaientanden (als je recht door gaat)?",
                "Alle verkeersdeelnemers",
                "Alle bestuurders",
                "Alle voertuigen met een motor");
        choice3.initChoice();
        answer = choice3.awaitResponse();
        correctAnswer = 1;

        if (answer == correctAnswer) {
            totaalScore++;
            System.out.println("Goed");
        }
        else {
            System.out.println("Fout");
        }
        System.out.println("Het juiste antwoord is: " + (correctAnswer + 1));
        System.out.println("Totaalscore: " + totaalScore + "\n");
        exam1Answers.add(answer);
        ioHandler.saveArrayList(exam1Answers, "src/main/resources/exam2answers.json");
        return;
    }
}

 */
