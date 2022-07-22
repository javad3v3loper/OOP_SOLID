package D.badexample;

public class WeatherAggregator {

    private AccuweatherApi accuweatherApi = new AccuweatherApi();
    private BbcWeatherApi bbcWeatherApi = new BbcWeatherApi();

    public double getTemperature(){
        return (accuweatherApi.getTemperatureCelcius()
                    + toCelsius(bbcWeatherApi.getTemperatureFahrenheit())) / 2;
    }
    // In case we want to add new Weather API with new format of temperature,
    // we will need to create new converter to Celsium and re-test work of this unit again.
    // Also, we will need to change our WeatherAggregator code every time API changes
    // In other words: any changes in low-level modules will impact high-level module(WeatherAggregator)
    // To avoid it, we need to invert dependency, see goodexample package
    private double toCelsius(double temperatureFahrenheit) {
        return (temperatureFahrenheit - 32) / 1.8f;
    }
}
