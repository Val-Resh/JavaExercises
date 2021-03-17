public class usernameValidation {
    /*PROBLEM:
    Have the function CodelandUsernameValidation(str) take the str parameter being passed and determine
    if the string is a valid username according to the following rules:

    1. The username is between 4 and 25 characters.
    2. It must start with a letter.
    3. It can only contain letters, numbers, and the underscore character.
    4. It cannot end with an underscore character.

    If the username is valid then your program should return the string true, otherwise return the string false.
     */


    public static String codelandUsernameValidation(String str) {
        String solution = "";
        String alphabet = "A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z.";
        String specialChars = ("\" !\"#$%&'()*+,-./:;<=>?@[\\]^`{|}~\"");
        char underscore = '_';
        boolean matches = false;
        for (int i = 0; i < specialChars.length(); i++){
            if (str.contains(Character.toString(specialChars.charAt(i)))) matches = true;
        }
        String firstLetter = Character.toString(str.charAt(0));
        if (str.length() >= 4 && str.length() <= 25 && alphabet.contains(firstLetter.toUpperCase()) &&
                str.charAt(str.length() - 1) != underscore && !matches) solution = "true";
        else solution = "false";
        return  solution;
    }
}
