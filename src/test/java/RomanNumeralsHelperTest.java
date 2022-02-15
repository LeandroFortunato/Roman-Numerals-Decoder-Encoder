import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralsHelperTest {

//    The Kata says you should write a function to convert from normal numbers to Roman Numerals: eg
    //     1 --> I
    //     5 --> V
    //     10 --> X
    //     30 --- XXX
    //     40 --- XL
    //     50 --> L
    //     100 --> C
    //     400 --> CD
    //     500 --> D
    //     1000 --> M     2022 --> MMXXII   2322  ---> MMCCCXXII


    @Test
    public void testConvertRNMultiplesOf1000LessThan4000ToNumber() {

        RomanNumeralsHelper convertor = new RomanNumeralsHelper();

        assertEquals(1000, convertor.convertToNumber("M"));
        assertEquals(2000, convertor.convertToNumber("MM"));
        assertEquals(3000, convertor.convertToNumber("MMM"));
    }

    @Test
    public void testConvertRNMultiplesOf100LessThan400ToNumber() {

        RomanNumeralsHelper convertor = new RomanNumeralsHelper();

        assertEquals(100, convertor.convertToNumber("C"));
        assertEquals(200, convertor.convertToNumber("CC"));
        assertEquals(300, convertor.convertToNumber("CCC"));
    }

    @Test
    public void testConvertRN400ToNumber() {

        RomanNumeralsHelper convertor = new RomanNumeralsHelper();

        assertEquals(400, convertor.convertToNumber("CD"));
    }

    @Test
    public void testConvertRNMultiplesOf10LessThan40ToNumber() {

        RomanNumeralsHelper convertor = new RomanNumeralsHelper();

        assertEquals(10, convertor.convertToNumber("X"));
        assertEquals(20, convertor.convertToNumber("XX"));
        assertEquals(30, convertor.convertToNumber("XXX"));
    }

    @Test
    public void testConvertRN40ToNumber() {

        RomanNumeralsHelper convertor = new RomanNumeralsHelper();

        assertEquals(40, convertor.convertToNumber("XL"));
    }

    @Test
    public void testConvertMultiplesOf1000LessThan4000ToRN() {

        RomanNumeralsHelper convertor = new RomanNumeralsHelper();

        assertEquals("MM", convertor.convertToRoman(2000));
        assertEquals("MMM", convertor.convertToRoman(3000));
    }
    @Test
    public void testConvertMultiplesOf10ThatAreMoreThan900AndLessThan1000ToRN() {

        RomanNumeralsHelper convertor = new RomanNumeralsHelper();

        assertEquals("CMX", convertor.convertToRoman(910));
        assertEquals("CML", convertor.convertToRoman(950));
        assertEquals("CMXC", convertor.convertToRoman(990));
    }
    @Test
    public void testConvertMultiplesOf100ThatAreLessThan1000AndMoreThan500ToRN() {

        RomanNumeralsHelper convertor = new RomanNumeralsHelper();

        assertEquals("DCCXL", convertor.convertToRoman(740));
        assertEquals("DCCCXC", convertor.convertToRoman(890));
    }
    @Test
    public void testConvertMultiplesOf100ThatAreLessThan400ToRN() {

        RomanNumeralsHelper convertor = new RomanNumeralsHelper();

        assertEquals("CC", convertor.convertToRoman(200));
        assertEquals("CCC", convertor.convertToRoman(300));
    }

    @Test
    public void testConvert400ToRN() {

        RomanNumeralsHelper convertor = new RomanNumeralsHelper();

        assertEquals("CD", convertor.convertToRoman(400));
    }

    @Test
    public void testConvertMultiplesOf10ThatAreLessThan40() {

        RomanNumeralsHelper convertor = new RomanNumeralsHelper();

        assertEquals("XX", convertor.convertToRoman(20));
        assertEquals("XXX", convertor.convertToRoman(30));
    }

    @Test
    public void testConvert40ToRN() {

        RomanNumeralsHelper convertor = new RomanNumeralsHelper();

        assertEquals("XL", convertor.convertToRoman(40));
    }

    @Test

    public void testConvertUpTo7ToRN() {

        RomanNumeralsHelper convertor = new RomanNumeralsHelper();

        assertEquals("I", convertor.convertToRoman(1));
        assertEquals("II", convertor.convertToRoman(2));
        assertEquals("III", convertor.convertToRoman(3));
        assertEquals("IV", convertor.convertToRoman(4));
        assertEquals("V", convertor.convertToRoman(5));
        assertEquals("VII", convertor.convertToRoman(7));
    }

    @Test
    public void testConvertCompoundNumbersOver1000MultipleOf100ToRN() {

        RomanNumeralsHelper convertor = new RomanNumeralsHelper();

        assertEquals("MC", convertor.convertToRoman(1100));
        assertEquals("MCCC", convertor.convertToRoman(1300));
        assertEquals("MCC", convertor.convertToRoman(1200));
        assertEquals("MCD", convertor.convertToRoman(1400));
        assertEquals("MD", convertor.convertToRoman(1500));
        assertEquals("MDC", convertor.convertToRoman(1600));
        assertEquals("MCM", convertor.convertToRoman(1900));
        assertEquals("MMC", convertor.convertToRoman(2100));
    }

    @Test
    public void testConvertCompoundNumbersOver1000MultipleOf10ToRN() {

        RomanNumeralsHelper convertor = new RomanNumeralsHelper();

        assertEquals("MCXXX", convertor.convertToRoman(1130));
        assertEquals("MCCCXC", convertor.convertToRoman(1390));

        assertEquals("XXIII", convertor.convertToRoman(23));

    }

    @Test
    public void testConvertNumbersLowerThan50ToRN() {

        RomanNumeralsHelper convertor = new RomanNumeralsHelper();

        assertEquals("XXIII", convertor.convertToRoman(23));
        assertEquals("XLIX", convertor.convertToRoman(49));
    }
//        @Test
//        public void print1to3000 (){
//
//            RomanNumeralsHelper convertor = new RomanNumeralsHelper();
//
//            for (int i = 1; i < 4000; i++) {
//                System.out.println(convertor.convertToNumber(convertor.convertToRoman(i)));
//            }
//
//        }
}

