package com.company;

import java.util.Scanner;

public class Input {
    public static int inputNumber(String message) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println(message);
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Ошибка, число не целое!");
            return inputNumber(message);
        }
    }

    public static String inputText(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }

    public static String inputWord(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.next();
    }
}
