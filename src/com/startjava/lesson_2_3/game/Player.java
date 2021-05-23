package com.startjava.lesson_2_3.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int number;
    private int count;
    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number, int count) {
        this.number = number;
        this.count = count + 1;
        numbers[count] = number;
    }

    public int getNumber() {
        return number;
    }

    public int getCount() {
        return count;
    }

    public String getNumbers() {
        String numbersInfo = "";
        int[] numbersCopy = Arrays.copyOf(numbers, count);
        for (int number : numbersCopy) {
            numbersInfo += number + " ";
        }
        return numbersInfo;
    }

    public void clearNumbers() {
        Arrays.fill(numbers, 0, count, 0);
    }
}






