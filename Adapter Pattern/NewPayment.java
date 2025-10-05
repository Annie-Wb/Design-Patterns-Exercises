public class NewPayment implements PaymentProcessor{
    
    @Override
    public void process(double amount) {
        System.out.println("New Payment Processed: " + amount);
    }
}
