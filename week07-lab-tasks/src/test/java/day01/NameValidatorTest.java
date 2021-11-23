package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameValidatorTest {

    NameValidator nameValidator = new NameValidator();

    @Test
    void isNameValidTest() {
        boolean result = nameValidator.isNameValid("Kerep Perek");
        assertTrue(result);
    }

    @Test
    void isNameValidWithNullTest() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> nameValidator.isNameValid(null));
        assertEquals("Rossz név!", iae.getMessage());
    }

    @Test
    void isNameValidWithWrongNameTest() {
        boolean result = nameValidator.isNameValid("KerepPerek");
        assertFalse(result);
    }

}