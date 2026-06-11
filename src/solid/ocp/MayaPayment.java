package solid.ocp;

public class MayaPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Maya");
    }
}