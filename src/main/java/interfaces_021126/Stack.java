package interfaces_021126;

import java.util.Iterator;

public final class Stack implements Iterable<Integer>{
    private Node top;
    private int size = 0;

    boolean isEmpty() {
        return top == null;
    }

    void push(int val) {
        top = new Node(val, top);
        size++;
    }

    int pop() {
        if (top == null) {
            throw new IllegalStateException("stack is empty");
        }
        Node current = top;
        top = top.getNext();
        size--;
        return current.getValue();
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "top=" + top +
                '}';
    }


    @Override
    public Iterator<Integer> iterator() {
        return new StackIterator(top);
    }
}
