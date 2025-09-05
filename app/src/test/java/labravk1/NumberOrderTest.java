package labravk1;

import org.junit.jupiter.api.Test;

import labravk1.files.NumberOrder;

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("NumberOrder")
public class NumberOrderTest {
    @Test
    void testOrder2() {
        assertEquals("2,5", NumberOrder.order2(5, 2));
        assertEquals("3,3", NumberOrder.order2(3, 3));
    }

    @Test
    void testOrder3() {
        assertEquals("2,5,9", NumberOrder.order3(5, 2, 9));
        assertEquals("3,3,7", NumberOrder.order3(3, 7, 3));
        assertEquals("1,2,3", NumberOrder.order3(3, 2, 1));
    }
}
