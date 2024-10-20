package patterns.Fabric;

public class ApplePayFactory extends PaymentServiceFactory{
    public ApplePay createService(){
        return new ApplePay();
    }
}
