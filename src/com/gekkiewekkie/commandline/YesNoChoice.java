package com.gekkiewekkie.commandline;

import java.util.ArrayList;
import java.util.Arrays;

public class YesNoChoice extends CommandLineChoice {
    public YesNoChoice(String title, String yesTitle, String noTitle) {
        super(title, 2, new ArrayList<String>(Arrays.asList(yesTitle, noTitle)));
    }

    @Override
    public void initChoice() {
        System.out.println(this.getTitle());
        System.out.println("Y: " + getChoiceTitle(0));
        System.out.println("N: " + getChoiceTitle(1));
        System.out.print("Enter your answer: ");
    }
}
