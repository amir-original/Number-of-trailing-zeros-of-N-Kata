import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;
import static java.util.stream.LongStream.rangeClosed;

public class NumberCalculator {

    private static final int NO_TRAILING_ZEROS = 0;

    public int zeros(int number) {
        long factorial = factorial(number);
        System.out.println(factorial);
        Matcher matcher = findTrailingZeros(getString(factorial));

        return matcher.find() ? numberOfTrailingZeros(matcher) : NO_TRAILING_ZEROS;
    }

    private String getString(long factorial) {
        LongToStringFunction longToStringFunction = String::valueOf;
        return longToStringFunction.get(factorial);
    }

    private long factorial(int number) {
        return rangeClosed(1, number).reduce(1, (a, b) -> a * b);
    }

    private int numberOfTrailingZeros(Matcher matcher) {
        return matcher.group("zeros").length();
    }

    private Matcher findTrailingZeros(String number) {
        Pattern pattern = compile("[0-9](?<zeros>:?0+$)", Pattern.CASE_INSENSITIVE);
        return pattern.matcher(number);
    }
}
