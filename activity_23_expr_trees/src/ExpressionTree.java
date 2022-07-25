/*
 * CS2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 23 - ExpressionTree
 */

public class ExpressionTree {

    private BinNode<Term> root;

    public ExpressionTree(Queue<Term> input) {
        root = addRecursively(input);
    }

    public boolean isEmpty() {
        return root == null;
    }

    // TODO: implement the addRecursively private method
    private BinNode<Term> addRecursively(Queue<Term> input) {

        // TODO: if the input queue is empty, return right away (nothing to do)

        // TODO: consume one term from the input queue (e.g., pop the input queue saving the term reference)

        // TODO: create a new binary node with the term

        // TODO: get current node's term type

        // TODO: if type is operator, make recursive calls to the left and to the right, updating the left and
        //  right references of the newly created node with the returned values


        // TODO: don't forget to return the new node
        return null;
    }

    public String inOrder(final BinNode<Term> current) {
        if (current != null)
            return  inOrder(current.getLeft())  +
                    current.getValue() + " "     +
                    inOrder(current.getRight());
        return "";
    }

    @Override
    public String toString() {
        return inOrder(root);
    }
}