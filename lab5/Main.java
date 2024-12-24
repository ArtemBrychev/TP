import java.util.List;
import lab4.strategy.*;
import lab4.chain.*;
import lab5.Adapter.OldPaymentSystem;
import lab5.Proxy.*;
import lab5.Adapter.*;
import lab5.Bridge.*;
import patterns.Single;
import patterns.Fabric.*;
import patterns.AbstractFabric.*;
import lab4.iterator.*;


public class
Main{
    public static void main(String[] args){
        //testPatternsLab1();
        System.out.println("--------Lab2------------");
        //testPatternsLab2();
        testPatternsLab3();
    }

    public static void testPatternsLab1(){

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

    public static void testPatternsLab2(){
        //strategy
        Graph graph = new Graph();
        graph.setTestGraph();
        Searcher searcher = new Searcher();
        searcher.setStrategy(new DFS());
        searcher.Search(graph, 1);
        System.out.println();
        searcher.setStrategy(new BFS());
        searcher.Search(graph, 1);

        //chain
        FirstLevelHandler FLH = new FirstLevelHandler();
        SecondLevelHandler SLH = new SecondLevelHandler();
        FLH.setNextHandler(SLH);

        Request req = new Request(1);
        Request req2 = new Request(2);

        FLH.handleRequest(req);
        FLH.handleRequest(req2);

        SLH.handleRequest(req2);

        //iterator
        List<String> elements = List.of("X", "Y", "Z"); // Непеременный список
        ListIterator<String> iterator = new ListIterator<String>(elements);

        while (iterator.hasNext()) {
            System.out.println("Item: " + iterator.next());
        }
    }

    public static void testPatternsLab3(){
        //Proxy
        System.out.println("Client: Executing with a real subject:");
        Subject realSubject = new RealSubject();
        realSubject.request();

        System.out.println("\nClient: Executing with a proxy:");
        Subject proxy = new Proxy(true);
        proxy.request();

        Subject proxy2 = new Proxy(false);
        proxy2.request();


        //Adapter
        OldPaymentSystem oldSystem = new OldPaymentSystem();
        PaySys paySys = new PaymentAdapter(oldSystem);

        paySys.pending(678);

        //Bridge
        // Каналы связи
        CommunicationChannel emailChannel = new EmailChannel();
        CommunicationChannel smsChannel = new SmsChannel();

        // Текстовые уведомления через разные каналы
        Notification textEmailNotification = new TextNotification(emailChannel);
        Notification textSmsNotification = new TextNotification(smsChannel);

        textEmailNotification.notifyUser("Hello via Email!");
        textSmsNotification.notifyUser("Hello via SMS!");

        // Критические уведомления через разные каналы
        Notification criticalEmailNotification = new CriticalNotification(emailChannel);
        Notification criticalSmsNotification = new CriticalNotification(smsChannel);

        criticalEmailNotification.notifyUser("Server is down!");
        criticalSmsNotification.notifyUser("Payment failed!");
    }
}




////////Тут просто реализация
interface CommunicationChannel {
    void sendMessage(String message);
}

class EmailChannel implements CommunicationChannel {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}

class SmsChannel implements CommunicationChannel {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

abstract class Notification {
    protected CommunicationChannel channel;

    public Notification(CommunicationChannel channel) {
        this.channel = channel;
    }

    public abstract void notifyUser(String content);
}

class TextNotification extends Notification {
    public TextNotification(CommunicationChannel channel) {
        super(channel);
    }

    @Override
    public void notifyUser(String content) {
        channel.sendMessage("Text Notification: " + content);
    }
}

class CriticalNotification extends Notification {
    public CriticalNotification(CommunicationChannel channel) {
        super(channel);
    }

    @Override
    public void notifyUser(String content) {
        channel.sendMessage("CRITICAL ALERT: " + content);
    }
}
