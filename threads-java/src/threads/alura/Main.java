package threads.alura;

public class Main {

    public static void main(String[] args) {

        System.out.println("The main class has started");

        try {

            Thread.sleep(1000); // durante 1 segundo

        } catch (InterruptedException ie) {

            ie.printStackTrace();
        }

    }

}
