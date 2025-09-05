package labravk1;

import org.junit.jupiter.api.Test;

import labravk1.files.PasswordAttempts;

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("PasswordAttempts")
public class PasswordAttemptsTest {
    @Test
    void checkTest() {
        assertTrue(PasswordAttempts.check("java123"));
        assertFalse(PasswordAttempts.check("JAVA123"));
        assertFalse(PasswordAttempts.check(null));
    }

    @Test
    void loginTest() {
        assertEquals("Tervetuloa!", PasswordAttempts.login(new String[]{"no", "java123", "x"}));
        assertEquals("Liian monta virheellistä yritystä.", PasswordAttempts.login(new String[]{"a", "b"}));
        assertEquals("Liian monta virheellistä yritystä.", PasswordAttempts.login(new String[]{"no", "no", "no", "java123"}));
    }
}
