package com.company;

public class TaskOne {
    public static void taskOne(int num) {
        if (num % 2 == 0) {
            System.out.print("Число " + num + " четное ");
        } else {
            System.out.print("Число " + num + " нечетное ");
        }
        boolean t = false;
        for (int i = 2; i < Math.round(Math.sqrt(num)) + 1; i++) {
            if (num % i == 0) {
                System.out.println("и является составным");
                t = true;
                break;
            }
        }
        if (t == false){
            System.out.println("и является простым");
        }
    }
}
