/**
 * Creates nodes for linked lists.
 * 
 * @author JonathanThomas
 * @version 2/21/2016
 * @param <T>
 *            is type of node
 */
public final class Node<T> {
    /**
     * Field for node value
     */
    public final T value;
    
    /**
     * field for node pointer
     */
    public Node<T> next;

    /**
     * Creates Node that holds value passed in and null pointer
     * 
     * @param nodeVal
     *            is value of the node
     */
    public Node(T nodeVal) {
        this(nodeVal, null);
    }

    /**
     * Creates a node with specific value and pointer
     * 
     * @param nodeVal
     *            is value of node
     * @param nextVal
     *            is pointer
     */
    public Node(T nodeVal, Node<T> nextVal) {
        value = nodeVal;
        next = nextVal;
    }
}
