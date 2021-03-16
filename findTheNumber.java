import java.util.List;

public class findTheNumber {
        /*Given an unsorted array of n elements, find if the element k is
         *present in the array or not.
         *The function must return a string "YES" or "NO" denoting if the element
         *is present in array or not.
         *
         * Complete the 'findNumber' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts following parameters:
         *  1. INTEGER_ARRAY arr
         *  2. INTEGER k
         */

        public static String findNumber(List<Integer> arr, int k) {
            // Write your code here
            String result = "";
            if (arr.contains(k)) result = "YES";
            else result = "NO";
            return result;

        }
    }
