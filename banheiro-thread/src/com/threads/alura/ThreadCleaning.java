package com.threads.alura;

public class ThreadCleaning implements Runnable {

    private Bathroom bathroom;

    public ThreadCleaning(Bathroom bath) {
        this.bathroom = bath;
    }

    @Override
    public void run() {

        while (true) { // criando a repetição, para que o banheiro seja limpo a cada 15 segundos
            bathroom.clean();

            try {
                Thread.sleep(15000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

}
