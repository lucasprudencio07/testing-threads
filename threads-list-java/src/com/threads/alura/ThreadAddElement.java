package com.threads.alura;

import java.util.List;

public class ThreadAddElement implements Runnable {

    private ElementList element;
    private Integer elementIndex;

    public ThreadAddElement(ElementList elementOfTheList, Integer index) {
        this.element = elementOfTheList;
        this.elementIndex = index;
    }

    @Override
    public void run() {

        for (Integer i = 0; i < 100; i++) {

            synchronized (this) { // esse syncronyzed faz com que cada thread "itere" a lista de cada vez
                element.addElements("Thread: " + elementIndex + " - " + i);
            }

        }

    }

}
