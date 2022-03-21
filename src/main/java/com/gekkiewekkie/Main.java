package com.gekkiewekkie;

import com.gekkiewekkie.commandline.core.MultipleNumberChoice;
import com.gekkiewekkie.commandline.core.YesNoChoice;
import com.gekkiewekkie.commandline.interfaces.MainInterface;
import com.gekkiewekkie.exam.ResultIOHandler;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /*ArrayList<String> choices = new ArrayList<>();
        choices.add("Test1");
        choices.add("Test2");

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(27);

        ResultIOHandler ioHandler = new ResultIOHandler();
        ioHandler.saveArrayList(list, "list.json");
        ArrayList<Integer> newList = ioHandler.loadArrayList("list.json");
        System.out.println(newList.get(1));

        YesNoChoice choice = new YesNoChoice("Trying testing", "hai", "iie");
        choice.initChoice();
        int i = choice.awaitResponse();
        System.out.println("Index of answer provided: " + i);

        YesNoChoice choice2 = new YesNoChoice("Trying testing", "hai", "iie");
        choice.initChoice();
        int i2 = choice.awaitResponse();
        System.out.println("Index of answer provided: " + i);*/

        // Voorbeeld van hoe je een interface presenteert in dit programma:
        MainInterface mainInterface = new MainInterface();
        mainInterface.runInterface();
        // De runInterface functie kan uitgevuld worden met een stel print statements, multiple choices, etc.
        Examen Examen1 = new Examen(3);
        Examen1.Examen1();
        Examen Examen2 = new Examen(3);
        Examen2.Examen2();
    }
}
