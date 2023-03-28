package Java_Week_8_Homework;
/**
 *  Write a Java program that takes the user to provide a single character from the   alphabet.
 *  Print Vowel of Consonant, depending on the user input.
 *  If the user input   Is not a letter (between a and z or A and Z),
 *  or is a string of length > 1, print an  error message.
 * For eg:
 *  Input an alphabet: p
 *  Expected Output:
 *  Input letter is Consonant
 */

import java.util.Scanner;


public class Program3_ReturnAlphabet {

    public static void alphabet(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter any Character ");
        String input = in.next().toLowerCase();

        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i")
                || input.equals("o") || input.equals("u");

        if (input.length() > 1) {

        } else if (!(uppercase || lowercase )) {
            System.out.println("Error. Not an alphabet");
        } else if (vowels) {

            System.out.println("Input letter is a Vowel");
        } else {
            System.out.println("Input letter is Consonant");

        }

    }

    public static void main(String[] args) {
        alphabet();

    }


}
