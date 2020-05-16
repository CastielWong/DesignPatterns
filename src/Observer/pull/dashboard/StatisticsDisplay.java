package Observer.pull.dashboard;

import java.util.Observable;
import java.util.Observer;

import Observer.pull.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {
    private Observable weatherData;
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;

    public StatisticsDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        this.weatherData.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        // pull the data only when the obs is WeatherData
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;

            float temperature = weatherData.getTemperature();
            tempSum += temperature;
            numReadings++;

            if (temperature > maxTemp) {
                maxTemp = temperature;
            }

            if (temperature < minTemp) {
                minTemp = temperature;
            }

            display();
        }
    }

    @Override
    public void display() {
        System.out.println(
                String.format("Statistics: Avg/Max/Min temperature = %s/%s/%s",
                        (tempSum / numReadings), maxTemp, minTemp)
        );
    }
}
