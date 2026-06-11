package solid.ocp;

public class GCashPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using GCash");
    }
}