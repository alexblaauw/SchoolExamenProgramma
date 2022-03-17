package com.gekkiewekkie;

import java.util.ArrayList;

class Examen {
    int aantalVragen;
    int totaalScore;

    public Examen(int aantalVragen) {
        this.aantalVragen = aantalVragen;
    }

    public void Examen1() {
        ArrayList<String> choices1 = new ArrayList<>();
        choices1.add("Altijd");
        choices1.add("Alleen als er aan jouw kant een niet-doorgetrokken streep er voor staat");
        choices1.add("Nooit");

        System.out.println("Welkom bij examen nummer 1, veel succes!");
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
    }
}