package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Нумерация программ аналогична нумерайции в условии.");
        int p;
        do {
            p = Input.inputNumber("Выберите, какое задание вы хотите посмотреть (от 1 до 6 или нажмите 7 для завершения программы):");
            switch (p - 1) {
                case 0:
                    System.out.println("Задание 1.");
                    TaskOne.taskOne(Input.inputNumber("Пожалуйста, введите целое число: "));
                    break;
                case 1:
                    System.out.println("Задание 2.");
                    TaskTwo.taskTwo(Input.inputNumber("Пожлауйста, введите перое число: "),
                            Input.inputNumber("Пожлауйста, введите второе число: "));
                    break;
                case 2:
                    System.out.println("Задание 3.");
                    TaskThree.taskThree(Input.inputText("Пожалуйста,ведите предложение: "));
                    break;
                case 3:
                    System.out.println("Задание 4.");
                    TaskFour.taskFour(Input.inputText("Пожалуйста, введите текст: "), Input.inputWord("Введите одно слово"));
                    break;
                case 4:
                    System.out.println("Задание 5.");
                    TaskFive.taskFive(Input.inputNumber("Пожалуйста, введите диапазон (меньше 100 и больше 0)"));
                    break;
                case 5:
                    System.out.println("Задание 6.");
                    TaskSix.taskSix(Input.inputNumber("Пожалуйста, введите размер портфеля: "));
                    break;
                case 6:
                    System.out.println("Программа завершена.");
                    break;
                default:
                    System.out.println("Пожалуйта, водите числа от 1 до 7!");
            }
        } while (p != 7);
    }
}

