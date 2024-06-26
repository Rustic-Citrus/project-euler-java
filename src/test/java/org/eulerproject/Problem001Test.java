package org.eulerproject;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem001Test {
  private static Problem001 testProblem;

  @BeforeAll
  static void instantiateProblem() {
    testProblem = new Problem001();
  }

  @Test
  @DisplayName("Should return the correct answer")
  void testProblemReturnsCorrectAnswer() {
    int expectedOne = 23;
    int expectedTwo = 233168;

    int actualOne = testProblem.solve(10);
    int actualTwo = testProblem.solve(1000);

    assertAll("",
            () -> assertEquals(actualOne, expectedOne),
            () -> assertEquals(actualTwo, expectedTwo)
    );
  }
}

