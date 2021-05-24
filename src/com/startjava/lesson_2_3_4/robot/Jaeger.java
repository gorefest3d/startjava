package com.startjava.lesson_2_3_4.robot;

public class Jaeger {
    
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int strength;
    private int armor;
    private int speed;
    private String bodyLanguage;
    private int pilotCount;

    public Jaeger(String modelName, String mark, String origin, float height, float weight, int strength, int armor, int speed, String bodyLanguage, int pilotCount) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.strength = strength;
        this.armor = armor;
        this.speed = speed;
        this.bodyLanguage = bodyLanguage;
        this.pilotCount = pilotCount;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setPilotCount(int pilotCount) {
        this.pilotCount = pilotCount;
    }

    public boolean drift() {
        return true;
    }

    public void move() {
        System.out.println(modelName + " moving");
    }

    public void fly() {
        System.out.println(modelName + " flying");
    }

    public void fight() {
        System.out.println(modelName + " fighting");
    }

    public boolean isKjuKiller() {
        return true;
    }

    public String toString() {
        return "Jaeger{" +
                "Model Name='" + modelName + '\'' +
                ", Mark='" + mark + '\'' +
                ", Origin='" + origin + '\'' +
                ", Height=" + height +
                ", Weight=" + weight +
                ", Strength=" + strength +
                ", Armor=" + armor +
                ", Speed=" + speed +
                ", Body Language='" + bodyLanguage + '\'' +
                ", Pilot Count=" + pilotCount +
                '}';
    }
}