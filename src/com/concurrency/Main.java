package com.concurrency;

public class Main {
    public static void main(String[] args) {
        // Processes and threads
        System.out.println(Thread.activeCount());
        System.out.println(Runtime.getRuntime().availableProcessors());

        // Starting a thread
        System.out.println(Thread.currentThread().getName());
        for(var i = 1; i <= 10; i++) {
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
        }
    }
}
