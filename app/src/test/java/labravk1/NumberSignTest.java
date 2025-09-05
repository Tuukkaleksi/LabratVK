package labravk1;

import org.junit.jupiter.api.Test;

import labravk1.files.NumberSign;

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("NumberSign")
public class NumberSignTest {
    @Test
    void testSign() {
        assertEquals("positiivinen", NumberSign.sign(5), "5 is positiivinen");
        assertEquals("negatiivinen", NumberSign.sign(-2), "-2 is negatiivinen");
        assertEquals("nolla", NumberSign.sign(0), "0 is nolla");
    }
}
