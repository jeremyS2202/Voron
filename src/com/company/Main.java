package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Введите количество гостей");
        int guest=input.nextInt();

        if (guest==2){
            System.out.println(1);
        }

        if (guest%2==0){
            System.out.println(guest/2);

        }
        else if (guest%2==1) {
            System.out.println(guest);
        }


    }



}
