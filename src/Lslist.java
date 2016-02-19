/**
 * This class implements methods of Slist class. Implementation class of Slist
 * ADT.
 * 
 * @author JonathanThomas
 * @version 2/21/2016
 */

public class Lslist implements Slist {

    /**
     * variables
     */
    private Object currentElement;

    private Node<Object> head; // Pointer to list header
    private Node<Object> tail; // Pointer to last element
    private Node<Object> curr; // Pointer to current element
    private int listSize; // Size of list

    /**
     * Constructor. Initializes a head and tail of null.
     */
    public Lslist() {
        clear();
    }

    /**
     * Helper method. Sets curr to element before it
     */
    public void getPreviousNode() {
        Node<Object> prev = head;
        while (prev.next != curr) {
            prev = prev.next;
        }
        curr = prev;
    }

    /**
     * Empties list. Sets a head and tail node, both equal to null.
     */
    public void clear() {
        curr = tail = new Node<Object>(null); // Create trailer
        head = new Node<Object>(tail); // Create header
        listSize = 0;
    }

    /**
     * Adds the item to the position in the list after the current element.
     * 
     * @param item
     *            -is item to be added to list.
     */
    public void addAfter(Object item) {
        Node<Object> holder = new Node<Object>(item);

        // if list is empty, put node with item in it in position
        // between head and tail nodes
        if (tail == curr) {
            head.next = holder;
            holder.next = tail;
            curr = holder;

            listSize++;
        }

        else {
            holder.next = curr.next;
            curr.next = holder;
            curr = holder;
            listSize++;
        }
    }

    /**
     * Adds item to list at position right before current node.
     * 
     * @param item
     *            -is item to be added
     */
    public void addBefore(Object item) {
        if (curr == tail) {
            // empty list
            addAfter(item);
        }
        else {
            // get previous node
            getPreviousNode();

            // add item between previous node and former current node
            addAfter(item);
        }

    }

    /**
     * Removes current element from list
     */
    public void remove() {

        getPreviousNode();
        Node<Object> prev = curr;
        prev.next = prev.next.next;

        if (curr.next == tail) {
            // set previous element to curr
            curr = prev;
        }
        else {
            curr = curr.next;
        }

    }

    /**
     * Sets current element to previous element in list.
     * 
     * @return false if there is no item before current item, true otherwise
     */
    public boolean prev() {
        if (curr == head.next || curr == tail) {
            return false;
        }
        else {
            getPreviousNode();
            return true;
        }
    }

    /**
     * Sets current item to next item in list
     * @return false if no item after current, true otherwise.
     */
    public boolean next() {
        if (curr.next == tail) {
            return false;
        }
        else {
            curr = curr.next;
            return true;
        }
    }

    /**
     * Returns list size, which is number of items in list
     * @return listSize is size of list
     */
    public int length() {
        return listSize;

    }

    public Object getValue() throws IllegalStateException {
        if (listSize == 0) {
            throw new IllegalStateException();
        }
        else {
            currentElement = curr.value;
            return currentElement;
        }
    }
}
