package temaLab7.animalRescue;

public abstract class Animal {

    private String name;
    private float age;
    private int healthStatus;
    private int hungerStatus;
    private int spiritStatus;
    private String favouriteFood;
    private String favouriteActivity;

    public abstract void setName(String name);

    public abstract String getName();

    public abstract void setAge(float number);

    public abstract float getAge();

    public abstract void setHealthStatus(int number);

    public abstract int getHealthStatus();

    public abstract void setHungerStatus(int number);

    public abstract int getHungerStatus();

    public abstract void setSpiritStatus(int number);

    public abstract int getSpiritStatus();

    public abstract void setFavouriteFood(String favouriteFood);

    public abstract String getFavouriteFood();

    public abstract void setFavouriteActivity(String favouriteActivity);

    public abstract String getFavouriteActivity();

    public abstract void play();

    public abstract void eat();

    public abstract void furColor();

}



