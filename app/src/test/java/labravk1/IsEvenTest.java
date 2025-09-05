package labravk1;

import org.junit.jupiter.api.Test;

import labravk1.files.IsEven;

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("IsEven")
public class IsEvenTest {
    @Test
    void testIsEven() {
        assertTrue(IsEven.isEven(8), "8 return true");
        assertFalse(IsEven.isEven(7), "7 return false");
        assertTrue(IsEven.isEven(0), "0 return true");
    }
}
