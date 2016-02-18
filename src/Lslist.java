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
        
    }
    
    //Remove current item from list
    //object after curr becomes new curr
    //if no element after, object before becomes curr
    public void remove() {
        if(curr.next == null){
            //set previous element to curr
        }
        else{
            curr.next = curr.next.next;
            curr = curr.next;
        }
        
    }

    public boolean prev() {
        if (curr == head.next || curr == tail) {
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
        if(curr.next == tail){
            return false;
        }
        else{
            curr.next = curr;
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

//    public static void main(String[] args) {
//        Lslist list = new Lslist();
//        Object A = new Object();
//        Object B = new Object();
//        list.addAfter(A);
//        list.addAfter(B);
        //System.out.println(list);
//    }
}
