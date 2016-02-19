/**
 * Creates nodes for linked lists.
 * @author JonathanThomas
 * @version 2/21/2016
 * @param <Object> is type of node
 */
public final class Node<Object> {
    public final Object       value;
    public       Node<Object> next;
    
    /**
     * Creates Node that holds value passed in and null pointer
     * @param _value is value of the node
     */
    public Node(Object _value) {
        this( _value, null );
    }
    /**
     * Creates a node with specific value and pointer
     * @param _value is value of node
     * @param _next is pointer
     */
    public Node(Object _value, Node<Object> _next) {
        value = _value;
        next  = _next;
    }
}
