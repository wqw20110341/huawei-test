package com.demo;

/**
 * @author 125827
 * @version 1.0
 * @description: TODO
 * @date 9/10/2022 2:51 PM
 */
public class Main {
    public static void main(String[] args) {

        int i = 0;
        int a[] = { 3,6,4,8,5,6 };
        do {
            a[i] -= 3;
        } while (a[i++] < 4);
        for (i = 0; i < 6; i++)
        {
            System.out.print(a[i]);
            System.out.print(" ");
        }
    }
}
