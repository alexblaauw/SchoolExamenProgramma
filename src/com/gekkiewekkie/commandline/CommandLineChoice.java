package com.gekkiewekkie.commandline;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public abstract class CommandLineChoice {
    private String title; // The title/question that is asked before awaiting a user response
    private int choiceCount; // The number of choices that can be selected
    private ArrayList<String> choiceTitles; // A list of titles for each choice

    public CommandLineChoice(String title, int choiceCount, ArrayList<String> choiceTitles) throws ArrayIndexOutOfBoundsException {
        this.title = title;
        this.choiceCount = choiceCount;
        if (choiceCount < 1) {
            throw new ArrayIndexOutOfBoundsException("CommandLineChoice must be passed at least one choice option");
        }
        if (choiceTitles.size() != choiceCount) {
            throw new ArrayIndexOutOfBoundsException("choiceTitles.size() and choiceCount do not match!");
        }
        this.choiceTitles = choiceTitles;
    }

    /**
     * Prints the title/question and the possible choices as answers
     */
    public void initChoice() {}

    /**
     * Waits for a scanner.nextLine() response from the user
     * @return the index of the response starting at 0
     */
    public int awaitResponse() { return 0; }

    /**
     * Generic getter
     * @return title/question of this choice object
     */
    public String getTitle() { return title; }

    /**
     * Generic getter
     * @return number of choices provided by choice object
     */
    public int getChoiceCount() { return choiceCount; }

    /**
     * Generic getter
     * @param i index of the choice name you want to get
     * @return title of choice with index i
     */
    public String getChoiceTitle(int i) { return choiceTitles.get(i); }
}
