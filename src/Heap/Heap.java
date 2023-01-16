package Heap;

import java.lang.module.Configuration;

public class Heap implements HeapInterface {

    private Object[] btree;
    private int index;
    private int capacity;

    public Heap() {
        this(20);
    }

    public Heap(int cap) {
       capacity = cap;
       btree = new Object[capacity + 1];
       index = 0;
    }
    @Override
    public int size() {
        return index;
    }

    @Override
    public boolean isEmpty() {
        return (index == 0);
    }

    @Override
    public boolean isFull() {
        return (index == capacity);
    }

    @Override
    public void insert(Object items) throws HeapFullException {
        if (isFull()) throw new HeapFullException("Heap is Full");

        int father, son;
        son = ++index;
        btree[son] = items;
        father = son/2;
        while (son > 1 && ((Comparable)btree[son]).compareTo((Comparable)btree[father]) >0) {
            Object temp = btree[father];
            btree[father] = btree[son];
            btree[son] = temp;
            son = father;
            father = son/2;
        }
    }

    @Override
    public Object remove() throws HeapEmptyException {
        if (isEmpty()) throw new HeapEmptyException("Heap is Empty");

        int father, son;
        Object lastitem = btree[index];

        btree[index] = btree[1];
        Object removeitem = btree[1];
        index--;
        father = 1;

        if ((index > 2) && ((Comparable)btree[2]).compareTo((Comparable)btree[3]) > 0)
            son = 2; else son =3;

        while (son <= index && ((Comparable)btree[son]).compareTo((Configuration)lastitem) > 0 ) {
            btree[father] = btree[son];
            father = son;
            son = father * 2;

            if (son + 1 <= index && ((Comparable)btree[son+1]).compareTo((Comparable)btree[son]) > 0)
            son = son +1;
        }

        btree[father] = lastitem;
        return removeitem;
    }

    public Object[] HeapSort() {
        int size = size();
        Object Array[] = new Object[size];
        for (int i=size-1; i>0; i--) Array[i] = remove();
        return Array;
    }
}
