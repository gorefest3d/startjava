package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int count;
    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public void setNumber(int number) {
        numbers[count] = number;
        count++;
    }

    public int getNumber() {
        return numbers[count - 1];
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, count);
    }

    public void clearNumbers() {
        count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                Arrays.fill(numbers, 0, i, 0);
            }
        }
    }
}