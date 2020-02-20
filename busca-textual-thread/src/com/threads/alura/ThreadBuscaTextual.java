package com.threads.alura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThreadBuscaTextual implements Runnable {

    private String fileName;
    private String nome;

    public ThreadBuscaTextual(String filePath, String nome) {

        this.fileName = filePath;
        this.nome = nome;
    }

    @Override
    public void run() {

        try {

            Scanner scanner = new Scanner(new File(fileName));

            int lineNumber = 1;

            while (scanner.hasNextLine()) {
                String lineValue = scanner.nextLine();

                if (lineValue.toLowerCase().contains(nome.toLowerCase())) {
                    System.out.println(fileName + " - " + lineNumber + " - " + lineValue );
                }

                lineNumber++;
            }

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
