import java.util.ArrayList;
import java.util.List;

public class Isogram {
    /*PROBLEM:
    An isogram is a word that has no repeating letters, consecutive or non-consecutive.
    Implement a function that determines whether a string that contains only letters is an isogram.
    Assume the empty string is an isogram. Ignore letter case.
     */

    public static boolean isIsogram(String str) {
        String x = str.toLowerCase();
        List<Character> array = new ArrayList<>();
        for (int i = 0; i < str.length(); i++){
            if (!array.contains(x.charAt(i))) array.add(x.charAt(i));
            else return false;
        }
        return true;
    }
}
