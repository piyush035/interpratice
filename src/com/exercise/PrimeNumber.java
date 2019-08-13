package com.exercise;

import java.util.Scanner;
//1500450271
public class PrimeNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=2; i < Math.sqrt(t) ; i++){
            if(t%i == 0){
                System.out.println("Number not is prime");
                return;
            }
        }
        System.out.println("Number  is prime");
    }
}
