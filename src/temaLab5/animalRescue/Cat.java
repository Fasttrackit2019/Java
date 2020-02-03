package temaLab5.animalRescue;

public class Cat extends Animal {
    public void miau() {
        System.out.println("Miau, Miau, Miau");
    }

    public void chaseMouse() {
        System.out.println("Catch mouse");
    }

    @Override
    public void play() {
        System.out.println("The cat is playing with a yarn");
    }

    @Override
    public void eat() {
        System.out.println("The cat is drinking milk");
    }

    @Override
    public void furColor() {
        System.out.println("The cat color is white");
    }
}
