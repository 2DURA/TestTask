package com.company;

public class TaskFive {
    public static void taskFive(int range){
        if (range > 100 || range < 1){
            System.out.println("Ошибка! Число, введенное вами не соответствует диапазону.");
            taskFive(Input.inputNumber("Пожалуйста, введите число (меньше 100 и больше 0)."));
        }else {
            for (int i = 0; i < range + 1; i++) {
                if (i % 10 == i / 10 || i / 10 == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}
