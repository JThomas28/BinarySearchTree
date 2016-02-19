/**
 * Creates nodes for linked lists.
 * @author JonathanThomas
 * @version 2/21/2016
 * @param <T> is type of node
 */
public final class Node<T> {
    public final T       value;
    public       Node<T> next;
    
    /**
     * Creates Node that holds value passed in
     * @param _value is value of the node
     */
    public Node(T _value) {
        this( _value, null );
    }
    /**
     * Creates a node of specific type with specific value
     * @param _value
     * @param _next is type 
     */
//    public Node(T _value, Node<T> _next) {
//        value = _value;
//        next  = _next;
//    }
}
