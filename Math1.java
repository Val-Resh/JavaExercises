import java.util.ArrayList;
import java.util.List;

public class Math1 {
    /*PROBLEM:
    Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.
    Eg. math1([1, 2, 3]) → [20, 30, 40]
        math1([6, 8, 6, 8, 1]) → [70, 90, 70, 90, 20]
     */

    public static List<Integer> math1(List<Integer> nums) {
        List<Integer> solution = new ArrayList<>();
        nums.forEach((n) -> { n = (n + 1) * 10; solution.add(n); });
        return solution;
    }
}
