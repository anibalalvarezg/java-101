package com.concurrency;

import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    private int totalBytes = 0;
    private int totalFiles;

    private Object totalBytesLock = new Object();
    private Object totalFilesLock = new Object();

    public int getTotalBytes() {
        return totalBytes;
    }

    public void setTotalBytes(int totalBytes) {
        this.totalBytes = totalBytes;
    }

    public void incrementTotalBytes() {
       synchronized (totalBytesLock) {
           totalBytes++;
       }
    }

    public synchronized void incrementTotalFiles() {
        totalFiles++;
    }

    public int getTotalFiles() {
        return totalFiles;
    }
}
