/*
 * CS2050 - Computer Science II - Spring 2022
 * Instructor: Thyago Mota
 * Description: Homework 07 - PatienceSort
 */

import java.util.Arrays;

public class PatienceSort {

    // the patience sort algorithm
    public static void patienceSort(int data[]) {

        // this is the list of stacks (each a stack of integers)
        LinkedList<Stack<Integer>> stacks = new LinkedList<>();

        // TODO #1: loop through the data array and get the array's current element

        // TODO #2: at each iteration, find a stack available and push the array's current element onto it

        // TODO #3: if there isn't a stack available, create a new one, push the data array's current element onto it, and then append the newly created stack to the list of stacks.

        // merge of stacks
        System.out.println(stacks);
        if (stacks.isEmpty())
            return;
        for (int i = 0; i < data.length; i++) {
            Stack<Integer> stackMin = stacks.get(0);
            int j = 0;
            for (int k = 1; k < stacks.size(); k++) {
                Stack<Integer> stackCurrent = stacks.get(k);
                if (stackCurrent.peek() < stackMin.peek()) {
                    stackMin = stackCurrent;
                    j = k;
                }
            }
            data[i] = stackMin.pop();
            if (stackMin.isEmpty())
                stacks.remove(j);
        }
    }

    public static void main(String[] args) {
        int data[] = {13, 12, 84, 79, 10, 77, 56, 1, 34, 27, 3};
        System.out.println(Arrays.toString(data));
        patienceSort(data);
        System.out.println(Arrays.toString(data));
    }
}
