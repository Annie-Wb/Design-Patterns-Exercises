public class LEDDisplay implements Observer{
    private final WeatherStation station;

    public LEDDisplay(WeatherStation station) { this.station = station; }

    @Override
    public void update() {
        System.out.println("[LED Panel] Now showing temperature: " + station.getTemperature());
    }
}
