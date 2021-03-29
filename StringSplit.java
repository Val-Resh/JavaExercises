
public class StringSplit {
    /*PROBLEM:
    Complete the solution so that it splits the string into pairs of two characters.
    If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').
    Eg. "abc" => "ab" , "c_"
        "abcdef" => "ab", "cd", "ef"
    */


    public static String[] solution (String s) {
        //insert code here
        if (s.length() % 2 != 0) s += '_';
        String[] solution = new String[s.length() / 2];
        int index = 0;
        for (int i = 0; i < s.length(); i += 2){
            solution[index] = s.substring(i, i+2);
            index++;
        }
        return solution;
    }
}
