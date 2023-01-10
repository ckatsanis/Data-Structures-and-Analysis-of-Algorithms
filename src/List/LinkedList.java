package List;
import AbstractTypesArrays.Student;

import javax.management.ObjectName;
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

    public Node getFirst() {
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

        for (Node position = first; position != null; position = position.getNext())
            System.out.println(position.getItem());
    }

    public Object maxOfList() {
        if (isEmpty())
            throw new ListEmptyException("List is empty!");

        Object max = first.getItem();
        Node position = first.getNext();

        while (position != null) {
            if ((((String)max).compareTo(((String)(position.getItem())))<0))
                max = position.getItem();

            position = position.getNext();
        }

        return max;
    }

    public boolean ifExists(Object data) {
        if (isEmpty())
            throw new ListEmptyException("List empty");

        Node position = first;

        while (position !=null) {
            if (position.getItem().equals(data))
                return true;
            position = position.getNext();
        }

        return false;
    }

    public LinkedList Sort() {
        Node current, min, trace;

        trace = getFirst();

        while (trace != null) {
            current = trace;
            min = trace;

            while (current != null) {
                if (((String)(current.getItem())).compareTo(((String)(min.getItem())))<0)
                    min = current;
                current = current.getNext();
            }
            String tmp = (String)trace.getItem();
            trace.setItem(min.getItem());
            min.setItem(tmp);
            trace = trace.getNext();
        }
        return this;
    }

    public LinkedList BubbleSort() {
        Node current = getFirst();

        while (current != null) {
            Node second = current.getNext();

            while (second != null) {
                if (((String)(current.getItem())).compareTo(((String)(second.getItem())))<0) {
                    String tmp = (String) current.getItem();
                    current.setItem(second.getItem());
                    second.setItem(tmp);
                }
                second = second.getNext();
            }
          current.getNext();
        }
        return this;
    }

    public Object[] MinMaxOfList() {
        Object[] MinMax = new Student[2];

        if (isEmpty())
            throw new ListEmptyException("List is Empty");

        Object min = first.getItem();
        Node position = first.getNext();

        while (position != null) {
            if (((Student)min).getGrade()>((Student)(position.getItem())).getGrade())
                min = position.getItem();
            position = position.getNext();
        }

        MinMax[0] = min;
        Object max = first.getItem();
        position = first.getNext();
        while (position != null) {
            if (((Student)min).getGrade()<((Student)(position.getItem())).getGrade())
                max = position.getItem();
            position = position.getNext();
        }
        MinMax[1] = max;

        return MinMax;
    }
}
