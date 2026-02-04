public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Tim");

        boolean isAlien = false;
        if (isAlien)
            System.out.println("It's an alien!");
        else
            System.out.println("Not an alien!");

        int topScore = 80;
        if (topScore >= 100)
            System.out.println("You got the high score!");

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }
        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an error!");
        }
        boolean isCar = true;
        if (!isCar) {
            System.out.println("This is not supposed to happen!");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = (makeOfCar != "Volkswagen");
        if (isDomestic) {
            System.out.println(isDomestic);
        }

        String s = (isDomestic) ? "This car is domestic!" : "This car is not domestic!";
        System.out.println(s);

        double var = 20.00d;
        double var2 = 80.00d;
        double addNumbers = (var + var2) * 100.00d;
        double remainder = addNumbers % 40.00d;
        System.out.println("My total numbers: " + addNumbers);
        boolean hasRemainder = (remainder == 0.00d) ? false : true;

        if (!hasRemainder)
            System.out.println("No remainder: " + hasRemainder + " - " + remainder);
        else {
            System.out.println("It has a remainder: " + hasRemainder + " - " + remainder);
        }
    }
}
