import java.util.Arrays;

public class CalculateMean {
    /*PROBLEM:
    Create a function that takes an array of numbers and returns the mean (average) of all those numbers.
    */

    public static double mean(int[] nums) {
        double sum = Arrays.stream(nums).sum();
        return sum / nums.length;
    }
}
