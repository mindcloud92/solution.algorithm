package xyz.dddd.algorithm.question;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import xyz.dddd.algorithm.question.programmers.ReverseNumberToArray;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReverseNumberToArrayTests {

  private static ReverseNumberToArray reverseNumberToArray;

  @BeforeAll
  public static void setUp() {
    reverseNumberToArray = new ReverseNumberToArray();
  }

  @Test
  public void givenNumberThenSolveThen() {
    long number = 12345;

    int[] actual = reverseNumberToArray.solve(number);

    int[] expected = {5, 4, 3, 2, 1};
    assertArrayEquals(expected, actual);
  }

}