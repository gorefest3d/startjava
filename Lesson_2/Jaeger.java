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
        System.out.println(this.modelName + " moving");
    }

    public void fly() {
        System.out.println(this.modelName + " flying");
    }

    public void fight() {
        System.out.println(this.modelName + " fighting");
    }

    public boolean isKjuKiller() {
        return true;
    }

    public void showInfo() {
        System.out.println("Model name: " + this.modelName);
        System.out.println("Mark name: " + this.mark);
        System.out.println("Origin: " + this.origin);
        System.out.println("Height: " + this.height);
        System.out.println("Weight: " + this.weight);
        System.out.println("Strength: " + this.strength);
        System.out.println("Armor: " + this.armor);
        System.out.println("Speed: " + this.speed);
        System.out.println("Body Language: " + this.bodyLanguage);
        System.out.println("Pilot Count: " + this.pilotCount);
    }
}