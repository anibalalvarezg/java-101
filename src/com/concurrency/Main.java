package com.concurrency;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Processes and threads
        System.out.println(Thread.activeCount());
        System.out.println(Runtime.getRuntime().availableProcessors());

        // Starting a thread
//        System.out.println(Thread.currentThread().getName());
//        for(var i = 1; i <= 10; i++) {
//            Thread thread = new Thread(new DownloadFileTask());
//            thread.start();
//        }

//        Thread thread = new Thread(new DownloadFileTask());
//        thread.start();
//
//        try {
//            thread.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("File is ready to  be scanned");

//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        thread.interrupt();

        List<Thread> threads = new ArrayList<Thread>();
        List<DownloadFileTask> task = new ArrayList<>();

        for (var i = 0; i < 10; i++) {
            var taskTest = new DownloadFileTask();
            task.add(taskTest);
            var thread = new Thread(taskTest);
            thread.start();
            threads.add(thread);
        }

        for (var thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        var totalBytes = task.stream()
                .map(t -> t.getStatus().getTotalBytes())
                .reduce(0, Integer::sum);
        System.out.println(totalBytes);
    }
}
