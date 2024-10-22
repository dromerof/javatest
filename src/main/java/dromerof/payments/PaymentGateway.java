package dromerof.payments;

public interface PaymentGateway {

    PaymentResponse requestPaymet(PaymentRequest request);

}
