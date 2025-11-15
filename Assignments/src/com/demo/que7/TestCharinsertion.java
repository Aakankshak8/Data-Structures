package com.demo.que7;

import java.util.Scanner;

public class TestCharinsertion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of arrays: ");
        int n = sc.nextInt();

        char[] arr = new char[n];

        System.out.println("Enter the characters of an array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next().charAt(0);    // store correctly
        }

        Charinsertion.insertionsort(arr);
    }
}
