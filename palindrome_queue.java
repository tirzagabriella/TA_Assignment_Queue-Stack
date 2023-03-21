import java.util.*;
import java.util.Scanner;
public class palindrome_queue {
    public static void main (String[] args){
        System.out.print("Enter String: ");
        Scanner in = new Scanner(System.in);
        String string_input = in.nextLine();
        boolean isPalindrome = true;

        System.out.println("input is: " + string_input);

        Queue<String> queue = new LinkedList<>();

        for(int i = 0; i < string_input.length(); i++){
            queue.add(""+string_input.charAt(i));
        }

        System.out.println("queue is: " + queue);
        String currChar = ""; // to contain char based on index that is turned to string
        String removed = ""; // popped var

        for (int i = string_input.length() -1; i > 0; i--){ // compare removed item from queue (from the front most) with letter from the input starting from the back
            currChar = ""+string_input.charAt(i); // get the char based on index, and turn to string to compare
            removed = ""+queue.remove();
            System.out.println("To be checked : " + removed + " and " + currChar);
            if(!currChar.equals(removed)) { // compare currChar with each stack pop
                System.out.println("The non-similar letter is: " + removed + " and " + currChar);
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
