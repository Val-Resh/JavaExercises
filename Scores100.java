
public class Scores100 {
    /*PROBLEM:
    Given an array of scores, return true if there are scores of 100 next to each other in the array.
    The array length will be at least 2.
    Eg. scores100([1, 100, 100]) → true
        scores100([1, 100, 99, 100]) → false
     */

     public static boolean scores100(int[] scores) {
         boolean solution = false;
         for (int i = 0; i < scores.length; i++){
             if (i == scores.length - 1 && scores[scores.length - 1] == 100) break;
             else if (scores[i] == 100 && scores[i + 1] == 100) {
                 solution = true;
                 break;
             }
            }
         return solution;
         }

