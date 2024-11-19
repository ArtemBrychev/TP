import java.util.List;
import lab4.strategy.*;
import lab4.chain.*;
import patterns.Single;
import patterns.Fabric.*;
import patterns.AbstractFabric.*;
import lab4.iterator.*;

public class
Main{
    public static void main(String[] args){
        testPatternsLab1();
        System.out.println("--------Lab2------------");
        testPatternsLab2();
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

}