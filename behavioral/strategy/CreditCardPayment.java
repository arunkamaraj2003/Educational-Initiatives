package behavioral.strategy;

public class CreditCardPayment implements PaymentStrategy {
    @SuppressWarnings("unused")
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}
