/*
 * CS 2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 15 - Cipher class
 */

public class Cipher {

    private static int[] getOrder(String key) {
        int order[] = new int[key.length()];
        for (int i = 0; i < order.length; i++)
            order[i] = -1;
        for (int i = 0; i < key.length(); i++) {
            int min = 0;
            while (order[min] != -1)
                min++;
            for (int j = min + 1; j < key.length(); j++) {
                if (order[j] != -1)
                    continue;
                if (key.charAt(j) < key.charAt(min))
                    min = j;
            }
            order[min] = i;
        }
        return order;
    }

    private static char[] encode(char in[], String key) {
        int order[] = getOrder(key);
        if (in.length != key.length())
            return null;
        char out[] = new char[key.length()];
        for (int i = 0; i < in.length; i++)
            out[order[i]] = in[i];
        return out;
    }

    private static char[] decode(char in[], String key) {
        int order[] = getOrder(key);
        if (in.length != key.length())
            return null;
        char out[] = new char[key.length()];
        for (int i = 0; i < in.length; i++)
            out[i] = in[order[i]];
        return out;
    }

    static String encode(String in, String key) {
        while (in.length() % key.length() != 0)
            in += " ";
        int nCols = key.length();
        int nRows = in.length() / nCols;
        char matrix[][] = new char[nRows][nCols];
        for (int i = 0; i < in.length(); i++) {
            int col = i % nCols;
            int row = i / nCols;
            matrix[row][col] = in.charAt(i);
        }

        String out = "";
        for (int i = 0; i < nRows; i++)
            out += new String(encode(matrix[i], key));
        return out;
    }

    static String decode(String in, String key) {
        while (in.length() % key.length() != 0)
            in += " ";
        int nCols = key.length();
        int nRows = in.length() / nCols;
        char matrix[][] = new char[nRows][nCols];
        for (int i = 0; i < in.length(); i++) {
            int col = i % nCols;
            int row = i / nCols;
            matrix[row][col] = in.charAt(i);
        }
        String out = "";
        for (int i = 0; i < nRows; i++)
            out += new String(decode(matrix[i], key));
        return out;
    }
}
