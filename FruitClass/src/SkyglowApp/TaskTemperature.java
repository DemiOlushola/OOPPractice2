package SkyglowApp;

public class TaskTemperature {
    static void main() {
        double temperatureRise = 1;

        checkTemperature(temperatureRise);
    }


    static void checkTemperature(double temp){
        if (temp > 2.0) {
            System.out.println("WARNING! Temperature is rising!");
        }
        else {
            System.out.println("Everything is going smoothly!");
        }
    }
}
