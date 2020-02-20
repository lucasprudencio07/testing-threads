package com.threads.alura;

public class ThreadDatabaseAccessProceed implements Runnable {

    private ConnectionPool pool;
    private TransactionManager manager;

    public ThreadDatabaseAccessProceed(ConnectionPool pool, TransactionManager manager) {

        this.pool = pool;
        this.manager = manager;
    }

    @Override
    public void run() {

        synchronized (manager) {
            System.out.println("Startig the transaction manager");
            manager.begin();

            synchronized (pool) {
                System.out.println("Get the connection");
                pool.getConnection();
            }

        }

    }

}
