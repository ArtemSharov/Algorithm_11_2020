package HW_4;

import java.util.EmptyStackException;

public class NewStack<T> {
    private MyLinkedList<T> stack = new MyLinkedList<>();
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.getFirst();
    }

    public T pop() {
        return stack.removeLast();
    }

    public void push(T item) {
        stack.insertFirst(item);
    }

    public int size() {
        return stack.size();
    }

    public final boolean isEmpty() {
        return stack.isEmpty();
    }


}
