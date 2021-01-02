import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilTest {

  @Test
  void testIsPalindrome_emptyString() {
    assertFalse(StringUtil.isPalindrome(""));
  }

  @Test
  void testIsPalindrome_notPalinodrome() {
    assertFalse(StringUtil.isPalindrome("no"));
  }

  @Test
  void testIsPalindrome() {
    assertTrue(StringUtil.isPalindrome("racecar"));
  }
}