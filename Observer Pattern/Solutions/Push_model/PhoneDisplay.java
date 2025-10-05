public class PhoneDisplay implements Observer {
    private float temperature;

    @Override
    public void update(float temperature){
        this.temperature = temperature;
        print();
    }

    public void print(){
        System.out.println("Temp on Phone: " + temperature);
    }
}
