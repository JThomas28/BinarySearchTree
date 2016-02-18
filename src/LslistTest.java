import static org.junit.Assert.*;

import org.junit.Test;


public class LslistTest {
    Object A = new Object();
    Object B = new Object();
    Object C = new Object();
    Object D = new Object();
    
    Lslist list = new Lslist();

    @Test
    public void testClearEmptyList() {
        
        list.clear();
        assertEquals(list.length(),0);
    }
    @Test
    public void testAddAfterEmptyList() {
       
        list.addAfter(A);
        
        assertEquals(list.getValue(),A);
    }
    @Test
    public void testAddAfter2Objects(){
       
        list.addAfter(A);
        list.addAfter(B);
        
        assertEquals(list.getValue(), B);
        assertEquals(list.length(), 2);
    }
    
    @Test
    public void testPrevEmptyList(){
        
        assertFalse(list.prev());
        assertEquals(list.length(), 0);
    }
    
    @Test
    public void testPrevWith3Objects(){
        
        list.addAfter(A);
        list.addAfter(B);
        list.addAfter(C);
        list.prev();
        list.prev();
        
        assertFalse(list.prev());
        assertEquals(list.length(),3);
    }
    
    @Test
    public void testRemoveCurrInMiddle(){
        list.addAfter(A);
        list.addAfter(B);
        list.addAfter(C);
        list.prev();
        list.remove();
        assert
        
    }
    
    @Test
    public void testNextAtEnd(){
        list.addAfter(A);
        list.addAfter(B);
        list.addAfter(C);
        
        assertFalse(list.next());
    }
}
