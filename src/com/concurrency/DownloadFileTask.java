package com.concurrency;

public class DownloadFileTask implements Runnable {
    private final DownloadStatus status;

    public DownloadFileTask() {
        this.status = new DownloadStatus();
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

    public DownloadStatus getStatus() {
        return status;
    }
}
