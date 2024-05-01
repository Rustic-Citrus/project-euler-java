package org.eulerproject;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem003Test {
  private static Problem003 testProblem;

  @BeforeAll
  static void instantiate() {
    testProblem = new Problem003();
  }

  @Test
  @DisplayName("Should return the correct answer")
  void testProblemReturnsCorrectAnswer() {
    int[] expectedAnswers = {2, 3, 5, 7, 2, 29};
    int[] argumentsForActualAnswers = {2, 3, 5, 7, 8, 13195};

    for (int i = 0; i < expectedAnswers.length; i++) {
      int actualAnswer = testProblem.solve(argumentsForActualAnswers[i]);

      assertEquals(expectedAnswers[i], actualAnswer);
    }
  }
}
