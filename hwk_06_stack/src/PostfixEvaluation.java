/*
 * CS2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Homework 06 - PostfixEvaluation
 */

public class PostfixEvaluation {

    static final int INVALID_OP = 0;
    static final int ADD_OP     = 1;
    static final int SUB_OP     = 2;
    static final int MUL_OP     = 3;
    static final int DIV_OP     = 4;

    // returns true/false depending whether the given symbol is an operand
    public static boolean isOperand(String symbol) {
        try {
            Integer.parseInt(symbol);
            return true;
        }
        catch (NumberFormatException ex) {
            return false;
        }
    }

    // returns the operand associated with the given symbol; 0 if symbol is not a valid operand
    public static int getOperand(String symbol) {
        if (isOperand(symbol))
            return Integer.parseInt(symbol);
        return 0;
    }

    // returns true/false depending whether the given symbol is an operator
    public static boolean isOperator(String symbol) {
        if (symbol.length() > 1)
            return false;
        char c = symbol.charAt(0);
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    // returns the operator code associated with the given symbol; INVALID_OP if symbol is not a valid operator
    public static int getOperator(String symbol) {
        if (!isOperator(symbol))
            return INVALID_OP;
        char c = symbol.charAt(0);
        if (c == '+')
            return ADD_OP;
        else if (c == '-')
            return SUB_OP;
        else if (c == '*')
            return MUL_OP;
        else
            return DIV_OP;
    }

    // TODO: finish the method's implementation
    public static int postfixEval(String exp) {
        DynamicStack<Integer> stack = new DynamicStack<>();
        String symbols[] = exp.split(" ");
        for (int i = 0; i < symbols.length; i++) {
            String symbol = symbols[i];
            if (isOperator(symbol)) {
                // TODO: finish this part of the code...

            }
            else if (isOperand(symbol)) {
                // TODO: finish this part of the code...
                
            }
            else {
                System.out.println("Invalid symbol \"" + symbol + "\" found!");
                System.exit(1);
            }
        }
        if (stack.size() != 1) {
            System.out.println("Couldn't evaluate expression!");
            System.exit(1);
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String exp = "4 3 + 5 2 - *";
        System.out.println("Result: " + postfixEval(exp));
    }
}
