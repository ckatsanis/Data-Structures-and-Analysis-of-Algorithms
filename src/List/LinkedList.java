package List;

import java.util.List;

public class LinkedList implements ListInterface {

    private Node first;
    private Node last;

    public LinkedList() {
        first = last = null;
    }
    @Override
    public boolean isEmpty() {
        return first == null;
    }

    public Object getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    @Override
    public int size() {
        int size = 0;

        Node position = first;

        while (position !=null) {
            position = position.getNext();
            size++;
        }

        return size;
    }

    @Override
    public void insertFirst(Object data) {
        if (isEmpty())
            first = last = new Node(data, null);
        else
            first = new Node(data, first);
    }

    @Override
    public void insertLast(Object data) {
        if (isEmpty())
            first = last = new Node(data, null);
        else {
            Node temp = new Node(data, null);
            last.setNext(temp);
            last = temp;
        }
    }

    @Override
    public Object removeFirst() throws ListEmptyException {
        if (isEmpty())
            throw new ListEmptyException("list is Empty!");

        Object removedItem = first.getItem();
        if (first == last)
            first = last = null;
        else
            first = first.getNext();

        return removedItem;
    }

    @Override
    public Object removeLast() throws ListEmptyException {
        if (isEmpty())
            throw new ListEmptyException("List is Empty!");

        Object removeItem = last.getItem();

        if (first == last)
            first = last = null;
        else {
            Node position;
            for ( position = first; position.getNext() != last; position = position.getNext()) {};

            last = position;
            position.setNext(null);
        }

        return removeItem;
    }

    public void printList() throws ListEmptyException {
        if (isEmpty())
            throw new ListEmptyException("List is Empty");

        for (Node position = first; position != null; position.getNext())
            System.out.println(position.getItem());
    }

    public Object maxOfList() {
        if (isEmpty())
            throw new ListEmptyException("List is empty!");

        Object max = first.getItem();
        Node position = first.getNext();

        while (position != null) {
            Comparable CoMax = (Comparable) max;
            Comparable CoItem = (Comparable) position.getItem();
            if ((CoMax.compareTo(CoItem)<0))
                max = position.getItem();

            position = position.getNext();
        }

        return max;
    }
}
