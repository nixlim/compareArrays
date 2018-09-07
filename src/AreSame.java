//https://www.codewars.com/kata/are-they-the-same/train/java

import java.util.Arrays;

public class AreSame {

  public static boolean comp(int[] a, int[] b) {
    Arrays.sort(a);
    Arrays.sort(b);

    if (a.length == b.length && (a.length != 0)) {
      
      return true;
    } else {
      return false;
    }
  }

}
