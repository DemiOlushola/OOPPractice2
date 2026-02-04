package SkyglowApp;

public class TemperatureConverter {
    static void main() {
        int temp = converter(70);
        System.out.println(temp);
    }

    static int converter(int fahrenheit) {
        return (fahrenheit - 32)*5/9;
    }
}
