package Bracket;

import java.util.ArrayList;

public class Stack<T> implements StackIntf<T> {

    /**
     * Pushes an object onto the top of the Stack.
     * T alles kan in het object gestoken worden.
     * @param o the object to be pushed on the Stack
     *
     */

    ArrayList<T> stackAA = new ArrayList<>();


    public void push(T o)
    {
        stackAA.add(o);
    }

    /**
     * Removes the top element at the top of the Stack while returning it
     *
     * @return the element that was found on top of the stack or null if the stack was empty
     */
    public T pop()
    {
        if (isEmpty())
        {
            return null;
        }
        T wanted = stackAA.get(stackAA.size()-1);
        stackAA.remove(wanted);
        return wanted;
    }

    /**
     * Gets the top element from the stack, without removing it
     *
     * @return the element that was found on the top of the stack or null if the stack was empty
     */
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return stackAA.get(stackAA.size() - 1);
    }
    /**
     * Checks if the Stack is empty
     *
     * @return true if the Stack is empty
     */
    public boolean isEmpty()
    {
        if(stackAA.size() == 0)
        {
            return true;
        }
        return false;
    }

    /**
     * Clears the content of the Stack
     */
    public void clear(){
        stackAA.removeAll(stackAA);
    }
}
