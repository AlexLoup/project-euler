package com.euler;

import java.util.ArrayList;
/**
 *
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *                             20 is 19 + 17 + 13 + 11 + 17 = 77?
 * Find the sum of all the primes below two million.
 * A:142913828922 found 12/11/15
 */
public class ProblemTen {


    public static void main(String[] args) {

        int n = 2000000;
        System.out.println(sumOfPrimes(n));
    }


    public static Double sumOfPrimes(int a){
        if (a <= 2){
            return 0.0;
        }
        ArrayList<Double> primes = new ArrayList<>();
        primes.add(2.0);
        for (int i = 3; i < a; i+=2){
            if (isPrime(i)){
                primes.add(Double.valueOf(i));
                System.out.println("Prime added: " + i + ".\nSize of array: " + primes.size());
            }
        }
        return primes.stream().mapToDouble(Double::intValue).sum();

    }

    public static boolean isPrime(int a){


        for (int i = 3; i<=Math.sqrt(a); i+=2){
            if (a % i == 0)
            {
                return false;

            }
        }

        return true;
    }


}
