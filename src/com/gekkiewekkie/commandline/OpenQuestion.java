package com.gekkiewekkie.commandline;

import java.util.Scanner;

public class OpenQuestion {
    private String title; // The title/question that is asked before awaiting a user response
    public OpenQuestion(String title) {
        this.title = title;
    }
    public String getTitle() { return title; }
    public void initQuestion() {
        System.out.println(title);
    }
    public String awaitResponse() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
