package org.eulerproject;

public abstract class EulerProblem {
    private final int problemNumber;

    public EulerProblem(int num) {
        this.problemNumber = num;
    }

    public abstract int solve(int num);
}
