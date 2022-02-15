import java.util.HashMap;

public class RomanNumeralsHelper {

    public int convertToNumber(String inputString) {
        HashMap<String,Integer> romanValues = new HashMap<>();
        StringBuilder romanNumeral = new StringBuilder(inputString);
        romanValues.put("M",1000);
        romanValues.put("CM",900);
        romanValues.put("D",500);
        romanValues.put("CD",400);
        romanValues.put("C",100);
        romanValues.put("XC",90);
        romanValues.put("L",50);
        romanValues.put("XL",40);
        romanValues.put("X",10);
        romanValues.put("IX",9);
        romanValues.put("V",5);
        romanValues.put("IV",4);
        romanValues.put("I",1);

        int totalValue = 0;

        while ( romanNumeral.length() > 0) {
            if (romanNumeral.length() > 1 && romanValues.containsKey(romanNumeral.substring(0, 2))) {
                totalValue += romanValues.get(romanNumeral.substring(0, 2));
                romanNumeral.replace(0, 2, "");
                continue;
            }
            if (romanValues.containsKey(romanNumeral.substring(0, 1))) {
                totalValue += romanValues.get(romanNumeral.substring(0, 1));
                romanNumeral.replace(0, 1, "");
            }
        }
        return totalValue;
    }

    public String convertToRoman(int inputNumber) {

        String finalRomanNumeral = "";

        if (inputNumber >= 1000) {
            finalRomanNumeral = doThousands((inputNumber - inputNumber % 1000));
            inputNumber = inputNumber % 1000;
        }

        if (inputNumber >= 900 && inputNumber < 1000) {
            finalRomanNumeral = finalRomanNumeral + "CM";
            inputNumber = inputNumber % 900;
        }

        if (inputNumber >= 500 && inputNumber < 900) {
            finalRomanNumeral = finalRomanNumeral + "D";
            inputNumber = inputNumber % 500;
        }

        if (inputNumber >= 400 && inputNumber < 500) {
            finalRomanNumeral = finalRomanNumeral + "CD";
            inputNumber = inputNumber % 400;
        }

        if (inputNumber >= 100) {
            finalRomanNumeral = finalRomanNumeral + doHundreds((inputNumber - inputNumber % 100));
            inputNumber = inputNumber % 100;
        }

        if (inputNumber >= 90 && inputNumber < 100) {
            finalRomanNumeral = finalRomanNumeral + "XC";
            inputNumber = inputNumber % 90;
        }

        if (inputNumber >= 50 && inputNumber < 90) {
            finalRomanNumeral = finalRomanNumeral + "L";
            inputNumber = inputNumber % 50;
        }

        if (inputNumber >= 40 && inputNumber < 50) {
            finalRomanNumeral = finalRomanNumeral + "XL";
            inputNumber = inputNumber % 40;
        }

        if (inputNumber >= 10) {
            finalRomanNumeral = finalRomanNumeral + doTens((inputNumber - inputNumber % 10));
            inputNumber = inputNumber % 10;
        }

        if (inputNumber == 9) {
            finalRomanNumeral = finalRomanNumeral + "IX";
        }

        if (inputNumber >= 5 && inputNumber < 9) {
            finalRomanNumeral = finalRomanNumeral + "V";
            inputNumber = inputNumber % 5;
        }

        if (inputNumber == 4) {
            finalRomanNumeral = finalRomanNumeral + "IV";
        }

        if (inputNumber < 4) {
            for (int i = 1; i <= inputNumber; i++) {
                finalRomanNumeral = finalRomanNumeral + "I";
            }
        }

        return finalRomanNumeral;
    }

    public static String doThousands(int inputNumber) {
        return "M".repeat(inputNumber / 1000);
    }

    public static String doHundreds(int inputNumber) {
        return "C".repeat(inputNumber / 100);
    }

    public static String doTens(int inputNumber) {
        return "X".repeat(inputNumber / 10);
    }

}

