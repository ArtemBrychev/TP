package lab4.strategy;

import java.util.*;

public class BFS implements SearchStrategy{
    public void search(Graph graph, int beginPoint){
        Queue<Integer> queue = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        queue.add(beginPoint);

        while (!queue.isEmpty()) {
            Integer index = queue.poll(); // Извлекаем первый элемент из очереди
            if (!visited.contains(index)) {
                System.out.println("Queue Visited index: " + index);
                for (var x : graph.data.getOrDefault(index, new ArrayList<>())) {
                    queue.add(x); // Добавляем соседние узлы в очередь
                }
                visited.add(index); // Отмечаем узел как посещённый
            }
        }
    }
}
