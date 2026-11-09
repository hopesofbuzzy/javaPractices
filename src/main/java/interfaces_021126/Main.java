package interfaces_021126;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static void main() {
        List<Request> reqs = new ArrayList<>();
        reqs.add(new UserRequest(5, 1));
        reqs.add(new UserRequest(6, 2));
        Collections.sort(reqs);
        System.out.println(reqs);
        // System.out.println(reqs.get(0) > reqs.get(1)); не работает!

        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        for (int i : stack) {
            System.out.println(i);
        }

        System.out.println(5.0 / 0);
        System.out.println(Double.NEGATIVE_INFINITY < 5);
    }
}
