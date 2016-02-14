public class Lslist implements Slist {
    private Node<Object> head; // Pointer to list header
    private Node<Object> tail; // Pointer to last element
    private Node<Object> curr; // Pointer to current element
    private int listSize; // Size of list


    public void clear() {
        curr = tail; // Create trailer
        tail = new Node<Object>(null);
        head = tail; // Create header
        listSize = 0;
    }

    public void addAfter(Object item) {
        Node <Object> holder = new Node<Object>(item);
        curr.next.next = holder.next;
        curr.next=holder;
    }

    public void addBefore(Object item) {

    }

    public void remove() {

    }

    public boolean prev() {
        return false;

    }

    public boolean next() {
        return false;

    }

    public int length() {
        return 0;

    }

    public Object getValue() throws IllegalStateException {
        return null;

    }
}
