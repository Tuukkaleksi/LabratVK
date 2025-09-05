package labravk1;

import org.junit.jupiter.api.Test;

import labravk1.files.TimesTable;

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("TimesTable")
public class TimesTableTest {
    @Test
    void lineTest() {
        assertEquals("5 x 1 = 5\n", TimesTable.line(5, 1));
        assertEquals("3 x 4 = 12\n", TimesTable.line(3, 4));
        assertEquals("7 x 8 = 56\n", TimesTable.line(7, 8));
        assertEquals("0 x 5 = 0\n", TimesTable.line(0, 5));
        assertEquals("-2 x 3 = -6\n", TimesTable.line(-2, 3));
    }

    @Test
    void table10Test() {
        String result = TimesTable.table10(1);
        assertTrue(result.startsWith("1 x 1 = 1\n"));
        assertTrue(result.endsWith("1 x 10 = 10\n"));
        assertEquals(10, result.split("\n").length); // 10 riviä
    }
}
