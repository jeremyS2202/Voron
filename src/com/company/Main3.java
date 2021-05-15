package com.company;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        int crane;
        Scanner input = new Scanner(System.in);

        System.out.println("Введите количество журавликов");
        crane = input.nextInt();

        int catya = (2 * crane) / 3;
        System.out.print(" Катюха" +catya);

        int petya =(crane- catya) / 2;
        System.out.print(" Петька" +petya);

        int serega = petya;
        System.out.print(" Серега" +serega);


    }
}