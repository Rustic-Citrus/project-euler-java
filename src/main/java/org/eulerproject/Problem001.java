package org.eulerproject;

import java.util.ArrayList;

public class Problem001 extends EulerProblem {
    public Problem001() {
        super(1);
    }

    @Override
    public int solve(int num) {
        int counter = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;

        while (counter < num) {
            if (counter % 3 == 0 || counter % 5 == 0) {
                arr.add(counter);
            }
            counter++;
        }

        for (int element : arr) {
            sum += element;
        }

        return sum;
    }
}
