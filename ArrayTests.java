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
  public void testreversedinplace2() {
    int[] input1 = {1,2};
    ArrayExamples.reverseInPlace(input1);
    // for(int elements : input1){
    //   System.out.println(elements);
    // }
    assertArrayEquals(new int[]{2,1}, input1);
  }

  @Test
  public void testreverse2() {
    int[] input1 = {1,2,3,4};
    // for(int elements : ArrayExamples.reversed(input1)){
    //   System.out.println(elements);
    // }
    assertArrayEquals(new int[]{4,3,2,1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testavg() {
    double[] input1 = {2.0,4.0,2.0,2.0};
    // for(int elements : ArrayExamples.reversed(input1)){
    //   System.out.println(elements);
    // }
    // assertArrayEquals(new int[]{4,3,2,1}, ArrayExamples.reversed(input1));
    double d1=4.0;
    assertEquals(d1, ArrayExamples.averageWithoutLowest(input1), 0.0);
  }
}
