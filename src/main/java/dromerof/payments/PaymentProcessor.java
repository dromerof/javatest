package dromerof.payments;

public class PaymentProcessor {

    private final PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public boolean makePayment(double amount) {

        PaymentResponse response = paymentGateway.requestPaymet(new PaymentRequest(amount));
        if (response.getStatus() == PaymentResponse.PaymentStatus.OK) {
            return true;
        } else {
            return false;
        }
    }
}
