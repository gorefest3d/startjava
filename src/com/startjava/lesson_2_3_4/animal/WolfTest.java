package com.startjava.lesson_2_3_4.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        
        wolfOne.setSex('m');
        System.out.println(wolfOne.getSex());

        wolfOne.setNickname("Akella");
        System.out.println(wolfOne.getNickname());

        wolfOne.setWeight(25.5F);
        System.out.println(wolfOne.getWeight());

        wolfOne.setAge(6);
        System.out.println(wolfOne.getAge());

        wolfOne.setColor("Бурый");
        System.out.println(wolfOne.getColor());

        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}