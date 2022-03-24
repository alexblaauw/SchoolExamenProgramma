package com.gekkiewekkie;

import com.gekkiewekkie.commandline.core.MultipleNumberChoice;
import com.gekkiewekkie.exam.ResultIOHandler;

import java.util.ArrayList;

public class Examen {
    private int aantalVragen;
    private int totaalScore;
    private String name;

    public Examen(int aantalVragen) {
        this.aantalVragen = aantalVragen;
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