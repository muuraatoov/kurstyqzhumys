package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Eratosfen {
    int n;
    boolean[] primes;
    public Eratosfen(int n) {
        this.n = n;
        try{
            primes=new boolean[n+1];
        }catch(OutOfMemoryError E){
            System.out.println("Память меньше нуля");
        }
        primes=new boolean[n+1];
    }
    public void fillSieve() {
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        for (int i = 2; i < primes.length; ++i) {
            if (primes[i]) {
                for (int j = 2; i * j < primes.length; ++j) {
                    primes[i * j] = false;
                }
            }
        }
    }

    public void printPrimes(){
        for(int i = 2; i < n; i++){
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}