public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        Observer phone = new PhoneDisplay(station);
        Observer led = new LEDDisplay(station);

        station.addObserver(phone);
        station.addObserver(led);

        station.setTemperature(25.0f);
        station.setTemperature(30.5f);

        station.removeObserver(led);
        station.setTemperature(28.0f);
    }
}
