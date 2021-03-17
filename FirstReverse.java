public class FirstReverse {
    /*PROBLEM:
    Have the function FirstReverse(str) take the str parameter being passed and return the string in reversed order.
    For example: if the input string is "Hello World and Coders"
    then your program should return the string: sredoC dna dlroW olleH
     */

    public static String firstReverse(String str) {
     StringBuilder solution = new StringBuilder();
     for (int i = str.length() - 1; i >= 0; i--){
      solution.append(str.charAt(i));
     }
     return solution.toString();
     }
}
