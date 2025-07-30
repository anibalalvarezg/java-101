package com.concurrency;

public class DownloadFileTask implements Runnable {
    @Override
    public void run() {
        System.out.println("DownloadFileTask.run " + Thread.currentThread().getName());

        for (var i = 0; i < Integer.MAX_VALUE; i++) {
            if (Thread.currentThread().isInterrupted()) {
                return;
            }
            System.out.println("Proccess" + i);
        }
        System.out.println("DownloadFileTask.completed" + Thread.currentThread().getName());
    }
}
