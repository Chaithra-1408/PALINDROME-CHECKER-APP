public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String word = "madam";
        String original = word.toLowerCase();
        String reversed = new StringBuilder(original).reverse().toString();
        if (original.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a palindrome.");
        }
    }
}