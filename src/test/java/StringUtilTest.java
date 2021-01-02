import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringUtilTest {

  @Test
  void testIsPalindrome_emptyString() {
    assertThat(StringUtil.isPalindrome("")).isFalse();
  }

  @Test
  void testIsPalindrome_notPalinodrome() {
    assertThat(StringUtil.isPalindrome("no")).isFalse();
  }

  @Test
  void testIsPalindrome() {
    assertThat(StringUtil.isPalindrome("racecar")).isTrue();
  }
}