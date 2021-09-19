public class MyQueue<T> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private int begin;
    private int end;

    public MyQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity: " + capacity);
        }
        list = (T[]) new Object[capacity];

    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    public MyQueue() {
        list = (T[]) new Object[DEFAULT_CAPACITY];

    }

    public T peekFront() {
        if (isEmpty()) {
            throw new RuntimeException("Queue isEmty");
        }


        return list[begin];
    }


    public void insert(T item) {
        if (isFull()) {
            throw new RuntimeException("Queue isFull");
        }
        size++;
        list[end] = item;
        end = nextIndex(end);
    }

    public T remove() {
        T temp = peekFront();
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return temp;
    }


    public int Size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;

    }
}
