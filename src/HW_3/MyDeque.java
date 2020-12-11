package HW_3;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyDeque<T> {
    private T[] list;
    private int front;
    private int back;
    private final int DEFAULT_CAPACITY = 10;
    private int begin;
    private int end;

    public MyDeque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public MyDeque() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public T peekFront() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list[front];
    }

    public T peekBack(){
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list[list.length - back];
    }


    public T removeLeft() {
        T temp = peekFront();
        front--;
        list[end] = null;
        end = nextIndex(end);
        return temp;
    }

    public T removeRight() {
        T temp = peekBack();
        back--;
        list[list.length - back] = null;
        begin = nextIndex(back);
        return temp;
    }

    public void insertLeft(T item) {
        if (isFull()) {
            throw new IllegalStateException();
        }
        front++;
        list[end] = item;
        end = nextIndex(end);
    }

    public void insertRight(T item) {
        if (isFull()) {
            throw new IllegalStateException();
        }
        back++;
        list[list.length - back] = item;
        begin = nextIndex(back);
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    public int size() {
        return (front + back);
    }

    public boolean isEmpty() {
        return (back + front) == 0;
    }

    public boolean isFull() {
        return (back + front) == list.length;
    }
    @Override
    public String toString() {
        return Arrays.toString(list) + " begin: " + begin + " end: " + end;
    }

}
