package com.threads.alura;

public class ThreadGuest02 implements Runnable {

    private Bathroom bathroom;
    private String nome;

    public ThreadGuest02(Bathroom bath) {
        this.bathroom = bath;
    }

    @Override
    public void run() {

            bathroom.doNumber02();
    }

}
