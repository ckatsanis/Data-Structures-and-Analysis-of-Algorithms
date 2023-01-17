package List;
import AbstractTypesArrays.Student;

public class DoubleLinkedList implements ListInterface {

    private DoubleNode first;
    private DoubleNode last;

    public DoubleLinkedList() {
        first = last = null;
    }
    @Override
    public boolean isEmpty() {
        return first == null;
    }

    public DoubleNode getFirst() {
        return first;
    }

    public DoubleNode getLast() {
        return last;
    }

    @Override
    public int size() {
        int size = 0;

        DoubleNode position = first;

        while (position !=null) {
            position = position.getNext();
            size++;
        }

        return size;
    }

    @Override
    public void insertFirst(Object data) {
        if (isEmpty())
            first = last = new DoubleNode(data, null, null);
        else {
            DoubleNode B = new DoubleNode(data, first, null);
            first.setPrev(B);
            first = B;
        }
    }

    @Override
    public void insertLast(Object data) {
        if (isEmpty())
            first = last = new DoubleNode(data, null, null);
        else {
            DoubleNode temp = new DoubleNode(data, null, last);
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
        else {
            DoubleNode B = first.getNext();
            first.setNext(null);
            B.setPrev(null);
            first = B;
        }

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
            DoubleNode B = last.getPrev();
            last.setPrev(null);
            B.setNext(null);
            last = B;
        }

        return removeItem;
    }

    public void printList() throws ListEmptyException {
        if (isEmpty())
            throw new ListEmptyException("List is Empty");

        for (DoubleNode position = first; position != null; position = position.getNext())
            System.out.println(position.getItem());
    }

    public Object maxOfList() {
        if (isEmpty())
            throw new ListEmptyException("List is empty!");

        Object max = first.getItem();
        DoubleNode position = first.getNext();

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

        DoubleNode position = first;

        while (position !=null) {
            if (position.getItem().equals(data))
                return true;
            position = position.getNext();
        }

        return false;
    }

    public DoubleLinkedList Sort() {
        DoubleNode current, min, trace;

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

    public DoubleLinkedList BubbleSort() {
        DoubleNode current = getFirst();

        while (current != null) {
            DoubleNode second = current.getNext();

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
        DoubleNode position = first.getNext();

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
