package com.threads.alura.exercise01;

// isso serve para mostrar que não temos controle sobre a ordem de execução na Thread
public class ImprimeIDMain {

    public static void main(String... args) {

        new Thread(new ImprimeID()).start();
        new Thread(new ImprimeID()).start();
    }

}
