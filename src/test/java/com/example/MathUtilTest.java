package com.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testPower1(){
        double actualAnswer = MathUtil.power(0, -2);
        assertEquals(Double.POSITIVE_INFINITY, actualAnswer, "TC1:期待値と実際の結果が異なります。");
    }

    @Test
    void testPower2(){
        double actualAnswer = MathUtil.power(0, -1);
        assertEquals(Double.POSITIVE_INFINITY, actualAnswer, "TC2:期待値と実際の結果が異なります。");
    }

    /**
     * 例外が発生するか検証.
     */
    @Test
    void testPower21(){
        IllegalArgumentException expectedException = assertThrows(IllegalArgumentException.class,()-> MathUtil.power(100, 0));
        assertEquals("100以上の値は不正です。",expectedException.getMessage(),"TC21:期待値と実際の結果が異なります。");
    }


}