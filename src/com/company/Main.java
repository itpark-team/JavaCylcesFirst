package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        int i = 0;
        while (i < 5) {
            System.out.println((i + 1) + " - hello world");
            i++;
        }
        System.out.println("done");
        */

        double money = 1000;
        double percent = 5;
        int countYears = 10;
        int i = 0;

        while (i < countYears) {

            money = money + (money * percent / 100);

            i++;

            System.out.println("after " + i + " years your money = " + money);
        }

        //System.out.println("after 10 years your money = " + money);
    }
}
