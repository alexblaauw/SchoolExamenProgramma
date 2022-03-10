package com.gekkiewekkie.commandline;

import java.util.ArrayList;

public class MultipleNumberChoice extends CommandLineChoice {
    public MultipleNumberChoice(String title, int choiceCount, ArrayList<String> choiceTitles) {
        super(title, choiceCount, choiceTitles);
    }

    @Override
    public void initChoice() {
        System.out.println(getTitle());
        for (int i = 0; i < getChoiceCount(); i++) {
            System.out.println((i + 1) + ": " + getChoiceTitle(i));
        }
        System.out.print("Enter your answer: ");
    }
}
