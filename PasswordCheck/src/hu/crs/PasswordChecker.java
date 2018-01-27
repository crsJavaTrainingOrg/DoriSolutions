package hu.crs;

public class PasswordChecker {

    public boolean check(char[] chars) {
        if (chars.length < 6 || chars.length > 16) {
            return false;
        }

        int i = 0;
        while (i < chars.length) {
            if (chars[i] == '$' || chars[i] == '#' || chars[i] == '@') {
                return true;
            }
            i = i + 1; // same as index++;
        }

        return false;
    }
}
