package practice5.Task3_4;

import java.util.Iterator;
import java.util.Optional;

public class LinkedListIterator implements Iterator<Integer> {
    Node current;

    public LinkedListIterator(Node current) {
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
