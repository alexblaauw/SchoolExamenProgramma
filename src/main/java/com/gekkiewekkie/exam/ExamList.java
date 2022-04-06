package com.gekkiewekkie.exam;

import com.gekkiewekkie.commandline.core.CommandLineChoice;
import com.gekkiewekkie.commandline.core.MultipleLetterChoice;

import java.util.ArrayList;

public class ExamList {
    private static ArrayList<Examen> examenLijst;

    public static ArrayList<Examen> getExamenLijst() {
        if (examenLijst != null) return new ArrayList<>(examenLijst);
        examenLijst = new ArrayList<>();

        CommandLineChoice[] vragen = new CommandLineChoice[1];
        Integer[] antwoorden = new Integer[1];
        vragen[0] = new MultipleLetterChoice("What is the average speed of an unladen Swallow?", "I don't know that!", "African or European?");
        antwoorden[0] = 1;

    public Examen getExam1() {
        CommandLineChoice[] vragen = new CommandLineChoice[1];
        Integer[] antwoorden = new Integer[1];

        vragen[0] = new MultipleLetterChoice("Wanneer mag je over een doorgetrokken streep rijden?", "Altijd", "Alleen als er aan jouw kant nog een niet-doorgetrokken streep er voor staat", "Nooit");
        antwoorden[0] = 1;
        vragen[1] = new MultipleLetterChoice("Wanneer is er meer slipgevaar op de weg na een droge periode?", "Als het net begonnen is met regenen", "Als het al uren aan het regenen is");
        antwoorden[1] = 0;
        vragen[2] = new MultipleLetterChoice("Wie moet je voor laten bij haaientanden (als je recht door gaat)?", "Alle verkeersdeelnemers", "Alle bestuurders", "Alle voertuigen met een motor");
        antwoorden[2] = 1;
        vragen[3] = new MultipleLetterChoice("Bij welk bord mag je niet parkeren maar wel stilstaan (iemand laten uitstappen of iets uitladen)?", "Rond blauw bord, rode rand met een rode streep", "Rond blauw bord, rode rand met een rood kruis");
        antwoorden[3] = 0;

        Examen examen = new Examen("Kennis en inzicht", vragen, antwoorden);
        return examen;
    }

    public Examen getExam2() {
        CommandLineChoice[] vragen = new CommandLineChoice[1];
        Integer[] antwoorden = new Integer[1];

        vragen[0] = new MultipleLetterChoice("Mag een bus een kolonne (militaire voertuigen groep) doorsnijden?", "Ja", "Nee");
        antwoorden[0] = 1;
        vragen[1] = new MultipleLetterChoice("Bij zware mist, bij hoeveel meter zicht mag je je mistlicht aanzetten?","vanaf 25 meter zicht","vanaf 45 meter zicht","vanaf 50 meter zicht","vanaf 60 meter zicht");
        antwoorden[1] = 2;
        vragen[2] = new MultipleLetterChoice("Welk licht kun je het beste aanzetten bij hele zware regenval?", "Mistlicht","Groot licht","Stadslicht","Dimlicht");
        antwoorden[2] = 3;

        Examen examen = new Examen("Speciale verkeerssituaties", vragen, antwoorden);
        return examen;
    }

    public Examen getExam3() {
        CommandLineChoice[] vragen = new CommandLineChoice[1];
        Integer[] antwoorden = new Integer[1];

        vragen[0] = new MultipleLetterChoice("Hoe vaak moet je tijdens het parkeren om je heen kijken?", "1 keer elke kant", "2 keer elke kant", "Net zo lang tot je klaar bent");
        antwoorden[0] = 2;
        vragen[1] = new MultipleLetterChoice("Wat is de volgorde van je acties bij het verwisselen van baan naar links?", "Kijken in je binnenspiegel, rechter buitenspiegel, linker buitenspiegel, links over je schouder kijken, en gaan (als het kan)", "Kijken in je binnenspiegel, linker buitenspiegel, over je schouder, en gaan (als het kan)", "Kijken in je binnenspiegel, linker buitenspiegel, en gaan (als het kan)");
        antwoorden[1] = 1;
        vragen[2] = new MultipleLetterChoice("Wat kun je het beste doen als je moet keren op een rustige weg op een erf?", "Gelijk keren met 3 steken", "Even doordijden tot je bij een breder stuk (kruispunt) komt om te keren met een halve draai", "Doorrijden tot je bij een rotonde komt om te keren");
        antwoorden[2] = 1;

        Examen examen = new Examen("Bijzondere Verrichtingen", vragen, antwoorden);
        return examen;
    }

        Examen examen = new Examen("test_examen", vragen, antwoorden);
        addExamen(examen);

        return new ArrayList<>(examenLijst);
    }

    public static void addExamen(Examen examen) {
        examenLijst.add(examen);
    }
}
