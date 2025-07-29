package com.concurrency;

public class DownloadFileTask implements Runnable {
    @Override
    public void run() {
        System.out.println("DownloadFileTask.run " + Thread.currentThread().getName());
    }
}
