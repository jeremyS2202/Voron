package com.company;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Введите значение a");
        long a=input.nextLong();
        System.out.print("Введите значение b");
        long b=input.nextLong();
        System.out.print("Введите значени с");
        long c=input.nextLong();


        long d=a*b;
        System.out.println();


        if (d==c){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }

    }
}