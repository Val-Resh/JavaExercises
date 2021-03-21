import java.util.Arrays;

public class ConsecutiveNumbers {
    /*PROBLEM:
    Create a function that determines whether elements in an array
    can be re-arranged to form a consecutive list of numbers where each number appears exactly once.

    Eg.cons([5, 1, 4, 3, 2]) ➞ true
        // Can be re-arranged to form [1, 2, 3, 4, 5]

        cons([5, 1, 4, 3, 2, 8]) ➞ false

        cons([5, 6, 7, 8, 9, 9]) ➞ false
        // 9 appears twice
     */

    public static boolean consecutiveNums(int[] array) {
        boolean solution = false;
        for (int i = 0; i < array.length; i++) {
            for (int k = i + 1; k < array.length; k++) {
                if (array[i] > array[k]) {
                    int temp = array[i];
                    array[i] = array[k];
                    array[k] = temp;
                }
            }
        }
        if (array.length != Arrays.stream(array).distinct().count()) return false;
        else {
            for (int i = array.length - 1; i > 0; i--){
                if (array[i] == array[i - 1] + 1) solution = true;
                else return false;
            }
        }
        return solution;
    }
}
