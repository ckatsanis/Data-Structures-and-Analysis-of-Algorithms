package QueueStack.QueueStack;

public interface QueueStackInterface {
    public int size( );
    // Returns the size of the queue
    public boolean isEmpty( );
    // Returns true if the queue is empty
    public boolean isFull();
    // Returns true if the queue is full
    public Object front( ) throws QueueStackEmptyException;
    // Returns the first element of the queue
    public void enqueue(Object item) throws QueueStackFullException;
    // Adds an element at the end of the queue
    public Object dequeue( ) throws QueueStackEmptyException;
    // Removes and returns the first element of the queue
}