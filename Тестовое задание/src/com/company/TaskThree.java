package com.company;

public class TaskThree {
    public static void taskThree(String text){
        String[] words = text.split(" ");

        System.out.println("кол-во слов в предложении: \n" + words.length);

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length - 1; j++) {
                if (words[j].length() > words[j + 1].length()) {
                    String x = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = x;
                }
            }
        }
        System.out.println("Отсортированный текст(по кол-ву букв в слове) с поднятым регистром у перых букв: ");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1);
            System.out.print(words[i] + " ");
        }
        System.out.println();
    }
}
