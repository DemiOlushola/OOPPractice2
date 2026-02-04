package Fruits;

public class Main {
    static void main() {
        Fruit orange = new Fruit("orange", 20, 10);
        Fruit tomato = new Fruit("tomato", 30, 18);
        orange.sell(5);

        orange.sell(5);
        tomato.sell(23);
        orange.buy(20);
        orange.sell(11);
    }
}
