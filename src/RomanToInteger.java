import java.util.*;

public class RomanToInteger {
  public static void main(String[] args) {
    System.out.println(romanToInt("XIV"));
  }

  public static int romanToInt(String s) {
    Map<Character, Integer> romanValues = Map.of('I', 1, 'V', 5, 'X', 10, 'L',
            50, 'C', 100, 'D', 500, 'M', 1000
    );

    int total = 0;
    int lastValueRead = 0;

    for (int i = s.length() - 1; i >= 0; i--) {
      char currentChar = s.charAt(i);
      int currentValue = romanValues.get(currentChar);

      if (currentValue < lastValueRead) {
        total = total - currentValue;
      } else {
        total = total + currentValue;
      }

      lastValueRead = currentValue;
    }

    return total;
  }
}
