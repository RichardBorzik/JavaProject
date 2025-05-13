package sk.tmconsulting.testy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayListNumbersTest {

    private ArrayListNumbers test;

    @BeforeEach
    public void setUp() {
        test = new ArrayListNumbers();
    }

    @Test
    public void roundToTwoDecimalPlaces() {
        // Test zaokruhlovania
        assertEquals(8.12, test.roundToTwoDecimalPlaces(8.117));
        assertEquals(5.01, test.roundToTwoDecimalPlaces(5.006789));
    }

    @Test
    public void testCalculateSum() {
        // Nastavime hodnoty pre sucet
        // setNumbers(10.5, 20.3, 5.2);
        double expectedSum = 10.5 + 20.3 + 5.2;
        assertEquals(expectedSum, test.calculateSum(10.5, 20.3, 5.2), 0.0001);
    }
}

