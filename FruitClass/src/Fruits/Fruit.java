package Fruits;

public class Fruit {
    String fruitName = "";
    int price = 0;
    int quantity = 0;

    // Creates a Fruit with the given properties
    public Fruit(String fruitName, int price, int quantity) {
        this.fruitName = fruitName;
        this.price = price;
        this.quantity = quantity;
    }

    // Sells a given amount of this specific fruit if there is enough in stock
    void sell(int amount) {
        if (quantity >= amount) {
            quantity -= amount;

            System.out.println("You have sold " + amount + " " + fruitName + "s");
            System.out.println("You have " + quantity + " left of " + fruitName + "s");
        } else {
            System.out.println("There is not enough " + fruitName + "s");
        }
    }

    // Adds more of the fruit to the stock
    void buy(int amount) {
        quantity += amount;
        System.out.println("You have added " + amount + " " + fruitName + "s");
    }
}
