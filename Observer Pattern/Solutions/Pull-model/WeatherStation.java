import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private final List<Observer> observers = new ArrayList<>();
    private float temperature;

    // Register an observer
    public void addObserver(Observer o) {
        observers.add(o);
    }

    public float getTemperature() { return temperature; }

    // Remove an observer
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    // Whenever we set a new temp, notify observers
    public void setTemperature(float newTemp) {
        this.temperature = newTemp;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer o : observers) {
            o.update();  // Push model
        }
    }
}
