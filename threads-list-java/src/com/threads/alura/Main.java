package com.threads.alura;

import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String... args) {

        /* é possível criar uma lista sincronizada assim como o vetor, pois o List não
           é thread safe, então ela NÃO PODE SER SINCRONIZADA */
//        List<String> list = Collections.synchronizedList(new ArrayList<String>());
        ElementList list = new ElementList();

        for (int i = 0; i < 10; i++) {

            new Thread(new ThreadAddElement(list, i)).start();
        }

        new Thread(new ThreadPrint(list)).start();

    }

}
