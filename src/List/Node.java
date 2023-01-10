package List;

public class Node {

    private  Object item;
    private Node next;

    public Node() {
        this(null, null);
    }

    public Node(Object it, Node n) {
        item = it;
        next = n;
    }

    public void setItem(Object newItem) {
        item = newItem;
    }

    public void setNext(Node newNext) {
        next = newNext;
    }

    public Object getItem() {
        return item;
    }

    public Node getNext() {
        return next;
    }

    public String toString() {
        return item.toString();
    }

}
