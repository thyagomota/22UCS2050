/*
 * CS2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Prg03 - BinaryTree class
 */

import java.util.Iterator;

public class BinaryTree<E extends Comparable<E>> implements Iterable<E> {

    private BinNode<E> root;

    public BinaryTree() {
        root = null;
    }

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

    public void add(final E value) {
        if (root == null)
            root = new BinNode<>(value);
        else
            addRecursively(root, value);
    }

    private String inOrder(final BinNode<E> current) {
        if (current != null)
            return  inOrder(current.getLeft())  +
                    current.getValue() + "\n"     +
                    inOrder(current.getRight());
        return "";
    }

    @Override
    public String toString() {
        return inOrder(root).trim();
    }

    // TODO #6: implement the clear method
    public void clear() {

    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            Queue<BinNode<E>> queue = init();

            Queue<BinNode<E>> init() {
                Queue<BinNode<E>> queue = new Queue<>();
                queue.push(root);
                return queue;
            }

            @Override
            public boolean hasNext() {
                return !queue.isEmpty();
            }

            @Override
            public E next() {
                BinNode<E> current = queue.pop();
                if (current != null) {
                    if (current.getLeft() != null)
                        queue.push(current.getLeft());
                    if (current.getRight() != null)
                        queue.push(current.getRight());
                    return current.getValue();
                }
                return null;
            }
        };
    }
}
