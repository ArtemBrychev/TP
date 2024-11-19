package lab4.iterator;

import java.util.List;

public class ListIterator<T> implements iterator{
    private List<T> items;
    private int position;

    public ListIterator(List<T> items) {
        this.items = items;
        this.position = 0;
    }

    public boolean hasNext() {
        return position < items.size();
    }

    public T next() {
        if (this.hasNext()) {
            return items.get(position++);
        }
        throw new IndexOutOfBoundsException("No more elements.");
    }
}
