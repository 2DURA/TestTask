package com.company;

import java.util.Random;

public class TaskSix {
    public static void taskSix(int size) {
        if (size <= 0) {
            System.out.println("Размер рюкзака не может быть меньше либо равен 0.");
            taskSix(Input.inputNumber("Пожалуйста, введите размер рюкзака заново: "));
        } else {
            Random random = new Random();
            Item book = new Item("Книга", random.nextInt(size) +1, random.nextInt(size) + 1);
            book.setPpuos(book);
            book.getInfo(book);
            Item pen = new Item("Ручка", random.nextInt(size) + 1, random.nextInt(size) + 1);
            pen.setPpuos(pen);
            pen.getInfo(pen);
            Item apple = new Item("Яблоко", random.nextInt(size) + 1, random.nextInt(size) + 1);
            apple.setPpuos(apple);
            apple.getInfo(apple);
            Item bottle = new Item("Бутылка", random.nextInt(size) + 1, random.nextInt(size) + 1);
            bottle.setPpuos(bottle);
            bottle.getInfo(bottle);

            Backpack backpack = new Backpack(size);
            backpack.calculate(book, pen, apple, bottle, size);
        }
    }
}

class Item {
    private String name;
    private int cost;
    private int weight;
    private double ppuos; //price per unit of space

    public Item(String name, int cost, int weight) {
        this.name = name;
        this.cost = cost;
        this.weight = weight;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setWeight(int cost) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPpuos(Item item) {
        this.ppuos = (double) item.getCost() / (double) item.getWeight();
    }

    public double getPpuos() {
        return ppuos;
    }

    public void getInfo(Item item) {
        System.out.println(item.getName() + " Вес = " + item.getWeight() + "; Цена = " + item.getCost() + ";");
    }
}

class Backpack {
    private int size;

    public Backpack(int size) {
        this.size = size;
    }

    public void setSize(int num) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void calculate(Item book, Item pen, Item apple, Item bottle, int size) {
        Item[] arrOfItems = new Item[4];
        arrOfItems[0] = book;
        arrOfItems[1] = pen;
        arrOfItems[2] = apple;
        arrOfItems[3] = bottle;

        for (int i = 0; i < arrOfItems.length; i++) {
            for (int j = 0; j < arrOfItems.length - 1; j++) {
                if (arrOfItems[j].getPpuos() < arrOfItems[j + 1].getPpuos() || (arrOfItems[j].getPpuos() == arrOfItems[j + 1].getPpuos() &&
                        size % arrOfItems[j + 1].getWeight() == 0)) {
                    Item temp = arrOfItems[j];
                    arrOfItems[j] = arrOfItems[j + 1];
                    arrOfItems[j + 1] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("Места в портеле: " + size);

        for (int i = 0; i < arrOfItems.length; i++) {
            int quantity = size / arrOfItems[i].getWeight();
            if(quantity != 0) {
                System.out.println("Предмет: '" + arrOfItems[i].getName() + "'; Кол-во: " + quantity + " на сумму: " + quantity * arrOfItems[i].getCost() +
                        "; Общий вес: " + quantity * arrOfItems[i].getWeight());
            }
            if (size - (quantity * arrOfItems[i].getWeight()) <= 0) {
                break;
            } else {
                size -= quantity * arrOfItems[i].getWeight();
            }
        }
        System.out.println();
    }
}