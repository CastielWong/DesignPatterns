package Observer.pull.dashboard;

import java.util.Observable;
import java.util.Observer;

import Observer.pull.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private Observable weatherData;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        this.weatherData.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        // pull the data only when the obs is WeatherData
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println(
                String.format("Current conditions: %sF degrees and %s%% humidity", temperature, humidity)
        );
    }
}
