import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome:");
        String str = input.nextLine();
        boolean isPalindrome = true; // assume the string is a palindrome
        int len = str.length(); // get the length of the string
        for (int i = 0; i < len / 2; i++) {
            // compare the characters from both ends
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                // if they are not equal, the string is not a palindrome
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            // if the loop ends without breaking, the string is a palindrome
            System.out.println(str + " is a palindrome.");
        } else {
            // otherwise, it is not
            System.out.println(str + " is not a palindrome.");
        }
        input.close();
    }
}
