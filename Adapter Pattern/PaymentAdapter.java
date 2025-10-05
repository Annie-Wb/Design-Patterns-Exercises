public class PaymentAdapter implements PaymentProcessor{
    LegacyPayment oldpay = new LegacyPayment();

    @Override
    public void process(double amount) {
        oldpay.pay(amount);
    }
    
}
