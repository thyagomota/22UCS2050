/*
 * CS2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 09 - StackDriver
 */

import java.lang.reflect.Array;

public class StackDriver {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack();
        System.out.println(stack);
        stack.push(5);
        stack.push(3);
        stack.push(8);
        System.out.println(stack);
        System.out.println("pop(): " + stack.pop());
        System.out.println(stack);
        stack.push(1);
        stack.push(7);
        stack.push(4);
        System.out.println(stack);
        stack.push(0);
        System.out.println(stack);
    }
}
