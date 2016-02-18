import static org.junit.Assert.*;

import org.junit.Test;


public class LslistTest {
    Object A = new Object();
    Object B = new Object();
    Object C = new Object();
    Object D = new Object();

    @Test
    public void testClearEmptyList() {
        Lslist list = new Lslist();
        list.clear();
        assertEquals(list.length(),0);
    }
    @Test
    public void testAddAfterEmptyList() {
        Lslist list = new Lslist();
        list.addAfter(A);
        
        assertEquals(list.getValue(),A);
    }
    @Test
    public void testAddAfter2Objects(){
        Lslist list = new Lslist();
        list.addAfter(A);
        list.addAfter(B);
        
        assertEquals(list.getValue(), B);
        assertEquals(list.length(), 2);
    }
    
    @Test
    public void testPrev(){
        Lslist list = new Lslist();
        list.addAfter(A);
        list.addAfter(B);
        list.addAfter(C);
        assertTrue(list.prev());
        assertEquals(list.length(), 3);
    }
    

}
