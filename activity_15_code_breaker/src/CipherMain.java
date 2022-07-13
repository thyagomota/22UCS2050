/*
 * CS 2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 15 - CipherMain class
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CipherMain {

    public static final String ENCRYPTED_TEXT         = "encrypted.txt";
    public static final String COMMON_WORDS           = "common.txt";
    public static final String LETTERS                = "abcdefghijklmnopqrstuvwxyz";
    public static final int    KEY_SIZE               = 6;
    public static final double COMMON_WORDS_THRESHOLD = .3;

    public static void main(String[] args) throws FileNotFoundException {

        // TODOd: read the encrypted text from ENCRYPTED_TEXT file
        String text = "";
        Scanner in = new Scanner(new FileInputStream(ENCRYPTED_TEXT));
        while (in.hasNext()) {
            String line = in.nextLine();
            text += line;
        }
        in.close();
        // System.out.println(text);

        // TODOd: create a list of common words in English with words from COMMON_WORDS file
        LinkedList<String> commonWords = new LinkedList<>();
        in = new Scanner(new FileInputStream(COMMON_WORDS));
        while (in.hasNext()) {
            String word = in.nextLine().trim();
            commonWords.add(word);
        }
        in.close();
        // System.out.println(commonWords);

        // TODOd: initialize a stack with the letters of the alphabet
        Stack<String> stack = new Stack<>();
        for (int i = LETTERS.length() - 1; i >= 0; i--)
            stack.push(LETTERS.charAt(i) + "");

        // TODO: implement the exhaustive search algorithm main loop, maintaining a counter of the number of keys tested
        int keysTested = 0;
        while (!stack.isEmpty()) {

            String key = stack.pop();

            // TODOd: IF size of the String is “n”, print the String
            if (key.length() == KEY_SIZE) {
                keysTested++;
                String decoded = Cipher.decode(text, key);
                String words[] = decoded.split(" ");
                int validWords = 0;
                for (int i = 0; i < words.length; i++)
                    if (words[i].length() > 2 && commonWords.contains(words[i]))
                        validWords++;
                if ((double) validWords / words.length >= COMMON_WORDS_THRESHOLD) {
                    System.out.println("Key is: " + key);
                    System.out.println("Decoded message is: \"" + decoded + "\"");
                    return;
                }
            }
            else if (key.length() < KEY_SIZE)
                for (int i = LETTERS.length() - 1; i >= 0; i--)
                    stack.push(key + LETTERS.charAt(i));
        }
    }
}
