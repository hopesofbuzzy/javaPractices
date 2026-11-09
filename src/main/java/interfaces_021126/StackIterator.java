package interfaces_021126;

import java.util.Iterator;

public class StackIterator implements Iterator<Integer> {
    private Node current;

    public StackIterator(Node current) {
        this.current = current;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public Integer next() {
        int value = current.getValue();
        current = current.getNext();

        return value;
    }
}
