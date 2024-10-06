package samples;
public class TemperatureManager {
    private double[] temperatures;

    public TemperatureManager(double[] temperatures) {
        // Initialize the temperature array with 7 elements
        this.temperatures = temperatures;
    }

    public double findMaxTemperature() {
        double maxTemp = temperatures[0];
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > maxTemp) {
                maxTemp = temperatures[i];
            }
        }
        return maxTemp;
    }

    public double findMinTemperature() {
        double minTemp = temperatures[0];
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] < minTemp) {
                minTemp = temperatures[i];
            }
        }
        return minTemp;
    }

    public double calculateAverageTemperature() {
        double sum = 0;
        for (int i = 0; i < temperatures.length; i++) {
            sum += temperatures[i];
        }
        return sum / temperatures.length;
    }

    public static void main(String[] args) {
        double[] temps = {25.0, 27.5, 30.0, 28.4, 26.8, 29.9, 31.2};
        TemperatureManager manager = new TemperatureManager(temps);

        System.out.println("Max Temperature: " + manager.findMaxTemperature());
        System.out.println("Min Temperature: " + manager.findMinTemperature());
        System.out.println("Average Temperature: " + manager.calculateAverageTemperature());
    }
}