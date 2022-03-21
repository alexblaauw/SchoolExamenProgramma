package com.gekkiewekkie.commandline.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

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

    @Override
    public int awaitResponse() {
        Scanner scanner = new Scanner(System.in);
        int output = 0;
        while (true) {
            if (scanner.hasNextLine()) {
                String input = scanner.nextLine();
                if (input.toLowerCase().equals("y") || input.toLowerCase().equals("yes")) {
                    return 0;
                } else if (input.toLowerCase().equals("n") || input.toLowerCase().equals("no")) {
                    return 1;
                }
                else {
                    System.out.println("Failed to parse response '" + input + "'");
                    System.out.print("Enter your answer: ");
                }
            }
        }
    }
}
