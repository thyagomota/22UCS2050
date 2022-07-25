/*
 * CS2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 23 - Term
 */

public class Term {

    private String label;
    public static final int OPERATOR_TYPE = 0;
    public static final int OPERAND_TYPE  = 1;
    private static final String[] OPERATORS = { "+", "-", "*", "/" };

    public Term(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public int getType() {
        for (int i = 0; i < OPERATORS.length; i++)
            if (OPERATORS[i].equals(label))
                return OPERATOR_TYPE;
        return OPERAND_TYPE;
    }

    @Override
    public String toString() {
        return label;
    }
}
