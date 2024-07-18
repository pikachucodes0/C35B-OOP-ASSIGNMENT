/*Write a program that prompts the user to enter a sentence and reads it into a string. The
program should consist of the following methods:
a method named "countVoweIs" that reads a string and returns the number of vowels in
the string a method named "countConsonants" that reads a string and returns the number of
consonants in the string.
Invoke the above methods and demonstrate them in the program*/
import java.util.Scanner;

public class SecD10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a sentence:");
        String s = sc.nextLine();
        
        int vowelCount = countVowels(s);
        int consonantCount = countConsonants(s);
        
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
    
    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
    
    public static int countConsonants(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c >= 'a' && c <= 'z') && !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                count++;
            }
        }
        return count;
    }
}
