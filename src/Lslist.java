import java.util.LinkedList;

public class Lslist implements Slist {

    private Object currentElement;

    private Node<Object> head; // Pointer to list header
    private Node<Object> tail; // Pointer to last element
    private Node<Object> curr; // Pointer to current element
    private int listSize; // Size of list

    public Lslist() {
        clear();
        listSize = 0;
    }
    
    // list: <a,b,C,d>
    public void clear() {
        curr = tail = new Node<Object>(null); // Create trailer
        head = new Node<Object>(tail); // Create header
        listSize = 0;
    }

    public void addAfter(Object item) {
        
        Node<Object> holder = new Node<Object>(item);
        holder.next = curr.next.next;
        curr.next = holder;
        listSize++;
    }

    public void addBefore(Object item) {

    }

    public void remove() {

    }

    public boolean prev() {
        if (curr == head) {
            return false;
        }
        else {
            Node<Object> temp = head;
            while (temp.next != curr) {
                temp = temp.next;
            }
            curr = temp;
            return true;
        }
    }

    public boolean next() {
        return false;

    }

    public int length() {
        return 0;

    }

    public Object getValue() throws IllegalStateException {
//        if (Lslist.isEmpty()) {
//            throw new IllegalStateException();
//        }
//        else {
//            return currentElement;
//        }
    }
    public static void main(String [] args){
        Lslist list = new Lslist();
        Object A = new Object();
        Object B = new Object();
        list.addAfter(A);
        list.addAfter(B);
        System.out.println(list);
    }
}
