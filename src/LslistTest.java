import static org.junit.Assert.*;

import org.junit.Test;


public class LslistTest {

    @Test
    public void testClearEmptyList() {
        Lslist list = new Lslist();
        list.clear();
        assertEquals(list.length(),0);
    }

}
