package com.threads.alura;

public class Main {

    public static void main(String... args) {

        TransactionManager tm = new TransactionManager();
        ConnectionPool pool = new ConnectionPool();

        new Thread(new ThreadDatabaseAccess(pool, tm)).start();
        new Thread(new ThreadDatabaseAccessProceed(pool, tm)).start();
    }

}
