package temaLab4.animalRescue;

public class AnimalFood {

    private String name;
    private int price;
    private int quantity;
    private boolean stockAvailability;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int number) {
        price = number;
    }

    public int getPrice() {
        return price;
    }

    public void setQuantity(int number) {
        quantity = number;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setStockAvailability(boolean value) {
        stockAvailability = value;
    }

    boolean getStockAvailability() {
        return stockAvailability;
    }


}
