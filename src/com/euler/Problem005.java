package com.euler;

/**
 *  2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *  What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 *
 */
public class Problem005 {
    public static void main(String[] args) {

        int n = 20;
        System.out.println(String.format(
                "The smallest number divisible by all numbers from 1 to %d is: %d",
                n, getSmallestDivisible(n)));
    }

    public static int getSmallestDivisible(int n){
        int m = n;
        do{
            for (int i = n-1; i>0; i--) {
                if (i == 2 && m % i == 0) {
                    return m;
                } else if (m % i == 0){
                    continue;
                } else {
                        m += n;
                        i = n;
                }

            }
        }while(true);

    }

}
