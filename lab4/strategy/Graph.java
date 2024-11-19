package lab4.strategy;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class Graph {
    HashMap<Integer, ArrayList<Integer>> data;
    public Graph(){
        data = new HashMap<>();
    }
    public void add(Integer nodeId, ArrayList<Integer> connections){
        data.put(nodeId, connections);
    }

    public void setTestGraph(){
        this.add(1, new ArrayList<>(List.of(2, 8)));
        this.add(2, new ArrayList<>(List.of(1, 8, 3)));
        this.add(3, new ArrayList<>(List.of(2, 8, 4)));
        this.add(4, new ArrayList<>(List.of(3, 7, 9)));
        this.add(5, new ArrayList<>(List.of(7, 6)));
        this.add(6, new ArrayList<>(List.of(5)));
        this.add(7, new ArrayList<>(List.of(5, 8, 4)));
        this.add(8, new ArrayList<>(List.of(2, 3, 7, 1)));
        this.add(9, new ArrayList<>(List.of(4)));
    }
}
