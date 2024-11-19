package lab4.strategy;

public class Searcher {
    private SearchStrategy strategy;

    public void setStrategy(SearchStrategy strat){strategy = strat;}

    public void Search(Graph graph, int index){
        strategy.search(graph, index);
    }
}
