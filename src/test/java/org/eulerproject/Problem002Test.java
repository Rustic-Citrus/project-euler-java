package org.eulerproject;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem002Test {
  private static Problem002 testProblem;

  @BeforeAll
  static void instantiate() {
    testProblem = new Problem002();
  }

  @Test
  @DisplayName("Should return the correct answer")
  void testProblemReturnsCorrectAnswer() {
    int[] expectedAnswers = {10, 10, 44, 44, 798, 60696, 4613732};
    int[] argumentsForAnswers = {8, 10, 34, 60, 1000, 100000, 4000000};

    for (int i = 0; i < expectedAnswers.length; i++) {
      int actual = testProblem.solve(argumentsForAnswers[i]);

      assertEquals(expectedAnswers[i], actual);
    }
  }
}
