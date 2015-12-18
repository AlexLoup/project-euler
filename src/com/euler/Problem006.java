package com.euler;

/**
 *
 *   The sum of the squares of the first ten natural numbers is,
 *   12 + 22 + ... + 102 = 385
 *   The square of the sum of the first ten natural numbers is,
 *   (1 + 2 + ... + 10)2 = 552 = 3025
 *
 *   Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 *
 *   Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

public class Problem006 {
    public static void main(String[] args) {

        int n = 100;
        System.out.println(String.format("The difference between the sum of squares of the first %d natural numbers" +
                "and the square of the sum is: %d.", n, getSumOfSquares(n)));
    }

    public static int getSumOfSquares (int n){
        int sumSquare = 0;
        double squareSum;
        int sum = 0;
        for(int i=1; i <= n; i++){
            sumSquare += Math.pow(i,2);
            sum += i;
        }
        squareSum = Math.pow(sum,2);

        return ((int)(squareSum - sumSquare));
    }
}
