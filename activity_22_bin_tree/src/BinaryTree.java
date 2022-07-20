/*
 * CS2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 22 - BinaryTree
 */

public class BinaryTree<T extends Comparable<T>> {

    private BinNode<T> root;

    public BinaryTree() {
        root = null;
    }

    // TODO: implement the isEmpty method
    public boolean isEmpty() {
        return false;
    }

    // TODO: implement the addRecursively private method
    private BinNode<T> addRecursively(BinNode<T> current, final T data) {

        // TODO: check if current is null, if that is the case, return a new BinNode with the data


        // TODO: if current is not null...


            // TODO: if given data is smaller than current data, call addRecursively to the left, making sure to use the method's return to set current's left node


            // TODO: if given data is greater than current data, call addRecursively to the right, making sure to use the method's return to set current's right node


            // TODO: don't forget to return current


        return null;
    }

    // TODO: implement the add method
    public void add(final T data) {

    }

    // TODO: override the toString method using a breadth first tree traversal using a queue of binary nodes
    @Override
    public String toString() {
        return "";
    }
}
