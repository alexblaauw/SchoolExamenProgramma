package com.gekkiewekkie.commandline.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Supplier;

public class MultipleLetterChoice extends CommandLineChoice{
    public MultipleLetterChoice(String title, String... choices) {
        this(title, choices.length, new ArrayList<>(Arrays.asList(choices)));
    }
    public MultipleLetterChoice(String title, int choiceCount, ArrayList<String> choiceTitles) {
        super(title, choiceCount, choiceTitles);
        if (choiceCount > 26) {
            throw new ArrayIndexOutOfBoundsException("Maximum choice count for MultipleLetterChoice is 26.");
        }
    }

    @Override
    public void initChoice() {
        System.out.println(getTitle());
        for (int i = 0; i < getChoiceCount(); i++) {
            System.out.println((char)(i + 65) + ": " + getChoiceTitle(i));
        }
        System.out.print("Enter your answer: ");
    }

    @Override
    public int awaitResponse() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.nextLine();
            if (s.length() != 1) {
                System.out.println("Failed to parse response '" + s + "'");
                System.out.print("Enter your answer: ");
            }
            else if ((int)(s.toUpperCase().charAt(0)) - 65 < 0 || (int)(s.toUpperCase().charAt(0)) - 65 > getChoiceCount() - 1) {
                System.out.println("Failed to parse response'" + s + "'");
                System.out.print("Enter your answer: ");
            }
            else {
                return (int)(s.toUpperCase().charAt(0)) - 65;
            }
        }
    }
}
