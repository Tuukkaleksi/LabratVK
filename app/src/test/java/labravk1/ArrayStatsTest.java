package labravk1;

import org.junit.jupiter.api.Test;

import labravk1.files.ArrayStats;

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("ArrayStats")
public class ArrayStatsTest {
    @Test
    void averageTest() {
        assertEquals(10.0, ArrayStats.average(new int[]{5, 10, 15}), "average({5,10,15}) → 10.0");
        assertEquals(0.0, ArrayStats.average(new int[]{}), "average({}) → 0.0");
    }

    @Test
    void maxTest() {
        assertEquals(20, ArrayStats.max(new int[]{-1, 20, 3, 7}), "max({-1,20,3,7}) → 20");
        assertEquals(Integer.MIN_VALUE, ArrayStats.max(new int[]{}), "max({}) → Integer.MIN_VALUE");
    }
}
