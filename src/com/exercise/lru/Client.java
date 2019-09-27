package com.exercise.lru;

import java.util.concurrent.ThreadLocalRandom;

public class Client {

    public static void main(String[] args) {
        LRU lru = new LRU();
        Thread generateRequestsForTheServer = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    final int randomRequest = ThreadLocalRandom.current().nextInt(1000) % 10;
                    final String randomSuperHeroRequest = "super-hero-" + randomRequest;
                    System.out.println("Query for : [" + randomSuperHeroRequest + "]");
                    lru.getItem(randomSuperHeroRequest);
                }
            }
        });
        generateRequestsForTheServer.start();
        try {
            generateRequestsForTheServer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
