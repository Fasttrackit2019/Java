package temaLab7.animalRescue;

public class Cat extends Animal {
    public void miau() {
        System.out.println("Miau, Miau, Miau");
    }

    public void chaseMouse() {
        System.out.println("Catch mouse");
    }

    @Override
    public void setName(String name) {
        System.out.println("Garfield");
    }

    @Override
    public String getName() {
        return "Garfield";
    }

    @Override
    public void setAge(float number) {
    }

    @Override
    public float getAge() {
        return 2;
    }

    @Override
    public void setHealthStatus(int number) {
    }

    @Override
    public int getHealthStatus() {
        return 7;
    }

    @Override
    public void setHungerStatus(int number) {
    }

    @Override
    public int getHungerStatus() {
        return 4;
    }

    @Override
    public void setSpiritStatus(int number) {
    }

    @Override
    public int getSpiritStatus() {
        return 9;
    }

    @Override
    public void setFavouriteFood(String favouriteFood) {
    }

    @Override
    public String getFavouriteFood() {
        return "Whiskas";
    }

    @Override
    public void setFavouriteActivity(String favouriteActivity) {
    }

    @Override
    public String getFavouriteActivity() {
        return "Chasing mice";
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
