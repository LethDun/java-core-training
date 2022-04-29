package com.ec.exception;


public class ExceptionHandling {

    public static void main(String[] args) {
        int a = 10;
        try {
            int b;
            System.out.println(a);
            int t = 1;
            try {
                int zero = 0;
                int average = 10 / zero;
                System.out.println("Average = " + average);
            } catch (ArithmeticException ex) {
                System.out.println(ex);
            }

            try {
                int zero2 = 0;
                int average2 = 10 / zero2;
                System.out.println("Average = " + average2);
            } catch (ArithmeticException ex) {
                System.out.println(ex);
            }

            System.out.println("Continue...");
            int arr[] = new int[5];
            arr[5] = 4;
            System.out.println("arr[5] = " + arr[5]);

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
        }

        System.out.println("Finished!");
    }

}

