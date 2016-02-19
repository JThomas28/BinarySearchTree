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
        assertEquals(list.length(), 0);
    }

    @Test
    public void testAddAfterEmptyList() {
        list.addAfter(A);

        assertEquals(list.getValue(), A);
    }

    @Test
    public void testAddAfter2Objects() {

        list.addAfter(A);
        list.addAfter(B);

        assertEquals(list.getValue(), B);
        assertEquals(list.length(), 2);
    }

    @Test
    public void testPrevEmptyList() {

        assertFalse(list.prev());
        assertEquals(list.length(), 0);
    }

    @Test
    public void testPrevBackToBeginning() {

        list.addAfter(A);
        list.addAfter(B);
        list.addAfter(C);
        list.prev();
        list.prev();
        boolean prevAtBeginning = list.prev();

        assertFalse(prevAtBeginning);

        assertEquals(list.length(), 3);
    }

    @Test
    public void testPrevBack1() {
        list.addAfter(A);
        list.addAfter(B);
        list.addAfter(C);
        boolean prev = list.prev();

        assertTrue(prev);
        assertEquals(list.getValue(), B);
    }
    
    @Test
    public void testRemoveCurrInMiddle() {
        list.addAfter(A);
        list.addAfter(B);
        list.addAfter(C);
        list.prev();
        list.remove();

        assertEquals(list.getValue(), C);
    }

    @Test
    public void testremoveCurrAtEnd() {
        list.addAfter(A);
        list.addAfter(B);
        list.remove();

        assertEquals(list.getValue(), A);
    }

    @Test
    public void testNextAtEnd() {
        list.addAfter(A);
        list.addAfter(B);
        list.addAfter(C);

        assertFalse(list.next());
    }

    @Test
    public void testNextInMiddle() {
        list.addAfter(A);
        list.addAfter(B);
        list.addAfter(C);
        boolean next = list.prev();
        boolean prev = list.next();

        assertEquals(list.getValue(), C);
        assertTrue(next);
        assertTrue(prev);
    }
    
    @Test
    public void testAddBeforeEmptyList(){
        list.addBefore(A);
        assertEquals(list.getValue(), A);
    }
    
    @Test
    public void testAddBeforeCurrInMiddle(){
        list.addAfter(A);
        list.addAfter(B);
        list.addAfter(C);
        list.prev();
        list.addBefore(D);
        list.next();
        
        assertEquals(list.getValue(),B);
    }
    
    @Test
    public void testAddBeforeCurrIsLast(){
        list.addAfter(A);
        list.addAfter(B);
        list.addAfter(C);
        list.addBefore(D);
        
        assertEquals(list.getValue(), D);
    }
    
    @Test
    public void testAddBeforeCurrAtBeginning(){
        list.addAfter(A);
        list.addBefore(B);
        
        assertEquals(list.getValue(), B);
    }

    @Test
    public void testGetValueEmptyList() {
        boolean thrown = false;
        try{
            list.getValue();
            
        }
        catch(IllegalStateException e){
            thrown = true;
        }
        assertTrue(thrown);
    }
}
