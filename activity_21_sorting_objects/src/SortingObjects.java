/*
 * CS 2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 21 - SortingObjects
 */

import java.io.*;
import java.util.Iterator;
import java.util.Scanner;

public class SortingObjects {

    private static final String NAMES_FILENAME = "names.txt";

    // TODO: merge the two given lists returning a new list with the elements sorted
    public static LinkedList<Student> merge(LinkedList<Student> left, LinkedList<Student> right) {
        LinkedList<Student> sorted = new LinkedList<>();
        Iterator<Student> itLeft = left.iterator();
        Student leftStudent = itLeft.next();
        Iterator<Student> itRight = right.iterator();
        Student rightStudent = itRight.next();
        while (leftStudent != null && rightStudent != null) {
            if (leftStudent.compareTo(rightStudent) < 0) {
                sorted.append(leftStudent);
                leftStudent = itLeft.next();
            }
            else {
                sorted.append(rightStudent);
                rightStudent = itRight.next();
            }
        }
        while (leftStudent != null) {
            sorted.append(leftStudent);
            leftStudent = itLeft.next();
        }
        while (rightStudent != null) {
            sorted.append(rightStudent);
            rightStudent = itRight.next();
        }
        return sorted;
    }

    // TODO: implement merge sort using a linked list
    public static LinkedList<Student> mergeSort(LinkedList<Student> students) {

        // TODO: implement the base case
        if (students.size() <= 1)
            return students;

        // TODO: divide the students list into two lists: left and right
        LinkedList<Student> left = new LinkedList<>();
        LinkedList<Student> right = new LinkedList<>();
        int middle = students.size() / 2;
        Iterator<Student> it = students.iterator();
        for (int i = 0; i < middle; i++)
            left.append(it.next());
        while (it.hasNext())
            right.append(it.next());

        // TODO: recursively call mergeSort w/ left and right linked lists
        left = mergeSort(left);
        right = mergeSort(right);

        // TODO: return the result of merging left and right linked lists
        return merge(left, right);
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

