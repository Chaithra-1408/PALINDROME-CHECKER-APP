public class PalindromeCheckerApp {
    public static void main(String args[]){
        // Hardcoded string to check
        String str = "madam";
        boolean isPalindrome = true;

        // Loop only half of the string
        for (int i = 0; i < str.length() / 2; i++) {
            // Compare characters from start and end
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break; // No need to check further
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}
