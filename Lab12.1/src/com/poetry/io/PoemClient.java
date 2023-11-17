package com.poetry.io;

import java.io.*;

public class PoemClient {

    public static void main(String[] args) {
        readPoem();
        writePoem();
    }

    private static void readPoem() {
        try (BufferedReader reader = new BufferedReader(new FileReader("famous-poem.txt"))) {
            String line;
            while ((line = reader.readLine()) != null ) { // null means EOF
                System.out.println(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
    }

    private static void writePoem() {
        String poem = "Whispers in the breeze, \nLeaves dance under moonlit sky, \nNature's quiet song.";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("haiku.txt"))) {
            String line;
            writer.write(poem);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}