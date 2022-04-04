package com.gekkiewekkie.commandline.interfaces;

public class MainExamHandler {
    public static void lijstExamen(){

    }

    public static void examenAfnemen() {
        ExamInterface examInterface = new ExamInterface();
        examInterface.runInterface();
    }
}
