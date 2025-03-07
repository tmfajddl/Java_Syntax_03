package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        boolean[] arr1 = new boolean[]{true, false, true};
        double[] arr2 = new double[]{3.14,7.77,11.11};
        int[] arr3 = new int[10];
        for(int i = 0; i < arr3.length; i++)
            arr3[i] = i+1;
        System.out.println("arr1");
        for(int i = 0; i < arr1.length; i++)
            System.out.print(arr1[i]+ " ");
        System.out.println("");
        System.out.println("arr2");
        for(int i = 0; i < arr2.length; i++)
            System.out.print(arr2[i] + " ");
        System.out.println("");
        System.out.println("arr3");
        for(int i = 0; i < arr3.length; i++)
            System.out.print(arr3[i]+ " ");
        System.out.println("");
    }
}


