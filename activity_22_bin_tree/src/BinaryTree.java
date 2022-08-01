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

    private void addRecursively(BinNode<E> current, final E value) {
        if (value.compareTo(current.getValue()) < 0) {
            if (current.getLeft() == null)
                current.setLeft(new BinNode<>(value));
            else
                addRecursively(current.getLeft(), value);
        }
        else if (value.compareTo(current.getValue()) > 0) {
            if (current.getRight() == null)
                current.setRight(new BinNode<>(value));
            else
                addRecursively(current.getRight(), value);
        }
    }

    // TODOd: implement the add method
    public void add(final E value) {
        if (root == null)
            root = new BinNode<>(value);
        else
            addRecursively(root, value);
    }

    private String preOrder(final BinNode<E> current) {
        if (current != null)
            return current.getValue() + " " +
                    preOrder(current.getLeft()) +
                    preOrder(current.getRight());
        return "";
    }

    private String inOrder(final BinNode<E> current) {
        if (current != null)
            return inOrder(current.getLeft()) +
                    current.getValue() + " " +
                    inOrder(current.getRight());
        return "";
    }

    private String postOrder(final BinNode<E> current) {
        if (current != null)
            return postOrder(current.getLeft()) +
                    postOrder(current.getRight()) +
                    current.getValue() + " ";

        return "";
    }

    private String levelOrder() {
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

    @Override
    public String toString() {
        return postOrder(root);
    }


    private boolean containsRecursively(BinNode<E> current, final E value) {
        if (value.compareTo(current.getValue()) == 0)
            return true;
        else if (value.compareTo(current.getValue()) < 0) {
            if (current.getLeft() == null)
                return false;
            else
                return containsRecursively(current.getLeft(), value);
        }
        else {
            if (current.getRight() == null)
                return false;
            else
                return containsRecursively(current.getRight(), value);
        }
    }

    public boolean contains(E value) {
        if (root == null)
            return false;
        else
            return containsRecursively(root, value);
    }
}
