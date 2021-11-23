package day01;

import java.time.LocalDate;

public class YearOfBirthValidator {
    public boolean isYearOfBirthValid(int birthYear) {
        int actualYear = LocalDate.now().getYear();
        if (actualYear - birthYear > 120) {
            throw new IllegalArgumentException("Nem valós életkor!");
        }
        return true;
    }
}
