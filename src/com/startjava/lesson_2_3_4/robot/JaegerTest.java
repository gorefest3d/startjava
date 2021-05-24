package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger itemOne = new Jaeger("Gipsy Avenger", "Mark-6", "USA", 81.77F, 2.004F, 8, 9, 150, "Street Fighter", 2);
        Jaeger itemTwo = new Jaeger("Striker Eureka", "Mark-5", "Australia", 76.2F, 1.850F, 7, 8, 170, "Six Shooter", 1);

        itemOne.setArmor(11);
        itemOne.setPilotCount(3);
        itemTwo.setSpeed(200);

        itemOne.move();
        itemTwo.fly();
        itemOne.fight();
        itemTwo.fight();

        System.out.println(itemOne);
        System.out.println("///////////////////");
        System.out.println(itemTwo);
    }
}