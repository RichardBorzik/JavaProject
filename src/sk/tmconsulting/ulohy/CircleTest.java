package sk.tmconsulting.ulohy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CircleTest {

    private Circle circle;

    @BeforeEach
    void setUp() {
        circle = new Circle();
    }

    @Test
    void testObvodkruhu() {
        assertEquals(31.41592653589793, circle.obvodkruhu(5));
        assertEquals(62.83185307179586, circle.obvodkruhu(10));
    }

    @Test
    void testObsahhruhu() {
        assertEquals(28.274333882308138, circle.obsahkruhu(3));
        assertEquals(201.06192982974676, circle.obsahkruhu(8));
        }

    }

