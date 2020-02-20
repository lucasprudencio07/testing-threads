package com.threads.alura;

public class Bathroom {

    private Boolean isDirty = Boolean.TRUE;

    public void doNumber01() {

        String threadName = Thread.currentThread().getName();

        System.out.println(threadName + " is waiting outside");

        // o 'syncronized' torna o acesso sincronizado, como se fosse pegar a chave do banheiro antes de entrar
        // e nesse caso o this refere-se a uma função dentro da própria classe
        // agora o acesso está sincronizado, LOGO MAIS DE UMA THREAD NÃO PODE ACESSAR O MESMO OBJETO AO MESMO TEMPO
        synchronized (this) {

            System.out.println(threadName + " has entered in the bath");

            while (isDirty) {
                waitOutside(threadName);
            }

            System.out.println(threadName + " doing things fast");

            sleepFromThread(3000);

            this.isDirty = Boolean.TRUE;

            System.out.println(threadName + " flushing");
            System.out.println(threadName + " washing hands");
            System.out.println(threadName + " is out of the bathroom");
        }

    }

    public void doNumber02() {

        String threadName = Thread.currentThread().getName();

        System.out.println(threadName + " is waiting outside");

        synchronized (this) {

            System.out.println(threadName + " has entered in the bath");

            while (isDirty) {
                waitOutside(threadName);
            }

            System.out.println(threadName + " doing things slowly");

            sleepFromThread(10000);

            this.isDirty = Boolean.TRUE;

            System.out.println(threadName + " cleaning ass");
            System.out.println(threadName + " flushing");
            System.out.println(threadName + " washing hands");
            System.out.println(threadName + " is out of the bathroom");
        }

    }

    private void waitOutside(String threadName) {

        System.out.println(threadName + " the bathroom is veryyy dirty, I will wait outside");

        try {
            this.wait(); // esse bloco sairá da execução e aguadará
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void clean() {

        String nome = Thread.currentThread().getName();

        synchronized (this) {

            System.out.println(nome + " is waiting outside");

            System.out.println(nome + " has entered in the bath");

            if(!isDirty) {
                System.out.println(nome + " the bathroom is not dirty");
            }

            System.out.println(nome + " cleaning bathroom");
            this.isDirty = Boolean.FALSE;

            sleepFromThread(13000);

            System.out.println("The bathroom is clean");
            this.notifyAll();

        }

    }

    private void sleepFromThread(int timeInMillis) {
        try {
            Thread.sleep(timeInMillis);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
