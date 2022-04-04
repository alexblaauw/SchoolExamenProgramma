package com.gekkiewekkie.commandline.interfaces;

import com.gekkiewekkie.commandline.core.CommandLineChoice;
import com.gekkiewekkie.commandline.core.MultipleLetterChoice;
import com.gekkiewekkie.exam.Examen;
import com.gekkiewekkie.Main;
import com.gekkiewekkie.commandline.core.MultipleNumberChoice;

public class ExamInterface implements IInterface {
    public ExamInterface(Examen... e) {
        MultipleNumberChoice examChoice = new MultipleNumberChoice("Kies welk examen u wilt maken:", true,
                "Kennis en inzicht",
                "Speciale verkeerssituaties",
                "Cancel");
        examChoice.initChoice();

        int response = examChoice.awaitResponse();
        getExam1().examenAfnemen();
        /*Examen Examen1 = new Examen(3);
        Examen Examen2 = new Examen(3);
        switch (response) {
            case 0:
                Examen1.Examen1();
                break;
            case 1:
                Examen2.Examen2();
                break;
            case 2:
                MainInterface mainInterface = new MainInterface();
                mainInterface.runInterface();
                break;
        }*/
    }

    public Examen getExam1() {
        CommandLineChoice[] vragen = new CommandLineChoice[1];
        Integer[] antwoorden = new Integer[1];
        vragen[0] = new MultipleLetterChoice("What is the average speed of an unladen Swallow?", "I don't know that!", "African or European?");
        antwoorden[0] = 1;

        Examen examen = new Examen("Test Examen", vragen, antwoorden);
        return examen;
    }
}
