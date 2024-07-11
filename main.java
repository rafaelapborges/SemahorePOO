package com.main.java.semaphore;

public class Main {
    public static void main(String[] args) {
        frmSemaforoDefinitivo semaforo = new frmSemaforoDefinitivo();
        semaforo.setVisible(true);

        Thread hilo = new Thread(semaforo);
        hilo.start();
    }
}
