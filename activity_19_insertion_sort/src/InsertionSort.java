/*
 * CS 2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 19 - Insertion Sort
 */

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {

    // TODO: implement the insertion sort algorithm
    public static void insertionSort(int data[]) {
        for (int i = 0; i < data.length - 1; i++)
            for (int j = i + 1; j > 0; j--) {
                if (data[j] < data[j-1]) {
                    int temp = data[j-1];
                    data[j-1] = data[j];
                    data[j] = temp;
                }
                else
                    break;
            }
    }

    public static void main(String[] args) {

        int data[] = {13, 12, 84, 79, 10, 77, 56, 1, 34, 27, 3};
        System.out.println(Arrays.toString(data));
        insertionSort(data);
        System.out.println(Arrays.toString(data));
    }
}
