package com.threads.alura;

public class ThreadDatabaseAccess implements Runnable {


    private final ConnectionPool pool;
    private final TransactionManager transaction;

    public ThreadDatabaseAccess(ConnectionPool pool, TransactionManager transactionManager) {
        this.pool = pool;
        this.transaction = transactionManager;
    }

    @Override
    public void run() {

         synchronized (pool) {
             System.out.println("I got the pool key");
             pool.getConnection();

             synchronized (transaction) {
                 System.out.println("Starting to manage the transaction");
                 transaction.begin();
             }

         }

    }

}
