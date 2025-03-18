package sk.tmconsulting.testy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScitavanieVstupnychHodnotTest {

    @Test
    public void roundToTwoDecimalPlaces() {
        assertEquals (8.12, ScitavanieVstupnychHodnot.roundToTwoDecimalPlaces(8.117));
        assertEquals(5.01, ScitavanieVstupnychHodnot.roundToTwoDecimalPlaces(5.006789));
            }
        }

