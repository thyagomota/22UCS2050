/*
 * CS 2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 17 - BinarySearch
 */

import java.util.*;

public class BinarySearch {

    static boolean bsearch(int data[], int start, int end, int el) {

        // base case #1 (parameter validation)


        // get the middle element

        // is middle the element we are searching for?


        // base case #2


        // is the element greater than middle -> go right then
        

        // if not, go left

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
