package com.threads.alura;

public class Main {

    public static void main(String... args) {

        String nome = "John";

        Thread threadPesquisaAssinatura = new Thread(new ThreadBuscaTextual("assinaturas1.txt", nome));
        Thread threadPesquisaAssinatura2 = new Thread(new ThreadBuscaTextual("assinaturas2.txt", nome));
        Thread threadPesquisaAutores = new Thread(new ThreadBuscaTextual("autores.txt", nome));

        threadPesquisaAssinatura.start();
        threadPesquisaAssinatura2.start();
        threadPesquisaAutores.start();

    }

}
