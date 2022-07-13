/*
 * CS 2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 15 - CipherPlayground class
 */

public class CipherPlayground {

    public static void main(String[] args) {
        String text = "Exhaustive search is fun! I can now be a code breaker!";
        String key = "karate";
        String encoded = Cipher.encode(text, key);
        System.out.println(encoded);
        String decoded = Cipher.decode(encoded, key);
        System.out.println(decoded);
    }
}
