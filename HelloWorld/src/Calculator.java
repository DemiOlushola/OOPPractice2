public class Calculator {
    public static int calculation(char operation, int a, int b) {
        if (operation == '*') {
            return a * b;
        }

        else if (operation == '/') {
            return a / b;
        }

        else if (operation == '+') {
            return a + b;
        }

        else if (operation == '-') {
            return a - b;
        }

        return 0;
    }

    public static String message() {
        return "You are the best for using this calculator!";
    }
}
