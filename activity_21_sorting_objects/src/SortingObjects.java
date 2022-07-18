/*
 * CS 2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 21 - SortingObjects
 */

import java.io.*;
import java.util.*;

public class SortingObjects {

    private static final String NAMES_FILENAME = "names.txt";

    // TODO: merge the two given lists returning a new list with the elements sorted
    public static LinkedList<Student> merge(LinkedList<Student> left, LinkedList<Student> right) {
        return null;
    }

    // TODO: implement merge sort using a linked list
    public static LinkedList<Student> mergeSort(LinkedList<Student> students) {

        // TODO: implement the base case


        // TODO: divide the students list into two lists: left and right



        // TODO: recursively call mergeSort w/ left and right linked lists


        // TODO: return the result of merging left and right linked lists
        return null;
    }

    public static void main(String[] args) throws FileNotFoundException {

        LinkedList<Student> students = new LinkedList<>();
        Scanner in = new Scanner(new FileInputStream(NAMES_FILENAME));
        int id = 1;
        while (in.hasNextLine()) {
            String name = in.nextLine();
            Student student = new Student(id, name);
            students.append(student);
            id++;
        }
        in.close();
        System.out.println(students);
        LinkedList<Student> studentsSorted = mergeSort(students);
        System.out.println(studentsSorted);
    }
}

