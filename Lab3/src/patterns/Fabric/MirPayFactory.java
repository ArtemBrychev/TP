package patterns.Fabric;

public class MirPayFactory extends PaymentServiceFactory{
    public MirPay createService(){
        return new MirPay();
    }
}
