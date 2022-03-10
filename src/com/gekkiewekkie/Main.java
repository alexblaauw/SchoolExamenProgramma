package com.gekkiewekkie;

import com.gekkiewekkie.commandline.MultipleLetterChoice;
import com.gekkiewekkie.commandline.MultipleNumberChoice;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> choices = new ArrayList<>();
        choices.add("Test1");
        choices.add("Test2");

        MultipleNumberChoice choice = new MultipleNumberChoice("Trying testing", 2, choices);
        choice.initChoice();
        int i = choice.awaitResponse();
        System.out.println("Index of answer provided: " + i);
    }
}
