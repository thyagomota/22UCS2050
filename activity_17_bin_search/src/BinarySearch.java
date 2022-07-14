/*
 * CS 2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 17 - BinarySearch
 */

import java.util.*;

public class BinarySearch {

    static boolean bsearch(int data[], int start, int end, int el) {

        // base case #1 (parameter validation)
        if (start > end || start < 0 || end < 0 || start >= data.length || end >= data.length)
            return false;

        // get the middle element
        int middle = (start + end) / 2;  // or start + (end - start) / 2

        // is middle the element we are searching for?
        if (data[middle] == el)
            return true;

        // base case #2
        if (start == end)
            return false;

        // is the element greater than middle -> go right then
        if (el > data[middle])
            return bsearch(data, middle + 1, end, el);

        // if not, go left
        return bsearch(data, start, middle - 1, el);
    }

    public static void main(String[] args) {
        int data[] = new int[100];
        Random r = new Random();
        for (int i = 0; i < 100; i++)
            data[i] = r.nextInt(100);
        Arrays.sort(data); // in-place sort available from Arrays class
        System.out.println(Arrays.toString(data));
        if (bsearch(data, 0, data.length - 1, 27))
            System.out.println("Found!");
        else
            System.out.println("Not found!");
    }
}
