import java.util.ArrayList;
import java.util.List;

public class Square {
    /*PROBLEM:
    Given a list of integers, return a list where each integer is multiplied with itself.
    E.g. square([1, 2, 3]) → [1, 4, 9]
     */

    public static List<Integer> square(List<Integer> nums) {
        List<Integer> solution = new ArrayList<>();
        nums.forEach((n) -> {
            n = n * n;
            solution.add(n); });
        return solution;
    }
}
