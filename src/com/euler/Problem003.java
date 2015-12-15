package com.euler;

/**
 *  The prime factors of 13195 are 5, 7, 13 and 29.
 *
 *  What is the largest prime factor of the number 600851475143 ?
 *
 */
public class Problem003 {
    public static void main(String[] args) {
        double n = 600851475143.0;
        System.out.println((int)getLargestPrimeFactor(n));
    }

    public static double getLargestPrimeFactor (double n){
        for (int i=(int)(Math.floor(Math.sqrt(n))); i > 0; i--){
            if (n % i == 0 &&
                    Problem010.isPrime(i))     // This is cheating but I did problem 10 before this ¯\_(ツ)_/¯
            {
                return i;
            }
        }
        return 0;
    }

}
