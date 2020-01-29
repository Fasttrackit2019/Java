package temaLab4.animalRescue;

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

}
