package com.concurrency;

public class DownloadFileTask implements Runnable {
    private final DownloadStatus status;

    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("DownloadFileTask.run " + Thread.currentThread().getName());

        for (var i = 0; i < Integer.MAX_VALUE; i++) {
            if (Thread.currentThread().isInterrupted()) {
                return;
            }
            this.status.incrementTotalBytes();
        }
        System.out.println("DownloadFileTask.completed" + Thread.currentThread().getName());
    }
}
