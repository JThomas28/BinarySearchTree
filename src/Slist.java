
public interface Slist {
    public void clear();
    
    public void addAfter(Object item);
    
    public void addBefore(Object item);
    
    public void remove();
    
    public boolean prev();
    
    public boolean next();
    
    public int length();
    
    public Object getValue() throws IllegalStateException;
}
