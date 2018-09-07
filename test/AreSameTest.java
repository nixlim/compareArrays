import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreSameTest {

  @Test
  @DisplayName ("Should return true")
  public void test1() {
    int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
    int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
    assertEquals(true, AreSame.comp(a, b));
  }

  @Test
  @DisplayName("Should return false")
  public void test2() {
    int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
    int[] b = new int[]{121, 14641, 20736, 36100, 25921, 361, 20736, 361};
    assertEquals(true, AreSame.comp(a, b));
  }

}