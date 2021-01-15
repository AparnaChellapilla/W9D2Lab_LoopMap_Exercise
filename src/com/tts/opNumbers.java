package com.tts;

import java.lang.String;
import java.lang.System;
import java.util.*;

public class opNumbers {

    public void opNumbers() {

        System.out.println("Enter how many numbers you want to work with?:");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] num = new int[size];
        int sum = 0;
        int product = 1;


        System.out.printf("Enter your %d numbers: ", size); // Ask the user for a number.

        for (int i = 0; i < num.length; i++) { // Loop 5 times
            num[i] = in.nextInt(); // Read the next int from the console.

            sum = sum + num[i];
            product = product * num[i];
        }
        System.out.println("Sum of integers: " + sum);
        System.out.println("Product of integers: " + product);

        Arrays.sort(num);// Sort the numbers in ascending order.

        System.out.println("Sorted Array in Ascending order:");
        for (int sortArr : num) {
            System.out.println(sortArr);
        }

        System.out.println("min number from the list is :" + num[0]);
        System.out.println("max number is :" + num[size - 1]);
    }
}

