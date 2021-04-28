public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        
        wolfOne.sex = 'm';
        System.out.println(wolfOne.sex);

        wolfOne.nickname = "Akella";
        System.out.println(wolfOne.nickname);

        wolfOne.weight = 25.5F;
        System.out.println(wolfOne.weight);

        wolfOne.age = 6;
        System.out.println(wolfOne.age);

        wolfOne.color = "Бурый";
        System.out.println(wolfOne.color);

        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}