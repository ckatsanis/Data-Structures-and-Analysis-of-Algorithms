package QueueStack.QueueStack;

public class QueueStackCycle implements QueueStackInterface{
    private static final int CAPACITY = 100;
    private int Capacity;
    private Object S[];
    private int first = -1;
    private int last = -1;

    public QueueStackCycle() {
        this(CAPACITY);
    }

    public QueueStackCycle(int cap) {
        Capacity = cap;
        S = new Object[Capacity];
    }

    @Override
    public int size() {
        return (last-first);
    }

    @Override
    public boolean isEmpty() {
        return (last==-1);
    }

    @Override
    public boolean isFull() {
        return first==(last+1)%Capacity;
    }

    @Override
    public Object front() throws QueueStackEmptyException {
        if (isEmpty())
            throw new QueueStackEmptyException("Queue is Empty");
        return S[first];
    }

    @Override
    public void enqueue(Object item) throws QueueStackFullException {
        if (isFull())
            throw new QueueStackEmptyException("Queue Overflow");

        if (isFull()) {
            first = 0;
            last = 0;
        } else
            last = (last+1)%Capacity;

        S[last++] = item;
    }

    @Override
    public Object dequeue() throws QueueStackEmptyException {
        Object item;

        if ( isEmpty())
            throw new QueueStackEmptyException("Queue is Empty");

        if (first == last) {
            first = -1;
            last = -1;
        } else
            first = (first+1)%Capacity;

        item = S[first];
        S[first++] = null;

        return item;
    }
}
