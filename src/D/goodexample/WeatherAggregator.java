package D.goodexample;


import java.util.Arrays;

/**
 *  Using this approach, our High-level module (WeatherAggregator)
 *  does not depend on low-level modules, it depends on abstraction.
 */

public class WeatherAggregator {

    private WeatherSource[] weatherSources;

    public WeatherAggregator(WeatherSource[] weatherSources) {
        this.weatherSources = weatherSources;
    }

    public double getTemperature(){
        return Arrays.stream(weatherSources)
                .mapToDouble(WeatherSource::getTemperatureInCelcium)
                .average()
                .getAsDouble();
    }
}
