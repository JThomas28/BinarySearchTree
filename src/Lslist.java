import java.util.LinkedList;

public class Lslist implements Slist {
    private LinkedList <Object> list;
    
    private Object currentElement;
    private Node<Object> head; // Pointer to list header
    private Node<Object> tail; // Pointer to last element
    private Node<Object> curr; // Pointer to current element
    private int listSize; // Size of list

    public Lslist(){
        
    }
    //list: <a,b,C,d>
    public void clear() {
        list.clear();
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
