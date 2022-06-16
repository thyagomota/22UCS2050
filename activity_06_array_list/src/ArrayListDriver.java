/*
 * CS2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 06 - ArrayListDriver
 */

public class ArrayListDriver {

    public static void main(String[] args) {
       ArrayList<Book> array = new ArrayList<>();
       array.add(new Book("A", "Joe"));
       System.out.println(array);
       array.add(new Book("B", "Mary"));
       System.out.println(array);
       array.add(new Book("C", "Jacob"));
       System.out.println(array);
//       array.add("Aline");
//       System.out.println(array);
//       array.add("Max");
//       System.out.println(array);
//       array.add("Clare");
//       System.out.println(array);

       // testing remove
       array.remove(2);
       System.out.println(array);
       array.remove(0);
       System.out.println(array);
    }
}


/*

source = [ 3, 6, 2, 1, 8 ]
current (before) = [2, 9, 0 ]
current (after) = [2, 9, 0, 3, 6, 2, 1, 8 ]

 */
