package practice5.Task3_4;

import java.util.Iterator;
import java.util.Optional;

public class LinkedList implements Iterable<Integer> {
    Node start = null;

    void push(int val) {
        if (start == null) {
            start = new Node(null, val);
        } else {
            Node current = start;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new Node(null, val));
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new LinkedListIterator(start);
    }
}
