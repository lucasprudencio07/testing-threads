package com.threads.alura;

public class ThreadGuest implements Runnable {

    private Bathroom bathroom;
    private String nome;

    public ThreadGuest(Bathroom bath) {
        this.bathroom = bath;
    }

    @Override
    public void run() {

        bathroom.doNumber01();
    }

}
