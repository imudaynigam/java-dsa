public class PalindromeCheck {

    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false; //not a palindrome
            }
        }
        return true; //palindrome
    }


    public static void main(String[] args) {
        String str1 = "mom";
        String str2 = "hello";

        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
    }
    
}
