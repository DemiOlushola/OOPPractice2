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

        // Creates a scanner for getting input for the suer
        Scanner s = new Scanner(System.in);

        System.out.print("What region are you in?(Europe or America): ");
        String currentRegion = s.nextLine();

        // Here i use a switch statement, instead of an if statement, only because it looks cleaner ti ne
        switch (currentRegion){
            case "Europe":
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
