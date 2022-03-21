package com.gekkiewekkie;

import com.gekkiewekkie.commandline.core.MultipleNumberChoice;
import com.gekkiewekkie.commandline.core.YesNoChoice;
import com.gekkiewekkie.commandline.interfaces.MainInterface;
import com.gekkiewekkie.exam.ResultIOHandler;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
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
