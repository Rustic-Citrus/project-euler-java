package org.eulerproject;

import java.util.ArrayList;

public class Problem003 extends EulerProblem {
  public Problem003() {
    super(3);
  }

  @Override
  public int solve(int num) {
    ArrayList<Integer> factorsArrayList = new ArrayList<>();
    int counter = 1;
    int primeFactor = 0;

    while (counter <= num) {
      if (num % counter == 0) {
        factorsArrayList.add(counter);
      }
      ++counter;
    }

    for (int element : factorsArrayList) {
      ArrayList<Integer> nestedFactorsArrayList = new ArrayList<>();
      counter = 1;
      while (counter <= element) {
        if (element % counter == 0) nestedFactorsArrayList.add(counter);
        ++counter;
      }

      if (nestedFactorsArrayList.size() == 2) {
        primeFactor = element;
      }
    }

    return primeFactor;
  }
}
