public class Person {
    
    char sex = 'm';
    String name = "Alex";
    int height = 175;
    float weight = 95.5F;
    int age = 45;

    void move() {
        System.out.println("I can move!");
    }

    void sit() {
        System.out.println("I can sit down!");
    }

    void run() {
        System.out.println("I can run!");
    }

    String speak() {
        return "I can speak";
    }

    boolean isLearnJava() {
        return true;
    }
}