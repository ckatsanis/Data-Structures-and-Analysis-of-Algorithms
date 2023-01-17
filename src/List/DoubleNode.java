package List;

public class DoubleNode {

    private  Object item;
    private DoubleNode next, prev;

    public DoubleNode() {
        this(null, null, null);
    }

    public DoubleNode(Object it, DoubleNode n, DoubleNode p) {
        item = it;
        next = n;
        prev = p;
    }

    public void setItem(Object newItem) {
        item = newItem;
    }

    public void setNext(DoubleNode newNext) {
        next = newNext;
    }

    public void setPrev(DoubleNode newPrev) {
        prev = newPrev;
    }

    public Object getItem() {
        return item;
    }

    public DoubleNode getNext() {
        return next;
    }

    public DoubleNode getPrev() {
        return prev;
    }

    public String toString() {
        return item.toString();
    }

}
