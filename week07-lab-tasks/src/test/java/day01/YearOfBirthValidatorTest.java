package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearOfBirthValidatorTest {
    YearOfBirthValidator yearofBirthValidator=new YearOfBirthValidator();

  @Test
    void isYearOfBirthValidTest(){
      assertTrue(yearofBirthValidator.isYearOfBirthValid(1901));

  }
    @Test
    void isYearOfBirthValidWithWrongParamTest(){
        IllegalArgumentException iae =assertThrows(IllegalArgumentException.class,()->yearofBirthValidator.isYearOfBirthValid(1900));
        assertEquals("Nem valós életkor!", iae.getMessage());
    }

}