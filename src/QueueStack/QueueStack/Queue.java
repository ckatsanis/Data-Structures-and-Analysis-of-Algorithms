package QueueStack.QueueStack;

public class Queue implements QueueStackInterface {

    private static final int CAPACITY = 100;
    private int Capacity;
    private Object S[];
    private int first = 0;
    private int last = 0;

    public Queue() {
        this(CAPACITY);
    }

    public Queue(int cap) {
        Capacity = cap;
        S = new Object[Capacity];
    }

    @Override
    public int size() {
        return (last-first);
    }

    @Override
    public boolean isEmpty() {
        return (first == last);
    }

    @Override
    public boolean isFull() {
        return (last == Capacity);
    }

    @Override
    public Object front() throws QueueStackEmptyException {
        if (isEmpty())
            throw new QueueStackEmptyException("Queue is Empty");
        return S[first];
    }

    @Override
    public void enqueue(Object item) throws QueueStackFullException {
        if (size() == Capacity)
            throw new QueueStackEmptyException("Queue Overflow");

        if (last == Capacity)
            getHelp();

        S[last++] = item;
    }

    @Override
    public Object dequeue() throws QueueStackEmptyException {
        Object item;

        if ( isEmpty())
            throw new QueueStackEmptyException("Queue is Empty");

        item = S[first];
        S[first++] = null;

        return item;
    }

    public void getHelp() {
        for (int i = 0; i < size(); i++) {
            S[i] = S[first+i];
        }
        last= size();
        first= 0;
    }
}
