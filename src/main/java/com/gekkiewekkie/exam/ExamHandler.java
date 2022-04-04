package com.gekkiewekkie.exam;

import com.gekkiewekkie.commandline.interfaces.ExamInterface;

public class ExamHandler {
    public static void lijstExamen(){

    }

    public static void examenAfnemen() {
        ExamInterface examInterface = new ExamInterface();
        examInterface.runInterface();
    }
}
