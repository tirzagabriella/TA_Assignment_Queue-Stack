import java.util.*;
import java.util.Scanner;
public class palindrome_stack {
    public static void main (String[] args){
        System.out.print("Enter String : "); // user input
        Scanner in = new Scanner(System.in);
        String string_input = in.nextLine();
        Stack stack = new Stack();
        boolean isPalindrome = true;

        System.out.println("input is: " + string_input);

        for (int i = 0; i < string_input.length(); i++){
            stack.push(string_input.charAt(i)); // push string input into the stack
        }

        System.out.println("Stack: " + stack);

        String currChar = ""; // to contain char based on index that is turned to string
        String popped = ""; // popped var

        for (int i = 0; i < string_input.length(); i++){
            currChar = ""+string_input.charAt(i); // get the char based on index, and turn to string to compare
            popped = ""+stack.pop();
            if(!currChar.equals(popped)) { // compare currChar with each stack pop
                System.out.println("The non-similar letter is: " + currChar + " and " + popped);
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println("THAT IS A PALINDROME");
        } else {
            System.out.println("THAT IS NOT A PALINDROME");
        }

    }
}
