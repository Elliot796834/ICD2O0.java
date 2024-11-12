import java.util.Scanner;

public class WeatherForecast {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Please enter the probability of precipitation (0 to 1): ");
        double probability = kb.nextDouble();

        if (probability < 0.07) {
            System.out.println("The weather will be dry.");
        } else if (probability > 0.6) {
            System.out.println("The forecast is rain.");
        } else {
            System.out.println("There is a small chance of rain.");
        }

        kb.close();
    }
}
