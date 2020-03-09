import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BstTest {
  @Test
  public void isEmpty_test() {
    Bst<Integer> bst = new Bst<Integer>();
    final int val = 42;
    boolean expected = true;
    boolean result = bst.isEmpty();
    assertEquals(expected, result);

    expected = false;
    bst.add(val);
    result = bst.isEmpty();
    assertEquals(expected, result);
  }

  @Test
  public void add_test() {
    Bst<Integer> bst = new Bst<Integer>();
    boolean expected = true;
    boolean result = bst.isEmpty();
    assertEquals(expected, result);

    final int val = 42;
    expected = true;
    bst.add(val);
    result = bst.containValue(val);
    assertEquals(expected, result);
  }
}