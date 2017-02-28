import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Tests implementation of Slist class
 * @author JonathanThomas
 * @version 2/21/2016
 */
public class LslistTest {
    
    /**
     * object to be added to list
     */
    Object objectA = new Object();
    
    /**
     * object to be added to list
     */
    Object objectB = new Object();
    
    /**
     * object to be added to list
     */
    Object objectC = new Object();
    
    /**
     * object to be added to list
     */
    Object objectD = new Object();

    /**
     * Creates new list to be used in tests
     */
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
        list.addAfter(objectA);
        list.addAfter(objectB);
        list.addAfter(objectC);
        list.addAfter(objectD);

        list.clear();
        assertEquals(list.length(), 0);
    }

    /**
     * Tests addAfter works with empty list
     */
    @Test
    public void testAddAfterEmptyList() {
        list.addAfter(objectA);

        assertEquals(list.getValue(), objectA);
    }

    /**
     * Tests addAfter works adding after an object
     */
    @Test
    public void testAddAfter2Objects() {

        list.addAfter(objectA);
        list.addAfter(objectB);

        assertEquals(list.getValue(), objectB);
        assertEquals(list.length(), 2);
    }

    /**
     * Tests add before works on empty list
     */
    @Test
    public void testAddBeforeEmptyList() {
        list.addBefore(objectA);
        assertEquals(list.getValue(), objectA);
    }

    /**
     * Tests add before works when curr is in middle of list
     */
    @Test
    public void testAddBeforeCurrInMiddle() {
        list.addAfter(objectA);
        list.addAfter(objectB);
        list.addAfter(objectC);
        list.prev();
        list.addBefore(objectD);
        list.next();

        assertEquals(list.getValue(), objectB);
    }

    /**
     * Tests add before works when curr is at end of list
     */
    @Test
    public void testAddBeforeCurrIsLast() {
        list.addAfter(objectA);
        list.addAfter(objectB);
        list.addAfter(objectC);
        list.addBefore(objectD);

        assertEquals(list.getValue(), objectD);
    }

    /**
     * Tests add before works when curr is first item in list
     */
    @Test
    public void testAddBeforeCurrAtBeginning() {
        list.addAfter(objectA);
        list.addBefore(objectB);

        assertEquals(list.getValue(), objectB);
    }
    
    /**
     * Tests remove removes current element when in middle of list
     */
    @Test
    public void testRemoveCurrInMiddle() {
        list.addAfter(objectA);
        list.addAfter(objectB);
        list.addAfter(objectC);
        list.prev();
        list.remove();

        assertEquals(list.getValue(), objectC);
        assertEquals(list.length(), 2);
    }

    /**
     * Tests remove removes curr element and sets it to previous
     */
    @Test
    public void testRemoveCurrAtEnd() {
        list.addAfter(objectA);
        list.addAfter(objectB);
        list.remove();

        assertEquals(list.getValue(), objectA);
        assertEquals(list.length(), 1);
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

        list.addAfter(objectA);
        list.addAfter(objectB);
        list.addAfter(objectC);
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
        list.addAfter(objectA);
        list.addAfter(objectB);
        list.addAfter(objectC);
        boolean prev = list.prev();

        assertTrue(prev);
        assertEquals(list.getValue(), objectB);
    }

    /**
     * Tests next returns false when curr is at end of list
     */
    @Test
    public void testNextAtEnd() {
        list.addAfter(objectA);
        list.addAfter(objectB);
        list.addAfter(objectC);

        assertFalse(list.next());
    }

    /**
     * Tests next returns true and curr pointer moves to next node
     */
    @Test
    public void testNextInMiddle() {
        list.addAfter(objectA);
        list.addAfter(objectB);
        list.addAfter(objectC);
        boolean next = list.prev();
        boolean prev = list.next();

        assertEquals(list.getValue(), objectC);
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
