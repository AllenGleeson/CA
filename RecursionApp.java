public class RecursionApp {
    public static void main(String[] args) {
        // Testing positive and negative palindromes
        System.out.println("-------------------------------");
        System.out.println("Is 'LEVEL' a palindrome? " + isPalindrome("LEVEL"));
        System.out.println("Is 'MAMMAM' a palindrome? " + isPalindrome("MAMMAM"));
        System.out.println("Is 'ABCDEFG' a palindrome? " + isPalindrome("ABCDEFG"));
        System.out.println("Is 'RaceCar' a palindrome? " + isPalindrome("RaceCar"));
        System.out.println("Is 'hello' a palindrome? " + isPalindrome("hello"));
        System.out.println("Is '' a palindrome? " + isPalindrome(""));
        System.out.println("Is 'A' a palindrome? " + isPalindrome("A"));
        System.out.println("-------------------------------");
        // Testing reversing strings
        System.out.print("Reverse of 'abcde' is: ");
        reverseString("abcde");
        System.out.println("-------------------------------");
        System.out.print("Reverse of '12345' is: ");
        reverseString("12345");
        System.out.println("-------------------------------");
    }

    // Recursive palindrome method. If the string is one letter then returns true.
    // If more than one it will check the start and end of the string to see if they
    // are the same.
    // If they are the same then it will call the isPalindrome method again with a
    // substring of the original string removing the start and end.
    // Repeats until one letter remaining or ends if the start and end of a string
    // are not the same.
    // Example:
    // isPalindrome("madam") - m == m - isPalindrome("ada")
    // isPalindrome("ada") - a == a - isPalindrome("d")
    // isPalindrome("d") - true (Base case)
    public static boolean isPalindrome(String sString) {
        sString = sString.toLowerCase();
        // Base Case: If string is one letter return true
        // Returns true if just one letter string
        if (sString.length() <= 1) {
            return true;
        } else {
            // Checks if the letters and the start and end of the string are the same.
            // If they are not then return false
            if (sString.charAt(0) != sString.charAt(sString.length() - 1)) {
                return false;
            } else {
                // Gives a substring between the index from the start and index from the end of
                // the initial string
                return isPalindrome(sString.substring(1, sString.length() - 1));
            }
        }
    }

    // Recursive reverse string method. Will call itself and print the last letter
    // of the string until one left.
    // Example:
    // reverseString("abcd")
    // prints: "d"
    // calls reverseString("abc")
    // prints: "c"
    // calls reverseString("ab")
    // prints: "b"
    // calls reverseString("a")
    // prints: "a" (Base case)
    public static void reverseString(String sString) {
        // Base Case: If the string is just one letter, print it
        if (sString.length() == 1) {
            System.out.print(sString);
        } else {
            // Print the last letter
            System.out.print(sString.substring(sString.length() - 1));
            // Call the function again with the string minus the last letter
            reverseString(sString.substring(0, sString.length() - 1));
        }
    }
}