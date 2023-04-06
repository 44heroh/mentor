package com.company.design_patterns.visitors.ast.operations;

import com.company.design_patterns.visitors.ast.actions.AstConstant;
import com.company.design_patterns.visitors.ast.actions.AstExpression;
import com.company.design_patterns.visitors.ast.actions.AstSumm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputeVisitorTest {

    @Test
    void ConstantGetValue()
    {
        AstExpression expression = new AstConstant(1);
        assertEquals(true, expression);
    }

    @Test
    public void CanComputeComplexExpr()
    {
        double expected = 13;
        double a = 5;
        double b = 7;
        AstExpression expression =
                new AstSumm(
                        new AstSumm(
                                new AstConstant(a),
                                new AstConstant(1)
                        ),
                        new AstConstant(b));

        double result = (double) expression.Accept(new ComputeVisitor());
        System.out.println(result);
        assertEquals(result, expected);
    }
}