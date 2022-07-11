/*
 * CS 2050 - Computer Science II - Summer 2021
 * Instructor: Thyago Mota
 * Description: Activity 14 - Exhaustive Search
 */

// Goal: to search for all of the combinations of letters with a given size
public class ExhaustiveSearch {

    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    static void search(int n) {

        // TODO: create a stack of String objects
        DynamicStack stack = new DynamicStack();

        // TODO: push all letters of the alphabet onto the stack
        for (int i = ALPHABET.length() - 1; i >= 0; i--)
            stack.push(ALPHABET.charAt(i) + "");

        // TODO: loop until the stack is empty
        while (!stack.isEmpty()) {

            // TODO: pop a String from the stack
            String s = stack.pop();

            // TODO: IF size of the String is “n”, print the String
            if (s.length() == n)
                System.out.println(s);

            // TODO: ELSE, push back all of the combinations of the String with each individual letters of the alphabet
            else {
                for (int i = ALPHABET.length() - 1; i >= 0; i--)
                    stack.push(s + ALPHABET.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        search(3);
    }
}
