package Observer;


import Observer.push.WeatherData;
import Observer.push.dashboard.CurrentConditionsDisplay;
import Observer.push.dashboard.StatisticsDisplay;

public class Simulator_Push {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println("----------------------------------------------------");
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println("----------------------------------------------------");
        weatherData.setMeasurements(78, 90, 29.2f);
        System.out.println("----------------------------------------------------");
    }

}
