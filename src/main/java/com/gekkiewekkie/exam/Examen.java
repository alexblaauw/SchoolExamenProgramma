package com.gekkiewekkie.exam;

import com.gekkiewekkie.commandline.core.CommandLineChoice;
import com.gekkiewekkie.person.Student;
import com.gekkiewekkie.person.StudentList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Examen {
    private static ArrayList<Examen> examenLijst = new ArrayList();
    private static int slaagPercentage = 55;
    private ArrayList<Student> geslaagden = new ArrayList();
    private CommandLineChoice[] vragen;
    private Integer[] antwoorden;
    private String naam;
    private int aantalVragen;
    private int totaalScore = 0;

    public Examen(String naam, CommandLineChoice[] vragen, Integer[] correcteAntwoorden) {
        this.naam = naam;
        this.aantalVragen = vragen.length;
        this.vragen = vragen;
        this.antwoorden = correcteAntwoorden;

        if (vragen.length != correcteAntwoorden.length || vragen.length < 1) {
            throw new ArrayStoreException("Number of questions and number of answers must be the same when intializing Examen");
        }
    }

    public static ArrayList<Examen> getExamenLijst() {
        return examenLijst;
    }

    public String getNaam() {
        return naam;
    }

    public ArrayList<Student> getGeslaagden() {
        return geslaagden;
    }

    public Integer getAantalVragen() {
        return aantalVragen;
    }

    public Integer getCorrectAntwoord(int vraagNummer) {
        return antwoorden[vraagNummer];
    }

    public void examenAfnemen(int studentenNummer) {
        Integer[] resultaten = new Integer[antwoorden.length];
        int score = 0;
        for (int i = 0; i < vragen.length; i++) {
            vragen[i].initChoice();
            resultaten[i] = vragen[i].awaitResponse();
            if (resultaten[i] == antwoorden[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Fout!");
            }
        }

        if ((score / (double) aantalVragen) * 100 > slaagPercentage) {
            Student student = StudentList.getStudentByNummer(studentenNummer);
            student.addGehaaldeExamen(this);
        }
        ResultIOHandler fileHandler = new ResultIOHandler();
        fileHandler.saveArrayList(new ArrayList<>(Arrays.asList(resultaten)),"src/main/resources/exam_" + naam + "_" + studentenNummer + ".json");
    }

    public double getTotaalScore() {
        return totaalScore / (double) aantalVragen * 100;
    }

    public boolean isGeslaagd(int totaalScore) {
        if (totaalScore >= getTotaalScore()) {
            return true;
        }
        else return false;
    }

    public int getSlaagPercentage() {
        return slaagPercentage;
    }
}
