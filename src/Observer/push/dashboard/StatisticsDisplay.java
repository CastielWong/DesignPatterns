package Observer.push.dashboard;

import Observer.push.component.Observer;
import Observer.push.component.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {
    private Subject weatherData;
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
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

    @Override
    public void display() {
        System.out.println(
                String.format("Statistics: Avg/Max/Min temperature = %s/%s/%s",
                        (tempSum / numReadings), maxTemp, minTemp)
        );
    }
}
