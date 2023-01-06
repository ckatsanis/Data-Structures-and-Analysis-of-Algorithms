package ArrayStack.ArrayStack;

import java.util.ArrayList;

public class ArrayStack implements StackInterface {

    private static final int CAPACITY = 100;
    private int Capacity;
    private Object S[];
    private int top = -1;

    public ArrayStack() {
        this(CAPACITY);
    }

    public ArrayStack(int cap) {
        Capacity = cap;
        S = new Object[Capacity];
    }

    public int size() {
        return (top+1);
    }

    public boolean isEmpty() {
        return ( top < 0 );
    }

    public boolean isFull() {
        return (top == Capacity);
    }

    public void push(Object item) throws StackFullException {
        if (size() == Capacity)
            throw new StackFullException("Stack Overflow");
        S[++top] = item;
    }

    public Object top() throws StackEmptyException {
        if (isEmpty())
            throw new StackEmptyException("Stack is Empty!");
        return S[top];
    }

    @Override
    public Object pop() throws StackEmptyException {
        Object element;

        if (isEmpty())
            throw new StackEmptyException("Stack is Empty!");

        element = S[top];
        S[top--] = null;

        return element;
    }
}
