/*
 * CS2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 22 - BinaryTree
 */

public class BinaryTree<E extends Comparable<E>> {

    private BinNode<E> root;

    public BinaryTree() {
        root = null;
    }

    // TODOd: implement the isEmpty method
    public boolean isEmpty() {
        return root == null;
    }

    private void addRecursivelyV2(BinNode<E> current, final E value) {
        if (value.compareTo(current.getValue()) < 0) {
            if (current.getLeft() == null)
                current.setLeft(new BinNode<>(value));
            else
                addRecursivelyV2(current.getLeft(), value);
        }
        else if (value.compareTo(current.getValue()) > 0) {
            if (current.getRight() == null)
                current.setRight(new BinNode<>(value));
            else
                addRecursivelyV2(current.getRight(), value);
        }
    }

    // TODOd: implement the addRecursively private method
    private BinNode<E> addRecursively(BinNode<E> current, final E value) {

        // TODOd: check if current is null, if that is the case, return a new BinNode with the data
        if (current == null)
            return new BinNode(value);


        // TODOd: if current is not null...
        else {

            // TODOd: if given value is smaller than current value, call addRecursively to the left, making sure to use the method's return to set current's left node
            if (value.compareTo(current.getValue()) < 0)
                current.setLeft(
                        addRecursively(current.getLeft(), value)
                );

            // TODOd: if given data is greater than current data, call addRecursively to the right, making sure to use the method's return to set current's right node
            else if (value.compareTo(current.getValue()) > 0)
                current.setRight(
                        addRecursively(current.getRight(), value)
                );

            // TODOd: don't forget to return current
            return current;
        }
    }

    // TODOd: implement the add method
    public void add(final E value) {
        if (root == null)
            root = new BinNode<>(value);
        else
            addRecursivelyV2(root, value);
//        root = addRecursively(root, value);
    }

    // TODOd: override the toString method using a breadth first tree traversal using a queue of binary nodes
    @Override
    public String toString() {
        String out = "";
        if (!isEmpty()) {
            Queue<BinNode<E>> queue = new Queue<>();
            queue.push(root);
            while (!queue.isEmpty()) {
                BinNode<E> current = queue.pop();
                out += current + " ";
                if (current.getLeft() != null)
                    queue.push(current.getLeft());
                if (current.getRight() != null)
                    queue.push(current.getRight());
            }
            out = out.trim();
        }
        return out;
    }
}
