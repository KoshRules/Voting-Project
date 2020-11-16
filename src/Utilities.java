import java.util.ArrayList;

public class Utilities {

    static boolean validEmail(String email)
    {
        return (email.contains("@") && email.contains("."));
    }

    static boolean onlyContainsNumbers(String text)
    {
        return (text.matches("[0-9]+"));
    }

    static boolean max30Chars(String str)
    {
        return (str.length() <=30);
    }

    static boolean validIntRange(int start, int end, int num)
    {
        return (num >= start && num <= end);
    }

    static boolean validIndex(int num, ArrayList values)
    {
        return (num >= 0 && num < values.size());
    }

    static boolean validNonNegative(int num)
    {
        return (num >= 0);
    }

    static boolean validPositive(int num)
    {
        return (num > 0);
    }
}
