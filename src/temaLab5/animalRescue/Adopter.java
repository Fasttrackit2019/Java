package temaLab5.animalRescue;

public class Adopter extends Human {

    private float availableMoney;

    public void setAvailableMoney(float number) {
        availableMoney = number;
    }

    public float getAvailableMoney() {
        return availableMoney;
    }

    @Override
    public void activity() {
        System.out.println("Searching for a pet");
    }

    @Override
    public void hobby() {
        System.out.println("The favourite hobby is dancing");
    }
}
