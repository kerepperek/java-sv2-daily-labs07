package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    void createHumanWithWrongYear(){
       assertThrows(IllegalArgumentException.class,()-> new Human("Kerep Perek",1900));
    }
}