package temaLab4.animalRescue;

public class AppMain {

    public static void main(String[] args) {

        Cat kitty = new Cat();

        kitty.setName("Pixie");
        System.out.println(kitty.getName());

        kitty.setAge(1.2f);
        System.out.println(kitty.getAge());

        kitty.setHealthStatus(8);
        System.out.println(kitty.getHealthStatus());

        kitty.setHungerStatus(7);
        System.out.println(kitty.getHungerStatus());

        kitty.setSpiritStatus(9);
        System.out.println(kitty.getSpiritStatus());

        kitty.setFavouriteFood("fish");
        System.out.println(kitty.getFavouriteFood());

        kitty.setFavouriteActivity("loves running after ball yarns");
        System.out.println(kitty.getFavouriteActivity());

        kitty.miau();

        Cat myCat = new Cat();

        myCat.chaseMouse();
        myCat.setFavouriteFood("Milk");
        System.out.println(myCat.getFavouriteFood());
        myCat.miau();

        Dog myDog = new Dog();
        myDog.setName("Bella");
        System.out.println(myDog.getName());
        myDog.setHunter(true);
        System.out.println(myDog.getHunter());
        myDog.bark();


        Adopter girl = new Adopter();

        girl.setName("Lucy");
        System.out.println(girl.getName());

        girl.setAvailableMoney(120.5f);
        System.out.println(girl.getAvailableMoney());


        AnimalFood meat = new AnimalFood();

        meat.setName("Sheba");
        System.out.println(meat.getName());

        meat.setPrice(15);
        System.out.println(meat.getPrice());

        meat.setQuantity(80);
        System.out.println(meat.getQuantity());

        meat.setStockAvailability(true);
        System.out.println(meat.getStockAvailability());


        RecreationalActivity activity = new RecreationalActivity();

        activity.setName("purr");
        System.out.println(activity.getName());


        Veterinarian staff = new Veterinarian();

        staff.setName("Jones");
        System.out.println(staff.getName());

        staff.setSpecialisation("doctor");
        System.out.println(staff.getSpecialisation());
        
    }


}
