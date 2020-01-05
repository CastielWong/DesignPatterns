package Observer.pull.dashboard;

import java.util.Observable;
import java.util.Observer;

import Observer.pull.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {
    private Observable observable;
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
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
                String.format("Avg/Max/Min temperature = %s/%s/%s",
                        (tempSum / numReadings), maxTemp, minTemp)
        );
    }
}
