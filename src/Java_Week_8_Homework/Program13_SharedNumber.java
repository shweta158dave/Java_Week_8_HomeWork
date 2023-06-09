package Java_Week_8_Homework;

/**
 * Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive).
 * If one of the numbers is not within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers,
 * such as 2 in 12 and 23;  otherwise, the method should return false.
 */
import java.util.Scanner;


public class Program13_SharedNumber {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = in.nextInt();
        System.out.print("Enter the second number: ");
        int b = in.nextInt();
        System.out.println("Result: "+ hasSharedDigit(a, b));

    }
    public static boolean hasSharedDigit(int a, int b)
    {
        if (a>=10 || b>=99) {
            return false;
        }
        int num1 = a % 10;
        int num2 = b % 10;
        a /= 10;
        b /= 10;
        return (a == b || a == num1 || num1== b || num1 == num2);
    }

}