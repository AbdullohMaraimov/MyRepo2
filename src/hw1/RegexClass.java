package hw1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexClass {

    public static int getNumbersCount(String input) {
        int numOfDigits = 0;
        if (input == null)
            throw new RuntimeException("Input can not be null");

        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            numOfDigits++;
        }
        return numOfDigits;
    }

}
