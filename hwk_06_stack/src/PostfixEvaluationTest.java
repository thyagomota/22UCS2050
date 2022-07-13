/*
 * CS2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Homework 06 - PostfixEvaluationTest
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostfixEvaluationTest {

    @Test
    public void testSimpleAddExpr() {
        String expr = "5 2 +";
        assertEquals(7, PostfixEvaluation.postfixEval(expr));
    }

    @Test
    public void testSimpleSubExpr() {
        String expr = "5 2 -";
        assertEquals(3, PostfixEvaluation.postfixEval(expr));
    }

    @Test
    public void testSimpleMulExpr() {
        String expr = "5 2 *";
        assertEquals(10, PostfixEvaluation.postfixEval(expr));
    }

    @Test
    public void testSimpleDivExpr() {
        String expr = "5 2 /";
        assertEquals(2, PostfixEvaluation.postfixEval(expr));
    }

    @Test
    public void testComplexExprA() {
        String expr = "4 3 + 5 2 - *";
        assertEquals(21, PostfixEvaluation.postfixEval(expr));
    }

    @Test
    public void testComplexExprB() {
        String expr = "13 3 - 5 / 8 * 3 -";
        assertEquals(13, PostfixEvaluation.postfixEval(expr));
    }

    @Test
    public void testComplexExprC() {
        String expr = "4 2 + 3 5 1 - * +";
        assertEquals(18, PostfixEvaluation.postfixEval(expr));
    }
}