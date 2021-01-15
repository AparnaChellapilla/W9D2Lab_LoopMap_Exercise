package com.tts;

import java.util.*;


public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);// Define System input using a Scanner.
        System.out.println("Enter 1.Choosing Arrays (min,max,sum,product) \n 2.Choosing Cars from the list available: ");
        int select = in.nextInt();

        if (select == 1) {
            opNumbers selectNum = new opNumbers();
            selectNum.opNumbers();
        } else if (select == 2) {
            carDealer carSelect = new carDealer();
            carSelect.carDealer();
        } else {
            System.out.println("please Select valid input");
        }

    }
}


