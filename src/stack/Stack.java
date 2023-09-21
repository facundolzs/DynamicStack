package stack;

public class Stack {

    private Node top;
    private int size;

    private class Node {

        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    /**
     * Check if the stack is empty or not
     *
     * @return true if no items added
     */
    public boolean isEmpty() {
        return top == null;
    }

    /**
     * Returns current items number on the stack (It's a primitive operation? idk)
     *
     * @return number of items
     */
    public int getSize() {
        return size;
    }

    /**
     * Adds a new item to the top of the stack
     *
     * @param value (new value to add)
     * @return added item
     */
    public int push(int value) {

        Node newNode = new Node(value);

        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }

        size++;
        return newNode.data;
    }

    /**
     * Removes the top item of the stack
     *
     * @return removed item
     */
    public int pop() {

        if (!isEmpty()) {
            int removed = top.data;
            top = top.next;
            size--;

            return removed;
        }

        return -1;
    }

    /**
     * Returns the top item of the stack without removing it
     *
     * @return top item
     */
    public int peek() {

        if (!isEmpty()) {
            return top.data;
        }

        return -1;
    }

}
