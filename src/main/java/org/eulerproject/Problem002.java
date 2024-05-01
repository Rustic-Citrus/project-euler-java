package org.eulerproject;

import java.util.ArrayList;

public class Problem002 extends EulerProblem {
  public Problem002() {
    super(2);
  }

  @Override
  public int solve(int num) {
    int sum1 = 0;
    int sum2 = 0;
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(1);
    arr.add(2);

    while (sum1 < num) {
      sum1 = arr.getLast() + arr.get(arr.size()- 2);
      arr.add(sum1);
    }

    for (int element : arr){
      if (element % 2 == 0) {
        sum2 += element;
      }
    }

    return sum2;
  }
}
