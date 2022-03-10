package com.gekkiewekkie.commandline;

import java.util.ArrayList;
import java.util.Scanner;

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

    @Override
    public int awaitResponse() {
        Scanner scanner = new Scanner(System.in);
        int output;
        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("Failed to parse response '" + scanner.nextLine() + "'");
            } else {
                output = scanner.nextInt();
                break;
            }
        }
        return output - 1;
    }
}
