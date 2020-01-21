package lab3.animalRescue;

public class Dog {

    private String name;
    private String race;
    private float age;
    private String color;
    private int size;
    private boolean isFriendly;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getRace() {
        return race;
    }

    public void setAge(float number) {
        age = number;
    }

    public float getAge() {
        return age;
    }

    public void setColor(String text) {
        color = text;
    }

    public String getColor() {
        return color;
    }

    public void setSize(int number) {
        size = number;
    }

    public int getSize() {
        return size;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = true;
    }

    public void setIsFriendly(boolean value) {
        isFriendly = value;
    }

    public boolean getIsFriendly() {
        return isFriendly;
    }


    public void run() {
        System.out.println("(tries to) Run all day!");
    }

    public void sleep() {
        System.out.println("zZZzzZZZ snore...");
    }

    public void eat() {
        System.out.println("Eating now a burger");
    }

}
