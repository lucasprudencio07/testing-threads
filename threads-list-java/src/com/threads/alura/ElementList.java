package com.threads.alura;

public class ElementList {

    private String[] elements = new String[1000];
    private Integer index = 0;

    /* já esse syncronized faz que com um elemento seja adicionado de cada vez e
       que o contador adicione um de cada vez, antes que outro já acesse a função */
    public synchronized void addElements(String element) {
            this.elements[index] = element;
            this.index++;

        try {
            Thread.sleep(5);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (this.index == this.elements.length) {
            System.out.println("The list is full, now I will print it");
            this.notify();
        }

    }

    public Integer size() {
        return this.elements.length;
    }

    public String getElement(int index) {
        return this.elements[index];
    }

    public Boolean isFull() {
        return this.index == this.size();
    }

}
