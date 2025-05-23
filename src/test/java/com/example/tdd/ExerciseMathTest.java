package com.example.tdd;

import com.example.ExerciseMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExerciseMathTest {

    @Test
    void _1を渡すと1が返る() {
        //準備
        ExerciseMath exerciseMath = new ExerciseMath();
        //実行
        int actual = exerciseMath.factorial(1);
        //検証
        assertEquals(1,actual);
    }

    @Test
    void _4を渡すと24が返る() {

        //準備
        ExerciseMath exerciseMath = new ExerciseMath();
        //実行
        int actual = exerciseMath.factorial(4);
        //検証
        assertEquals(24, actual);
    }
}
