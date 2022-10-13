import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace2() {
    int[] input = { 1, 2, 3 };
    int[] expected = { 3, 2, 1 };
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(expected, input);
  }

  @Test
  public void testReversed2() {
    int[] input = { 1, 2, 3 };
    int[] expected = { 3, 2, 1 };

    assertArrayEquals(expected, ArrayExamples.reversed(input));
  }

  @Test 
  public void testAvgWithoutLowest() {
    double[] input = {-1.0, 1.0, 2.0, 3.0};
    double expected = 2.0;

    assertEquals(expected, ArrayExamples.averageWithoutLowest(input), 0.001);
  }

  @Test 
  public void testAvgWithoutLowestEmpty() {
    double[] input = {};
    double expected = 0.0;

    assertEquals(expected, ArrayExamples.averageWithoutLowest(input), 0.001);
  }

  @Test 
  public void testAvgWithoutLowest_dupLowest() {
    double[] input = {1.0, 1.0, 2.0, 3.0} ;
    double expected = 2.0;

    assertEquals(expected, ArrayExamples.averageWithoutLowest(input), 0.001);
  }
}
