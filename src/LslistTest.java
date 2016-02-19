import static org.junit.Assert.*;

import org.junit.Test;

public class LslistTest {
    /**
     * Fields used in tests
     */
    Object A = new Object();
    Object B = new Object();
    Object C = new Object();
    Object D = new Object();

    Lslist list = new Lslist();

    /**
     * Tests constructor
     */
    @Test
    public void testConstructor() {
        Lslist demo = new Lslist();
        Lslist demo2 = new Lslist();
        assertNotSame(demo, demo2);
    }

    /**
     * Tests clear of large list
     */
    @Test
    public void testClearLargeList() {
        list.addAfter(A);
        list.addAfter(B);
        list.addAfter(C);
        list.addAfter(D);

        list.clear();
        assertEquals(list.length(), 0);
    }

    /**
     * Tests addAfter works with empty list
     */
    @Test
    public void testAddAfterEmptyList() {
        list.addAfter(A);

        assertEquals(list.getValue(), A);
    }

    /**
     * Tests addAfter works adding after an object
     */
    @Test
    public void testAddAfter2Objects() {

        list.addAfter(A);
        list.addAfter(B);

        assertEquals(list.getValue(), B);
        assertEquals(list.length(), 2);
    }

    /**
     * Tests add before works on empty list
     */
    @Test
    public void testAddBeforeEmptyList() {
        list.addBefore(A);
        assertEquals(list.getValue(), A);
    }

    /**
     * Tests add before works when curr is in middle of list
     */
    @Test
    public void testAddBeforeCurrInMiddle() {
        list.addAfter(A);
        list.addAfter(B);
        list.addAfter(C);
        list.prev();
        list.addBefore(D);
        list.next();

        assertEquals(list.getValue(), B);
    }

    /**
     * Tests add before works when curr is at end of list
     */
    @Test
    public void testAddBeforeCurrIsLast() {
        list.addAfter(A);
        list.addAfter(B);
        list.addAfter(C);
        list.addBefore(D);

        assertEquals(list.getValue(), D);
    }

    /**
     * Tests add before works when curr is first item in list
     */
    @Test
    public void testAddBeforeCurrAtBeginning() {
        list.addAfter(A);
        list.addBefore(B);

        assertEquals(list.getValue(), B);
    }

    /**
     * Tests prev returns false when list is empty
     */
    @Test
    public void testPrevEmptyList() {

        assertFalse(list.prev());
        assertEquals(list.length(), 0);
    }

    /**
     * Tests prev returns false after cycling through list to beginning
     */
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

    /**
     * Tests prev returns true after adding items to list
     */
    @Test
    public void testPrevBack1() {
        list.addAfter(A);
        list.addAfter(B);
        list.addAfter(C);
        boolean prev = list.prev();

        assertTrue(prev);
        assertEquals(list.getValue(), B);
    }

    /**
     * Tests remove removes current element when in middle of list
     */
    @Test
    public void testRemoveCurrInMiddle() {
        list.addAfter(A);
        list.addAfter(B);
        list.addAfter(C);
        list.prev();
        list.remove();

        assertEquals(list.getValue(), C);
        assertEquals(list.length(), 2);
    }

    /**
     * Tests remove removes curr element and sets it to previous
     */
    @Test
    public void testRemoveCurrAtEnd() {
        list.addAfter(A);
        list.addAfter(B);
        list.remove();

        assertEquals(list.getValue(), A);
        assertEquals(list.length(), 1);
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

    /**
     * Tests that exception is thrown if list is empty and "getValue()" is
     * called
     */
    @Test
    public void testGetValueEmptyList() {
        boolean thrown = false;
        try {
            list.getValue();
        }
        catch (IllegalStateException e) {
            thrown = true;
        }
        assertTrue(thrown);
    }
}
