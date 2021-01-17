package com.company;

public class TaskTwo {
    public static void taskTwo(int fNum, int sNum) {
        if(fNum < 0 || sNum < 0){
            System.out.println("Ни одно из чисел не должно быть отрицательным!");
            taskTwo(Input.inputNumber("Пожлауйста, введите перое число: "), Input.inputNumber("Пожлауйста, введите второе число: "));
        }else {
            int nod = 0, x = fNum, y = sNum;
            while (x - y != 0) {
                nod = Math.abs(x - y);
                x = y;
                y = nod;
            }
            System.out.println("НОД = " + nod + "\nНОК = " + (fNum * sNum / nod));
        }
    }
}
