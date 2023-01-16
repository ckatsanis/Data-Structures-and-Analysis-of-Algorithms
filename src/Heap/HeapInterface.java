package Heap;

public interface HeapInterface {

    public int size();
    public boolean isEmpty();
    public boolean isFull();
    public void insert(Object items) throws HeapFullException;
    public Object remove() throws HeapEmptyException;

}
