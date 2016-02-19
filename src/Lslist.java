import java.util.LinkedList;

public class Lslist implements Slist {

    private Object currentElement;

    private Node<Object> head; // Pointer to list header
    private Node<Object> tail; // Pointer to last element
    private Node<Object> curr; // Pointer to current element
    private int listSize; // Size of list

    public Lslist() {
        clear();
    }

    // list: <a,b,C,d>
    public void clear() {
        curr = tail = new Node<Object>(null); // Create trailer
        head = new Node<Object>(tail); // Create header
        listSize = 0;
    }

    public void addAfter(Object item) {
        Node<Object> holder = new Node<Object>(item);
        if (tail == curr) {
            head.next = holder;
            holder.next = tail;
            curr = holder;
            
            listSize++;
        }
        
        else{
            holder.next = curr.next;
            curr.next = holder;
            curr = holder;
            listSize++;
        }
        
    }

    public void addBefore(Object item) {
        //get previous node
        Node<Object> prev = head;
        while (prev.next != curr) {
            prev = prev.next;
        }
        curr = prev;
        
    }
    
    
    public void remove() {
        Node<Object> prev = head;
        while (prev.next != curr) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
        
        if(curr.next == tail){
            //set previous element to curr
            curr = prev;
        }
        else{
            curr = curr.next;
        }
        
    }

    public boolean prev() {
        if (curr == head.next || curr == tail) {
            return false;
        }
        else {
            Node<Object> prev = head;
            while (prev.next != curr) {
                prev = prev.next;
            }
            curr = prev;
            return true;
        }
    }

    public boolean next() {
        if(curr.next == tail){
            return false;
        }
        else{
            curr = curr.next;
            return true;
        }
    }

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
