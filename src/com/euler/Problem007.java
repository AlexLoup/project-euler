package com.euler;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *
 * What is the 10 001st prime number?
 */
public class Problem007 {

    public static void main(String[] args) {

        int n = 10001;
        System.out.println(String.format("The %dth prime number is %d.", n, getNthPrime(n)));
    }

    public static int getNthPrime (int n){
        int count = 1;
        int x = 1;
        boolean prime;
        while (count < n){
            x++;
            if (Problem010.isPrime(x)){
                count++;
            }
        }
        return x;
    }
}
