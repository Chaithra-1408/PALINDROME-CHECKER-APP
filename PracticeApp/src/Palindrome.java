public class Palindrome {
    public static void main(String args []){
        // Hardcoded string to check
        String str = "Madam";

        // Convert string to lowercase to make check case-insensitive
        str = str.toLowerCase();

        // Convert string to character array
        char[] chars = str.toCharArray();

        // Two-pointer approach
        int left = 0;
        int right = chars.length - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (chars[left] != chars[right]) {
                isPalindrome = false;
                break; // Stop checking once mismatch is found
            }
            left++;
            right--;
        }

        // Print result
        if (isPalindrome) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }

    }
}
