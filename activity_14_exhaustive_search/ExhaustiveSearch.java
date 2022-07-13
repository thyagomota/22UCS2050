/*
 * CS 2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 14 - Exhaustive Search
 */

// Goal: to search for all of the combinations of letters with a given size
public class ExhaustiveSearch {

    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    static void search(int n) {

        // TODOd: create a stack/queue of String objects
        Stack<String> stack = new Stack<>();

        // TODOd: push all letters of the alphabet onto the stack/queue
        for (int i = ALPHABET.length() - 1; i >= 0; i--)
            stack.push(ALPHABET.charAt(i) + "");

        // TODOd: loop until the stack/queue is empty
        while (!stack.isEmpty()) {

            // TODOd: pop a String from the stack/queue
            String word = stack.pop();

            // TODOd: IF size of the String is “n”, print the String
            if (word.length() == n)
                System.out.println(word);

            // TODOd: ELSE, push back all of the combinations of the String with each individual letters of the alphabet
            else
                for (int i = ALPHABET.length() - 1; i >= 0; i--)
                    stack.push(word + ALPHABET.charAt(i));

        } // end while

    }

    public static void main(String[] args) {
        search(3);
    }
}
