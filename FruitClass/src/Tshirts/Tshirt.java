package Tshirts;

import java.text.NumberFormat;

public class Tshirt {
    String color;
    String size;
    String print;
    int cost;

    public Tshirt(String color, String size, String print, int cost){
        this.color = color;
        this.size = size;
        this.print = print;
        this.cost = cost;
    }

    void getInformation(String type) {

        NumberFormat n = NumberFormat.getCurrencyInstance();

        switch(type) {
            case "color":
                System.out.println("The color is " + color);
                break;
            case "size":
                System.out.println("The size is " + size);
                break;
            case "print":
                System.out.println("The print is " + print);
                break;
            case "cost":
                System.out.println("The cost is " + n.format(cost));
                break;
        }
    }

}
