import java.util.Scanner;
public class palindromechecker {



    
    /** checks for the reversal folling the highest digit */
    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    /** Returns true if number is palindrome */
    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);      
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }
        input.close();
    }
}
