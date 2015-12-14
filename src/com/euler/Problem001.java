package com.euler;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem001 {
    public static void main(String[] args) {
        int max = 1000;
        int multipleLo = 3;
        int multipleHi = 5;
        System.out.println(String.format("The sum of all multiples of %d and %d below %d is: %d.",
                multipleLo, multipleHi, max, sumMultiples(max, multipleLo, multipleHi)));
    }

    public static int sumMultiples (int n, int x, int y){
        int sum = 0;
        for (int i = 1; i < n; i++){
            if (i % x == 0 || i % y == 0){
                sum += i;
            }
        }
        return sum;
    }
}
