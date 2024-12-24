package lab5.Adapter;

public class PaymentAdapter implements PaySys{
    private OldPaymentSystem oldPaymentSystem;

    public PaymentAdapter(OldPaymentSystem g){
        oldPaymentSystem = g;
    }

    public void pending(int amoumt){
        oldPaymentSystem.Payment(amoumt);
    }
}
