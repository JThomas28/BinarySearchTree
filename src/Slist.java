/**
 * ADT for a list class.
 * @author JonathanThomas
 * @version 2/21/2016
 */
public interface Slist {
    
    /**
     * Clears list
     */
    public void clear();
    
    /**
     * Adds item after current
     * @param item is item to be added
     */
    public void addAfter(Object item);
    
    /**
     * Adds item before current
     * @param item is item to be added
     */
    public void addBefore(Object item);
    
    /**
     * Removes current item
     */
    public void remove();
    
    /**
     * Sets current to previous node.
     * @return true if change was made, false otherwise
     */
    public boolean prev();
    
    /**
     * Sets current to next node.
     * @return true if change was made, false otherwise.
     */
    public boolean next();
    /**
     * Returns number of objects in the list
     * @return listSize whish is size of list
     */
    public int length();
    
    /**
     * Returns object that curr points to.
     * @return currentElement which is object that curr is pointing to
     * @throws IllegalStateException if list is empty
     */
    public Object getValue() throws IllegalStateException;
}
