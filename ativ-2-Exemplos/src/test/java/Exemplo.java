/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.pss.ativ.exemplos.Palindrome;
import com.pss.ativ.exemplos.RomanNumeral;
import java.util.stream.Stream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author 55289
 */
public class Exemplo {

    public Exemplo() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    //first parameterized test
    @ParameterizedTest
    @ValueSource(strings = {"racecar", "radar", "able was I ere I saw elba"})
    void palindromeReadsSameBackward(String string) {
        Palindrome palindrome = new Palindrome(string);
        assertEquals(true, palindrome.isPalindrome());
    }

    //single parameter
    @ParameterizedTest
    @ValueSource(ints = {3, 6, 15})
    void divisibleByThree(int number) {
        assertEquals(0, number % 3);
    }

   
    //Parameters from factory methods
    @ParameterizedTest
    @MethodSource("arabicToRomanProvider")
    void convertArabicToRomanNumeral(String roman, int arabic) {
        RomanNumeral conversor = new RomanNumeral(roman);
        assertEquals(arabic, conversor.retornarNumeroArabico(roman));
    }

    private static Stream arabicToRomanProvider() {
        return Stream.of(
                Arguments.of("I", 1),
                Arguments.of("III", 3),
                Arguments.of("IV", 4)
        );
    }

    @ParameterizedTest
    @CsvSource({
        "I, 1",
        "III, 3",
        "IV, 4"
    })
    void convertArabicToRomanNumeral2(String roman, int arabic) {
        RomanNumeral conversor = new RomanNumeral(roman);
        assertEquals(arabic, conversor.retornarNumeroArabico(roman));
    }

    //Customizing display names
    @ParameterizedTest(name = "{index} => arabic={0}, roman={1}")
    @CsvFileSource(resources = "/roman-numeral.csv")
    void convertArabicToRomanNumeral3(int arabic, String roman) {
        RomanNumeral conversor = new RomanNumeral(roman);
        assertEquals(arabic, conversor.retornarNumeroArabico(roman));
    }
}
