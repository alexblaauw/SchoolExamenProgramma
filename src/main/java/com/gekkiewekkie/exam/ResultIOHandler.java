package com.gekkiewekkie.exam;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ResultIOHandler {

    public void saveArrayList(ArrayList<Integer> list, String filePath) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.setPrettyPrinting().create();

        String jsonList = gson.toJson(list);

        // Code die de json string in een bestand opslaat of zo idk
        try {
            File fileOut = new File(filePath);
            fileOut.createNewFile();

            FileWriter writer = new FileWriter(filePath);
            writer.write(jsonList);
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Integer> loadArrayList(String filePath) throws FileNotFoundException {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.setPrettyPrinting().create();
        Reader reader = new FileReader(filePath);

        //gson.fromJson() leest Integers als Doubles dus we moeten de arraylist eerst handmatig omzetten
        ArrayList<Double> input = gson.fromJson(reader, ArrayList.class);
        ArrayList<Integer> output = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            output.add(input.get(i).intValue());
        }

        return output;
    }
}
