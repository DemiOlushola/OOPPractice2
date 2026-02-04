package Geeks;

import java.util.Scanner;

public class Dato {
    void main(){
        getDate();
    }

    // A method for getting the date through some conditions
    void getDate(){
        String day = "";
        String month = "";
        String year = "";

        // Creates a scanner for getting input from the user
        Scanner s = new Scanner(System.in);

        System.out.print("What region are you in?(Europe or America): ");
        String currentRegion = s.nextLine(); // A variable to get the input from the scanner to use in the switch statement

        // Here i use a switch statement, instead of an if statement, only because it looks cleaner to me
        switch (currentRegion){
            case "Europe": // Here i check for when the input when asked is europe
                System.out.print("Day: ");
                day = s.nextLine();

                System.out.print("Month: ");
                month = s.nextLine();

                System.out.print("Year: ");
                year = s.nextLine();

                System.out.println(day + " " + month + " " + year);

                s.close();

                break;

            case "America":
                System.out.print("Day: ");
                day = s.nextLine();

                System.out.print("Month: ");
                month = s.nextLine();

                System.out.print("Year: ");
                year = s.nextLine();

                System.out.println(month + " " + day + ", " + year);

                s.close();

                break;
        }
    }
}
