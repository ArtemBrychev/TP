package patterns.Fabric;

public class ApplePay implements PaymentService {
    public void paymentProcess(int amount){
        System.out.println("ApplePay payment successful(" + amount + ")");
    }
}
