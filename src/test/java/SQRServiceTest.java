package org.example.untitled2.Service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {
            "Min amount, 1601, 1680, 0",
            "Max amount, 100, 9801, 90",
            "'Min interval, amount 1', 4900, 4900, 1",
            "'Min interval, amount 0', 4901, 4901, 0",
            "Interval under 99, 1, 99, 0",
            "Interval upper 9802, 9802, 99999, 0",
            "Critical path, 200, 300, 3",
    })
    void shouldCalculate(String testName, int min, int max, int expected) {
        SQRService service = new SQRService();

        int actual = service.calculate(min, max);

        assertEquals(actual, expected);
    }
}