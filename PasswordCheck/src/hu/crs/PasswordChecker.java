package hu.crs;

public class PasswordChecker {
    public boolean check(char[] chars) {
        if (chars.length < 6 || chars.length > 16) {
            return false;
        }

        int index = 0;
        while (index < chars.length) {
            if (chars[index] == '$' || chars[index] == '#' || chars[index] == '@') {
                return true;
            }
            index = index + 1; // same as index++;
        }

        return false;
    }
}
