package com.concurrency;

public class DownloadFileTask implements Runnable {
    @Override
    public void run() {
        System.out.println("DownloadFileTask.run " + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("DownloadFileTask.completed" + Thread.currentThread().getName());
    }
}
