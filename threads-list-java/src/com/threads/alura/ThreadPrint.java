package com.threads.alura;

public class ThreadPrint implements Runnable {

    private ElementList elementList;

    public ThreadPrint(ElementList list) {
        this.elementList = list;
    }

    @Override
    public void run() {

        if (!elementList.isFull()) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        synchronized (elementList) {

            try {
                System.out.println("Going to sleep, waiting notify");
                elementList.wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

            for (int i = 0; i < elementList.size(); i++) {

                System.out.println(i + " - " + elementList.getElement(i));
            }

        }

    }

}
