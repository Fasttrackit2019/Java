package temaLab7.animalRescue;

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
    public void setName(String name) {

    }

    @Override
    public String getName() {
        return "Oscar";
    }

    @Override
    public void setAge(float number) {
    }

    @Override
    public float getAge() {
        return 3;
    }

    @Override
    public void setHealthStatus(int number) {
    }

    @Override
    public int getHealthStatus() {
        return 8;
    }

    @Override
    public void setHungerStatus(int number) {
    }

    @Override
    public int getHungerStatus() {
        return 9;
    }

    @Override
    public void setSpiritStatus(int number) {
    }

    @Override
    public int getSpiritStatus() {
        return 6;
    }

    @Override
    public void setFavouriteFood(String favouriteFood) {
    }

    @Override
    public String getFavouriteFood() {
        return "Chappy";
    }

    @Override
    public void setFavouriteActivity(String favouriteActivity) {
    }

    @Override
    public String getFavouriteActivity() {
        return "Returning the stick";
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
