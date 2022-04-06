package com.gekkiewekkie.commandline.interfaces;

import com.gekkiewekkie.exam.ExamList;
import com.gekkiewekkie.exam.Examen;

public class MainExamHandler {
    public static void lijstExamen(){
        for (Examen examen : ExamList.getExamenLijst()) {
            System.out.println(examen.getNaam() + ":");
            System.out.println(" Aantal vragen: " + examen.getAantalVragen());
            System.out.println(" Geslaagden: " + examen.getGeslaagden().size() + "\n");
        }
    }

    public static void examenAfnemen() {
        ExamInterface examInterface = new ExamInterface();
        examInterface.runInterface();
    }
}
