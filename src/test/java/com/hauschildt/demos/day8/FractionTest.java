package com.hauschildt.demos.day8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {
    @Test
    public void defaultConstructor() {
        String expected = "1/1";
        String actual = new Fraction().toString();
        assertEquals(expected, actual);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void parameterizedConstructor() {
        Fraction fraction = new Fraction(1, 2);
        String expected = "1/2";
        String actual = fraction.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void getNumerator() {
        Fraction fraction = new Fraction();
        int expected = 1;
        int actual = fraction.getNumerator();
        assertEquals(expected, actual);
    }

    @Test
    public void getDenominator() {
        assertEquals(1, new Fraction().getDenominator());
        assertEquals(2, new Fraction(1,2).getDenominator());
    }

    @Test
    public void setNumerator() {
        Fraction fraction = new Fraction();
        fraction.setNumerator(100);
        int expected = 100;
        int actual = fraction.getNumerator();
        assertEquals(expected, actual);
    }

    @Test
    public void setDenominator() {
        Fraction fraction = new Fraction();
        fraction.setDenominator(100);
        int expected = 100;
        int actual = fraction.getDenominator();
        assertEquals(expected, actual);
        assertThrows(Exception.class, () -> fraction.setDenominator(0));
        assertThrowsExactly(IllegalArgumentException.class, () -> fraction.setDenominator(0));
    }

    @Test
    public void greatestCommonFactor() {
        assertTrue(11 == Fraction.greatestCommonDivisor(99,88));
        assertTrue(1 == Fraction.greatestCommonDivisor(-1, -1));
        assertTrue(1 == Fraction.greatestCommonDivisor(0, 1));
    }

    @Test
    public void bewareOfDoubles() {
        assertEquals(3.3, 1.1 + 2.2, 0.0001);
    }









}