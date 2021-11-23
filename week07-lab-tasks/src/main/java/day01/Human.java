package day01;

import java.time.LocalDate;

public class Human {

    String name;
    int birthYear;

    public Human(String name, int birthYear) {
NameValidator nv=new NameValidator();
YearOfBirthValidator ybv=new YearOfBirthValidator();
        if (ybv.isYearOfBirthValid(birthYear) && nv.isNameValid(name)) {
            this.name = name;
            this.birthYear = birthYear;
        }
    }

    private boolean isYearOfBirthValid(int yearOfBirth) {
        int actualYear = LocalDate.now().getYear();
        if (actualYear - birthYear > 120 || name == null || name.indexOf(" ") == 0) {
            throw new IllegalArgumentException("Nem valós életkor!");
        }
        return true;
    }



    public String getName() {

        return name;
    }

    public int getBirthYear() {

        return birthYear;
    }
}
