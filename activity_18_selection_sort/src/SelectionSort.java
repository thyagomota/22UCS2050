/*
 * CS 2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 18 - Selection Sort
 */

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

    // TODO: implement the selection sort algorithm
    public static void selectionSort(int data[]) {
        for (int i = 0; i < data.length - 1; i++) {
            int min = i;
            for (int j = i+1; j < data.length; j++)
                if (data[j] < data[min])
                    min = j;
            int temp = data[i];
            data[i] = data[min];
            data[min] = temp;
        }
    }

    public static void main(String[] args) {

        int data[] = {13, 12, 84, 79, 10, 77, 56, 1, 34, 27, 3};
        System.out.println(Arrays.toString(data));
        selectionSort(data);
        System.out.println(Arrays.toString(data));
    }
}
