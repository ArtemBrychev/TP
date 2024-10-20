package patterns.Fabric;

public class MirPay implements PaymentService{
    public void paymentProcess(int amount){
        System.out.println("MirPay payment successful(" + amount +")");
    }
}
