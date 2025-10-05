public class Main {
    public static void main(String[] args) {
        PaymentProcessor newPay = new NewPayment();
        PaymentProcessor oldPay = new PaymentAdapter();

        newPay.process(500);
        oldPay.process(551);
    }
}
