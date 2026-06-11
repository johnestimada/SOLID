package solid;

import solid.dip.*;
import solid.lsp.*;
import solid.ocp.*;
import solid.srp.*;
import solid.ISP.*;

public class Main {
    public static void main(String[] args) {

        // SRP
        System.out.println("=== SRP ===");
        new ReportGenerator().generate();
        new ReportExporter().exportPDF();
        new EmailSender().sendEmail();

        // OCP
        System.out.println("\n=== OCP ===");
        PaymentProcessor processor = new PaymentProcessor();
        processor.processPayment(new GCashPayment(), 100);
        processor.processPayment(new MayaPayment(), 200);
        processor.processPayment(new CreditCardPayment(), 300);

        // LSP
        System.out.println("\n=== LSP ===");
        Shape rect = new Rectangle(5, 10);
        Shape square = new Square(4);
        System.out.println("Rectangle Area: " + rect.getArea());
        System.out.println("Square Area: " + square.getArea());

        // ISP
        System.out.println("\n=== ISP ===");
        new Car().drive();
        new Airplane().fly();
        new Boat().sail();

        // DIP
        System.out.println("\n=== DIP ===");
        UserService service = new UserService(new ConsoleLogger());
        service.createUser("John");
    }
}