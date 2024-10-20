import patterns.Single;
import patterns.Fabric.*;
import patterns.AbstractFabric.*;

public class Main{
    public static void main(String[] args){
        //Singleton
        Single h = Single.getInstance();
        h.haha();
        Single k = Single.getInstance();
        k.haha();

        //Fabric
        ApplePayFactory fck = new ApplePayFactory();
        ApplePay fckfck = fck.createService();
        fckfck.paymentProcess(45);

        //AbstractFabric
        var HUF = new HumanUnitFactory();
        var OUF = new OrksUnitFactory();
        HumanSoldierUnit HSU = HUF.createSoldierUnit();
        OrksBuilderUnit OBU = OUF.createBuilderUnit();
        HSU.attack();
        OBU.build();
    }
}