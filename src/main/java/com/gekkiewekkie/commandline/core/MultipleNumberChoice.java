package com.gekkiewekkie.commandline.core;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleNumberChoice extends CommandLineChoice {
    private boolean endingZero; // Whether the last item in the list should be listed as 0 instead of its actual number in this list
    public MultipleNumberChoice(String title, int choiceCount, ArrayList<String> choiceTitles, boolean endingZero) {
        super(title, choiceCount, choiceTitles);
        this.endingZero = endingZero;
    }
    public MultipleNumberChoice(String title, int choiceCount, ArrayList<String> choiceTitles) {
        this(title, choiceCount, choiceTitles, false);
    }

    @Override
    public void initChoice() {
        System.out.println(getTitle());
        for (int i = 0; i < getChoiceCount(); i++) {
            if (endingZero && i == getChoiceCount() - 1) {
                System.out.println("0: " + getChoiceTitle(i));
            } else {
                System.out.println((i + 1) + ": " + getChoiceTitle(i));
            }
        }
        System.out.print("Enter your answer: ");
    }

    @Override
    public int awaitResponse() {
        Scanner scanner = new Scanner(System.in);
        int output;
        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("Failed to parse response '" + scanner.nextLine() + "'");
            } else {
                output = scanner.nextInt();
                if (output == 0 && endingZero) {
                    output = getChoiceCount();
                    break;
                } else if (output != 0) {
                    break;
                } else {
                    System.out.println("Failed to parse response '" + output + "'");
                }
            }
        }
        return output - 1;
    }
}