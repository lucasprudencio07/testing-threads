package com.threads.alura.exercise01;

public class ImprimeID implements Runnable {

    private Integer id;

    @Override
    public void run() {

        for(int i = 1; i < 1001; i++) {

            Thread threadImprime = Thread.currentThread();
            System.out.println(threadImprime.getId() + " - " + i);
        }

    }

}
