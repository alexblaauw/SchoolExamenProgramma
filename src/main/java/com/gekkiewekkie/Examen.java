package com.gekkiewekkie;

import com.gekkiewekkie.commandline.core.MultipleNumberChoice;
import com.gekkiewekkie.exam.ResultIOHandler;

import java.util.ArrayList;

class Examen {
    int aantalVragen;
    int totaalScore;

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


        ArrayList<String> choices3 = new ArrayList<>();
        choices3.add("Alle verkeersdeelnemers");
        choices3.add("Alle bestuurders");
        choices3.add("Alle voertuigen met een motor");

        System.out.println("Vraag 3:");

        MultipleNumberChoice choice3;
        choice3 = new MultipleNumberChoice("Wie moet je voor laten bij haaientanden (als je recht door gaat)?", 3, choices3);
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
    }

    public void Examen2() {
        ArrayList<String> choices1 = new ArrayList<>();
        choices1.add("Altijd");
        choices1.add("Alleen als er aan jouw kant een niet-doorgetrokken streep er voor staat");
        choices1.add("Nooit");

        System.out.println("Dit examen tweede is tijdelijk een kopie van examen 1\n-----------------------------");
        System.out.println("Welkom bij examen nummer 2, dit examen bestaat uit 3 vragen. Veel succes!");
        System.out.println("Vraag 1:");

        com.gekkiewekkie.exam.ResultIOHandler ioHandler = new com.gekkiewekkie.exam.ResultIOHandler();
        //ioHandler.saveArrayList(list, "list.json");
        ArrayList<Integer> newList = ioHandler.loadArrayList("list.json");
        //System.out.println(newList.get(1));

        com.gekkiewekkie.commandline.core.MultipleNumberChoice choice1 = new com.gekkiewekkie.commandline.core.MultipleNumberChoice("Wanneer mag je over een doorgetrokken streep rijden?", 3, choices1);
        choice1.initChoice();
        int i = choice1.awaitResponse();
        //System.out.println("Index of answer provided: "+i);

        if (i == 1) {
            totaalScore++;
            System.out.println("Goed");
        }
        else {
            System.out.println("Fout");
        }
        System.out.println("Het juiste antwoord is: 2");
        System.out.println("Totaalscore: " + totaalScore + "\n");



        ArrayList<String> choices2 = new ArrayList<>();
        choices2.add("Als het net begonnen is met regenen");
        choices2.add("Als het al uren aan het regenen is");

        System.out.println("Vraag 2:");

        com.gekkiewekkie.commandline.core.MultipleNumberChoice choice2 = new com.gekkiewekkie.commandline.core.MultipleNumberChoice("Wanneer is er meer slipgevaar op de weg na een droge periode?", 2, choices2);
        choice2.initChoice();
        int x = choice2.awaitResponse();
        //System.out.println("Index of answer provided: "+x);

        if (x == 0) {
            totaalScore++;
            System.out.println("Goed");
        }
        else {
            System.out.println("Fout");
        }
        System.out.println("Het juiste antwoord is: 1");
        System.out.println("Totaalscore: " + totaalScore + "\n");



        ArrayList<String> choices3 = new ArrayList<>();
        choices3.add("Alle verkeersdeelnemers");
        choices3.add("Alle bestuurders");
        choices3.add("Alle voertuigen met een motor");

        System.out.println("Vraag 3:");

        com.gekkiewekkie.commandline.core.MultipleNumberChoice choice3 = new com.gekkiewekkie.commandline.core.MultipleNumberChoice("Wie moet je voor laten bij haaientanden (als je recht door gaat)?", 3, choices3);
        choice3.initChoice();
        int y = choice3.awaitResponse();
        //System.out.println("Index of answer provided: "+y);

        if (y == 1) {
            totaalScore++;
            System.out.println("Goed");
        }
        else {
            System.out.println("Fout");
        }
        System.out.println("Het juiste antwoord is: 2");
        System.out.println("Totaalscore: " + totaalScore + "\n");
    }
}