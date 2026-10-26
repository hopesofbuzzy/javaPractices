package Stack;

public final class Stack {
    private Node top;

    boolean isEmpty() {
        return top == null;
    }

    void push(int val) {
        top = new Node(val, top);
    }

    int pop() {
        if (top == null) {
            throw new IllegalStateException("stack is empty");
        }
        Node current = top;
        top = top.getNext();
        return current.getValue();
    }

    @Override
    public String toString() {
        return "Stack{" +
                "top=" + top +
                '}';
    }
}
