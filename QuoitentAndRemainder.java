package com.day5.assignments;

import java.util.Scanner;

public class QuoitentAndRemainder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a First number :");
        int num1 = sc.nextInt();

        System.out.println("Enter a second  number :");
        int num2 = sc.nextInt();

        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("The quotient is: " + quotient);
        System.out.println("The remainder is: " + remainder);
    }

}
