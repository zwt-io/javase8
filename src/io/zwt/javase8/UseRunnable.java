package io.zwt.javase8;

public class UseRunnable {
    public static void main(String[] args) {

        Runnable r1 = () -> {

            try {
                Thread.sleep(2000);
                System.out.println("Running Thread 1");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable r2 = () -> System.out.println("Running Thread 2");

        new Thread(r1).start();
        new Thread(r2).start();
    }
}
