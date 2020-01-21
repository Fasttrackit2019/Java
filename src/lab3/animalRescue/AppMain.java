package lab3.animalRescue;

public class AppMain {

    public static void main(String[] args) {

        Dog rex = new Dog();
        rex.setName("Rex");
        System.out.println(rex.getName());

        rex.setRace("pug");
        System.out.println(rex.getRace());

        rex.setAge(1.2f);
        System.out.println(rex.getAge());

        rex.setColor("brown");
        System.out.println(rex.getColor());

        rex.setSize(30);
        System.out.println(rex.getSize());

        rex.setIsFriendly(true);
        System.out.println(rex.getIsFriendly());


    }


}
