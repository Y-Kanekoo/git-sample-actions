package com.example;

public class ExerciseMath {

    public static final int MAX_VALUE = 13;

    public static int factorial(int args) {
        if (lessThan0(args)) {
            throw new IllegalArgumentException("0以下の値は不正です。");
        }

        if (MAX_VALUE <= args) {
            throw new IllegalArgumentException("13以上の値は不正です。");
        }

        int answer = getAnswer(args);
        return answer;
    }

    private static int getAnswer(int args) {
        int answer = 1;
        for (int i = 1; i <= args; i++) {
            answer *= i;
        }
        return answer;
    }

    private static boolean lessThan0(int args) {
        return args <= 0;
    }

}
