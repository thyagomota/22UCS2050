/*
 * CS2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 23 - ExpressionTree
 */

public class ExpressionTree {

    private BinNode<Term> root;

    public ExpressionTree(Queue<Term> input) throws InstantiationException{
        root = addRecursively(input);
        if (!input.isEmpty())
            throw new InstantiationException("Term(s) still remain to be processed!");
    }

    public boolean isEmpty() {
        return root == null;
    }

    // TODO: implement the addRecursively private method
    private BinNode<Term> addRecursively(Queue<Term> input) throws InstantiationException {

        // TODO: if the input queue is empty, return right away (nothing to do)
        if (input.isEmpty())
            return null;

        // TODO: consume one term from the input queue (e.g., pop the input queue saving the term 's reference)
        Term term = input.pop();

        // TODO: create a new binary node with the term
        BinNode<Term> newNode = new BinNode<>(term);

        // TODO: get current node's term type
        int type = term.getType();

        // TODO: if type is operator, make recursive calls to the left and to the right, updating the left and right references of the newly created node with the returned values
        if (type == Term.OPERATOR_TYPE) {
            BinNode<Term> leftNode = addRecursively(input);
            if (leftNode == null)
                throw new InstantiationException("Term expected on the left of " + term);
            newNode.setLeft(leftNode);
            BinNode<Term> rightNode = addRecursively(input);
            if (rightNode == null)
                throw new InstantiationException("Term expected on the right of " + term);
            newNode.setRight(rightNode);
        }

        // TODO: don't forget to return the new node
        return newNode;
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