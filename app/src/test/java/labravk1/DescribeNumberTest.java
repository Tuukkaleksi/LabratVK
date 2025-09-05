package labravk1;

import org.junit.jupiter.api.Test;

import labravk1.files.DescribeNumber;

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("DescribeNumber")
public class DescribeNumberTest {
    @Test
    void testDescribe() {
        assertEquals("positiivinen parillinen", DescribeNumber.describe(8));
        assertEquals("negatiivinen pariton", DescribeNumber.describe(-5));
        assertEquals("nolla", DescribeNumber.describe(0));
    }
}
