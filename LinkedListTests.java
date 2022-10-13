import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
    @Test
    public void testAppend() {
        LinkedList l = new LinkedList();
        l.append(5);
        l.append(3);
        l.append(1);

        String expected = "5 3 1 ";

        assertEquals(expected, l.toString());
    }

    @Test 
    public void testPrepend() {
        LinkedList l = new LinkedList();
        l.prepend(3);
        l.prepend(2);
        l.prepend(1);

        String expected = "1 2 3 ";
        assertEquals(expected, l.toString());
    }

    @Test
    public void testLast() {
        LinkedList l = new LinkedList();
        l.append(5);
        l.append(3);
        l.append(1);

        int expected = 1;

        assertEquals(expected, l.last());
    }

    @Test
    public void testLength() {
        LinkedList l = new LinkedList();
        l.append(5);
        l.append(3);
        l.append(1);

        int length = 3;

        assertEquals(length, l.length());
    }
}
