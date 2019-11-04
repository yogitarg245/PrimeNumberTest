package com.yogi;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("While Testing prime number program")
public class PrimeNumberTests {

    PrimeNumber pm = new PrimeNumber();

    @Test
    @DisplayName("When 6 is given")
    public void isSixPrimeNumber() {
        boolean expected=Boolean.FALSE;
        boolean actual= pm.isPrimeNumber(6);
        assertEquals( expected,actual,()->"expected 6 and actual is not 6");
    }

    @Test
    @DisplayName("When 3 is given")
    public void isThreePrimeNumber() {
        boolean expected=Boolean.TRUE;
        boolean actual= pm.isPrimeNumber(3);
        assertEquals( expected,actual, ()->"expected 3 and actual is not 3");
    }
}
