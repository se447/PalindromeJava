/*Create the method palindrome that checks if a string is a palindrome (reads the same forward and backward).*/
import java.util.Scanner;

public class Palindromi {
    
    //method that reverses a string
    public static String reverseString (String text) {
        String reversed = "";
        
        int i = 0;
        
        while (i < text.length()) {
            char c = text.charAt(i);
            reversed = c + reversed;
            i++;
        }
        
        return reversed;
        
        
        /*
        int count = text.length() - 1;
        
        while (count >= 0) {
            reversed += text.charAt(count);
            count--;
        }
        
        return reversed;

        */
    }
    
    public static boolean palindrome(String text) {
        boolean isPalindrome = text.equalsIgnoreCase(reverseString(text));
        
        return isPalindrome;
    }
    
    
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();
        
        
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
