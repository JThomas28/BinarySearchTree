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
        assertEquals(list.length(),1);
    }

}
