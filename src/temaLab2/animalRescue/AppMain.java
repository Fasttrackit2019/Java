package temaLab2.animalRescue;

public class AppMain {

    public static void main(String[] args) {

        Animal cat = new Animal();
        cat.name = "Pixie";
        cat.age = 1.2f;
        cat.healthStatus = 8;
        cat.hungerStatus = 7;
        cat.spiritStatus = 9;
        cat.favouriteFood = "fish";
        cat.favouriteActivity = "loves running after ball yarns";
        System.out.println(cat.name);
        System.out.println(cat.age);
        System.out.println(cat.healthStatus);
        System.out.println(cat.hungerStatus);
        System.out.println(cat.spiritStatus);
        System.out.println(cat.favouriteFood);
        System.out.println(cat.favouriteActivity);

        Adopter girl = new Adopter();
        girl.name = "Lucy";
        girl.availableMoney = 1000;
        System.out.println(girl.name);
        System.out.println(girl.availableMoney);

        AnimalFood meat = new AnimalFood();
        meat.name = "Sheba";
        meat.price = 15;
        meat.quantity = 80;
        meat.stockAvailability = true;
        System.out.println(meat.name);
        System.out.println(meat.price);
        System.out.println(meat.quantity);
        System.out.println(meat.stockAvailability);

        RecreationalActivity activity = new RecreationalActivity();
        activity.name = "purr";
        System.out.println(activity.name);

        Veterinarian staff = new Veterinarian();
        staff.name = "Jones";
        staff.specialisation = "Doctor";
        System.out.println(staff.name);
        System.out.println(staff.specialisation);
    }


}
