import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

class MyChecker implements StringChecker {
    public boolean checkString(String s) {
      return s.contains("b");
    }
}
public class ListTests {
    //merge
    //filter

    @Test
    public void testFilter() {
        List<String> input = new ArrayList<>();
        input.add("foo");
        input.add("bar");
        input.add("baz");

        StringChecker sc = new MyChecker();

        List<String> expected = new ArrayList<>();
        expected.add("bar");
        expected.add("baz");

        assertEquals(expected, ListExamples.filter(input, sc));
    }

    @Test
    public void testMerge() {
        List<String> arr1 = new ArrayList<>();
        List<String> arr2 = new ArrayList<>();

        arr1.add("a");
        arr1.add("c");
        arr2.add("b");
        arr2.add("d");

        List<String> expected = Arrays.asList("a", "b", "c", "d");

        assertEquals(expected, ListExamples.merge(arr1, arr2));
    }
 }
