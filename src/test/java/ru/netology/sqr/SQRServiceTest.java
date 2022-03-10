package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'all numbers is sqrt',100,9801,90",
            "'never numbers is sqrt',98,99,0",
            "'same numbers is sqrt',200,300,3"})
    void shouldCountSqr(String tasteName, int min, int max, int expected) {
        SQRService service = new SQRService();


        int actual = service.countSqr(min, max);

        assertEquals(expected, actual);
    }
}