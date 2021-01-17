package com.company;

public class TaskFour {
    public static void taskFour(String text, String word) {
        String[] words = text.split(" ");
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase(word)) {
                counter++;
            }
        }
        System.out.println("Слово " + "'" + word + "'" + " повторяется " + (counter) + " раз(a)");
    }
}