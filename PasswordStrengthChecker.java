import java.util.*;

public class PasswordStrengthChecker {

    private static String toLower(String s) {
        return s.toLowerCase(Locale.ROOT);
    }

    private static boolean hasUpperCase(String s) {
        for (char c : s.toCharArray())
            if (Character.isUpperCase(c))
                return true;
        return false;
    }

    private static boolean hasLowerCase(String s) {
        for (char c : s.toCharArray())
            if (Character.isLowerCase(c))
                return true;
        return false;
    }

    private static boolean hasDigit(String s) {
        for (char c : s.toCharArray())
            if (Character.isDigit(c))
                return true;
        return false;
    }

    private static boolean hasSpecial(String s) {
        for (char c : s.toCharArray())
            if (!Character.isLetterOrDigit(c))
                return true;
        return false;
    }

    private static boolean hasRepeatedRun(String s, int runLen) {
        if (s.length() < runLen)
            return false;
        int run = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1))
                run++;
            else
                run = 1;
            if (run >= runLen)
                return true;
        }
        return false;
    }

    private static boolean hasSequentialRun(String s, int runLen) {
        if (s.length() < runLen)
            return false;

        int run = 1;
        for (int i = 1; i < s.length(); i++) {
            char prev = s.charAt(i - 1);
            char cur = s.charAt(i);
            boolean step = (cur == prev + 1) || (cur == prev - 1);
            if (step)
                run++;
            else
                run = 1;
            if (run >= runLen)
                return true;
        }
        return false;
    }

    // The list of common pattersns references from https://en.wikipedia.org/wiki/List_of_the_most_common_passwords
    private static boolean containsCommonPattern(String pwLower) {
        List<String> common = Arrays.asList(
                "123456", "admin", "password", "qwerty", "lovely", "princess", "dragon", "iloveyou", "welcome",
                "monkey", "login", "starwars", "master", "hello", "whatever");
        for (String pattern : common) {
            if (pwLower.contains(pattern))
                return true;
        }
        return false;
    }

    private static int clamp(int x, int low, int high) {
        return Math.max(low, Math.min(high, x));
    }

    public static void main(String[] args) {
        System.out.println("Password Strength Checker");
        System.out.println("Enter a password:");

        Scanner scanner = new Scanner(System.in);
        System.out.print("> ");
        String pw = scanner.nextLine();

        if (pw == null || pw.isEmpty()) {
            System.out.println("\nError: Empty password.");
            scanner.close();
        }

        int length = pw.length();
        boolean upper = hasUpperCase(pw);
        boolean lower = hasLowerCase(pw);
        boolean digit = hasDigit(pw);
        boolean special = hasSpecial(pw);

        String pwLower = toLower(pw);
        boolean commonPat = containsCommonPattern(pwLower);
        boolean repeated = hasRepeatedRun(pw, 3);
        boolean sequential = hasSequentialRun(pw, 4);

        int score = 0;

        if (length < 8)
            score += 5;
        else if (length < 12)
            score += 25;
        else if (length < 16)
            score += 40;
        else
            score += 50;

        int variety = 0;
        if (upper)
            variety++;
        if (lower)
            variety++;
        if (digit)
            variety++;
        if (special)
            variety++;

        score += variety * 10;

        if (variety >= 3 && length >= 12)
            score += 5;

        if (commonPat)
            score -= 25;
        if (repeated)
            score -= 10;
        if (sequential)
            score -= 10;
        if (variety <= 1)
            score -= 15;

        score = clamp(score, 0, 100);

        String rating;
        if (score < 40)
            rating = "Weak";
        else if (score < 70)
            rating = "Medium";
        else
            rating = "Strong";

        System.out.println("\n--- Results ---");
        System.out.println("Length: " + length);
        System.out.println("Has uppercase: " + (upper ? "Yes" : "No"));
        System.out.println("Has lowercase: " + (lower ? "Yes" : "No"));
        System.out.println("Has digits:    " + (digit ? "Yes" : "No"));
        System.out.println("Has special:   " + (special ? "Yes" : "No"));
        System.out.println("Common pattern detected: " + (commonPat ? "Yes" : "No"));
        System.out.println("Repeated characters (e.g., aaa): " + (repeated ? "Yes" : "No"));
        System.out.println("Sequential run (e.g., 1234/abcd): " + (sequential ? "Yes" : "No"));

        System.out.println("\nScore: " + score + " / 100");
        System.out.println("Rating: " + rating);

        System.out.println("\n--- Suggestions ---");
        if (length < 12)
            System.out.println("- Use 12+ characters.");
        if (variety < 3)
            System.out.println("- Mix character types (upper/lower/digits/symbols).");
        if (commonPat)
            System.out.println("- Avoid common words/patterns (e.g., 'admin', 'password').");
        if (repeated)
            System.out.println("- Avoid repeated runs like 'aaa' or '111'.");
        if (sequential)
            System.out.println("- Avoid simple sequences like '1234' or 'abcd'.");
        if (score >= 70)
            System.out.println("- Looks Ok to use");

        scanner.close();
    }
}
