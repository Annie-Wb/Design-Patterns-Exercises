public class PhoneDisplay implements Observer{
    @Override
    public void update(float temp) {
        System.out.println("[Phone] Temperature Updated: " + temp);
    }
}
