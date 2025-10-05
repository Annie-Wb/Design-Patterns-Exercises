public class PhoneDisplay implements Observer{
    private final WeatherStation station;

    public PhoneDisplay(WeatherStation station) { this.station = station; }
    
    @Override
    public void update() {
        System.out.println("[Phone] Temperature Updated: " + station.getTemperature());
    }
}
