package com.company;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String args[]) {
        Scanner num = new Scanner(System.in);  //енгізу нөмірі
        int n = num.nextInt();  //ұзындығы
        Eratosfen er=new Eratosfen(n);
        er.fillSieve();
        er.printPrimes();
    }
}