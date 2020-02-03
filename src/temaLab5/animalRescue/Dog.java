package temaLab5.animalRescue;

public class Dog extends Animal {
    private boolean hunter;

    public void bark() {
        System.out.println("Woof Woof");
    }

    public void setHunter(boolean hunter) {
        this.hunter = hunter;
    }

    public boolean getHunter() {
        return hunter;
    }

    @Override
    public void play() {
        System.out.println("The dog is playing with the stick");
    }

    @Override
    public void eat() {
        System.out.println("The dog is eating a bone");
    }

    @Override
    public void furColor() {
        System.out.println("The dog color is black");
    }
}
