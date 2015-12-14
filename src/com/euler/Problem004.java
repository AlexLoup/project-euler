package com.euler;

/**
 *  A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit
 *  numbers is 9009 = 91 × 99.
 *
 *  Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem004 {
    public static void main(String[] args) {

        int digitLength = 3;
        System.out.println(String.format("Largest palindrome from the product of two %d digit numbers: %d",
                digitLength, getLargestPalindrome(digitLength)));


    }

    public static int getLargestPalindrome(int digLn){
        int ceiling = (int) (1 * Math.pow(10, digLn));
        int floor = (int) (1 * Math.pow(10, digLn - 1));
        int largest = 0;
        int a = ceiling - 1;
        int b = a;

        for (int i = a; i >= floor; i--){
            for (int j = b; j >= floor; j--){
                if (isPalindrome(Integer.toString(i * j))
                        && ((i * j) > largest)){
                    largest = (i * j);
                }
            }

        }
        return largest;
    }

    public static boolean isPalindrome (String s){
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) == s.charAt(s.length() - (i+1))) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
