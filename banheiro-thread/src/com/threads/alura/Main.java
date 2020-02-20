package com.threads.alura;

public class Main {

    public static void main(String... args) {

        Bathroom bath = new Bathroom();

        Thread friend01 = new Thread(new ThreadGuest(bath), "Nico");
        Thread friend02 = new Thread(new ThreadGuest02(bath), "Paulo");

        Thread cleaning = new Thread(new ThreadCleaning(bath), "Cleaning Staff");

        // funcionam como provedores de serviços para outras threads
        cleaning.setDaemon(true); // finaliza a thread quando não houver mas nenhuma outra sendo executada

        // podemos setar a prioridade de execução de uma thread em uma
//        cleaning.setPriority(Thread.MIN_PRIORITY ou 1, Thread.MAX_PRIORITY ou 10);

        friend01.start();
        friend02.start();
        cleaning.start();
    }

}
