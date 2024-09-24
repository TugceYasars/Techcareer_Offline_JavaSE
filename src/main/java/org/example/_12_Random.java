package org.example;

import java.util.Random;
import java.util.UUID;

public class _12_Random {
    public static void main(String[] args) {
//Random
        System.out.println(Math.random()*3+1);
        System.out.println(Math.floor(Math.random()*3+1));

        Random rand = new Random();
        int rnd = rand.nextInt(3)+1;
        System.out.println(rnd);

//        UUID
        System.out.println(UUID.randomUUID().toString());
    }
}

