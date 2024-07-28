package behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        context.pay(100);

        context.setPaymentStrategy(new PayPalPayment("user@example.com"));
        context.pay(200);
    }
}
