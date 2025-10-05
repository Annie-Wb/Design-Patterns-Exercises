public class LEDDisplay implements Observer{
    @Override
    public void update(float temp) {
        System.out.println("[LED Panel] Now showing temperature: " + temp);
    }
}
