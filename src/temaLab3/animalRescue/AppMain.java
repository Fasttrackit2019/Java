package temaLab3.animalRescue;

public class AppMain {

    public static void main(String[] args) {


        Animal cat = new Animal();

        cat.setName("Pixie");
        System.out.println(cat.getName());

        cat.setAge(1.2f);
        System.out.println(cat.getAge());

        cat.setHealthStatus(8);
        System.out.println(cat.getHealthStatus());

        cat.setHungerStatus(7);
        System.out.println(cat.getHungerStatus());

        cat.setSpiritStatus(9);
        System.out.println(cat.getSpiritStatus());

        cat.setFavouriteFood("fish");
        System.out.println(cat.getFavouriteFood());

        cat.setFavouriteActivity("loves running after ball yarns");
        System.out.println(cat.getFavouriteActivity());


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
