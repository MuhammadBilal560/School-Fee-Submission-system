public class PaymentService {

    public void pay(String method) {
        System.out.println("Payment done using: " + method);
    }

    public void sendReceipt(String userEmail) {
        System.out.println("Receipt sent to " + userEmail);
    }
}