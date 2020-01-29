package temaLab4.animalRescue;

public class Animal {

    private String name;
    private float age;
    private int healthStatus;
    private int hungerStatus;
    private int spiritStatus;
    private String favouriteFood;
    private String favouriteActivity;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(float number) {
        age = number;
    }

    public float getAge() {
        return age;
    }

    public void setHealthStatus(int number) {
        healthStatus = number;
    }

    public int getHealthStatus() {
        return healthStatus;
    }

    public void setHungerStatus(int number) {
        hungerStatus = number;
    }

    public int getHungerStatus() {
        return hungerStatus;
    }

    public void setSpiritStatus(int number) {
        spiritStatus = number;
    }

    public int getSpiritStatus() {
        return spiritStatus;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteActivity(String favouriteActivity) {
        this.favouriteActivity = favouriteActivity;
    }

    public String getFavouriteActivity() {
        return favouriteActivity;
    }


}



