package ch04;

import java.util.Objects;

class Item {
    String description;
    double price;

    public Item(String description, double price) {
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    public boolean equals(Object otherObject) {
        // A quick test to see if the objects are identical
        if (this == otherObject) return true;
        // Must return false if the explicit parameter is null
        if (otherObject == null) return false;
        // Check that otherObject is a Item
        if (!(otherObject instanceof Item)) return false;
        // Test whether the instance variables have identical values
        Item other = (Item) otherObject;
        return Objects.equals(description, other.description)
                && price == other.price;
    }

    public int hashCode() {
        return Objects.hash(description, price);
    }
}

class DiscountedItem extends Item {
    private double discount;

    public DiscountedItem(String description, double price, double discount) {
        super(description, price);
        this.discount = discount;
    }

    // WRONG IMPLEMENTATION, see main()
    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) return false;
        if (otherObject instanceof DiscountedItem) {
            DiscountedItem other = (DiscountedItem) otherObject;
            return discount == other.discount;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), discount);
    }

    @Override
    public String toString() {
        return "DiscountedItem{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }
}

public class Ex06ItemEquals {
    public static void main(String[] args) {
        Item item1 = new Item("Item1", 100);
        DiscountedItem discItem10 = new DiscountedItem("Item1", 100, 10);
        DiscountedItem discItem20 = new DiscountedItem("Item1", 100, 20);

        // symmetry is ok
        System.out.println("---Symmetry---");
        System.out.println(item1 + "==" + discItem10 + " : " + item1.equals(discItem10));
        System.out.println(discItem10 + "==" + item1 + " : " + discItem10.equals(item1));

        // transitivity fails
        System.out.println("---Transitivity---");
        System.out.println(discItem10 + "==" + item1 + " : " + discItem10.equals(item1));
        System.out.println(item1 + "==" + discItem20 + " : " + item1.equals(discItem10));
        System.out.println(discItem10 + "==" + discItem20 + " : " + discItem10.equals(discItem20));
    }
}
