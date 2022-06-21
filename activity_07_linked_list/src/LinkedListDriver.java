/*
 * CS2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 07 - LinkedListDriver
 */

public class LinkedListDriver {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        System.out.println(ll);
        ll.add(3);
        System.out.println(ll);
        ll.add(5);
        System.out.println(ll);
        ll.add(8);
        System.out.println(ll);
        System.out.println(ll.get(0));
        System.out.println(ll.get(1));
        System.out.println(ll.get(2));
        System.out.println(ll.get(3));

    }
}
