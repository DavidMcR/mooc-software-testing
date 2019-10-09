package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanNumeralTestWithBeforeEach {

    private RomanNumeral roman;

    @BeforeEach
    public void initialize() {
        this.roman = new RomanNumeral();
    }

    @Test
    public void singleNumber() {
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
    }
    @Test
    public void five(){
        int result = roman.convert("V");
        Assertions.assertEquals(5, result);
    }

    @Test
    public void ten(){
        int result = roman.convert("X");
        Assertions.assertEquals(10, result);
    }

    @Test
    public void fifty(){
        int result = roman.convert("L");
        Assertions.assertEquals(50, result);
    }

    @Test
    public void hundred(){
        int result = roman.convert("C");
        Assertions.assertEquals(100, result);
    }

    @Test
    public void fivehundred(){
        int result = roman.convert("D");
        Assertions.assertEquals(500, result);
    }

    public void onethousand(){
        int result = roman.convert("M");
        Assertions.assertEquals(1000, result);
    }
    @Test
    public void numberWithManyDigits() {
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);
    }

    @Test
    public void numberWithSubtractiveNotation() {
        int result = roman.convert("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        int result = roman.convert("XLIV");
        Assertions.assertEquals(44, result);
    }
}
