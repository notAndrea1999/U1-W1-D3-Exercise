package shop;

import java.util.Random;

public class Articolo {
    private int id;
    private String description;
    private double price;
    private int itemsNumber;

    public Articolo(String description, double price, int itemsNumber) {
        Random rndm = new Random();
        this.id = rndm.nextInt(1, 1000);
        this.description = description;
        this.price = price;
        this.itemsNumber = itemsNumber;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Articolo{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", itemsNumber=" + itemsNumber +
                '}';
    }
}
