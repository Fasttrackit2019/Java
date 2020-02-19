package temaLab7.animalRescue;

public abstract class Human {

    private String name;

    public abstract void setName(String name);

    public abstract String getName();

    public abstract void activity();

    public abstract void hobby();

    public void talk() {
        System.out.println("Woohoo");
    }

}

