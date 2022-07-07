/*
 * CS2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 10 - BalancedParentheses
 */

import java.util.Scanner;

public class BalancedParentheses {

    // TODO: implement isBalanced using a stack
    public static boolean isBalanced(String exp) {
        Stack<Character> stack = new Stack<>();
        String terms[] = exp.split(" ");
        for (int i = 0; i < terms.length; i++) {
            String term = terms[i];
            if (term.equals("("))
                stack.push('(');
            else if (term.equals(")") && (stack.pop() == null))
                    return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("? ");
        String exp = in.nextLine();
        System.out.print("The parentheses in expression \"" + exp + "\" are ");
        if (isBalanced(exp))
            System.out.println("balanced!");
        else
            System.out.println("not balanced!");
    }
}
