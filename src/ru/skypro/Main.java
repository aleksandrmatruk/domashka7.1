package ru.skypro;

import java.time.LocalDate;

public class Main {

    public static void metod_1(int year){
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным!");
        }
        else System.out.println(year + " год не является високосным!");
    }

    public static void metod_2(int clientOS, int clientDeviceYear){

        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear <= 2014 || clientDeviceYear < currentYear) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для AndroidOS по ссылке");
            }
        } else {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для AndroidOS по ссылке");
            }
        }
    }

    public static void metod_3(int deliveryDistance){
        int deliveryDay = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDay);}

        else {
            if (deliveryDistance >20 && deliveryDistance < 60) { deliveryDay = deliveryDay+1;
                System.out.println("Потребуется дней: " + deliveryDay);}
        }

        if (deliveryDistance >60 && deliveryDistance < 100) { deliveryDay = deliveryDay+2;
            System.out.println("Потребуется дней: " + deliveryDay);
        }
    }
    public static void metod_4(String str){
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i-1)) {
                System.out.println("Дублей нет!");

            } else {
                System.out.println("Дубль!" + str.charAt(i));


            }
        }
    }




    public static void main(String[] args) {

        System.out.println("Задание 1");
        metod_1(2020);
        System.out.println();

        System.out.println("Задание 2");
        metod_2(1, 2015);
        System.out.println();

        System.out.println("Задание 3");
        metod_3(55);
        System.out.println();

        System.out.println("Задание 4");
        metod_4("abcdd");





    }
}

