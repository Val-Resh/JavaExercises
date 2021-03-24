import java.util.ArrayList;

public class PositiveDominant {
    /*PROBLEM:
    An array is positive dominant if it contains strictly more unique positive values than unique negative values.
    Write a function that returns true if an array is positive dominant, false, otherwise.
    Note: 0 counts as neither a positive nor a negative value.

    Eg. [5, 99, 832, -3, -4] - true
     */

    public static boolean isPositiveDominant(int[] n) {
        int countPositives = 0;
        int countNegatives = 0;
        ArrayList<Integer> uniqueValues = new ArrayList<>();
        for (int x : n) {
            if (x > 0 && !uniqueValues.contains(x)) {
                countPositives += 1;
                uniqueValues.add(x);
            }
            else if (x < 0 && !uniqueValues.contains(x)){
                countNegatives += 1;
                uniqueValues.add(x);
            }
        }
        return countPositives > countNegatives;
    }
}
