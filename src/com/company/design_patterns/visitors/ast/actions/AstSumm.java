package com.company.design_patterns.visitors.ast.actions;

import com.company.design_patterns.visitors.ast.operations.ComputeVisitor;
import com.company.design_patterns.visitors.ast.operations.Visitor;

public class AstSumm implements AstExpression {

    public AstExpression left;
    public AstExpression right;

    public AstSumm(AstExpression left, AstExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Object Accept(Visitor visitor) {
        return visitor.VisitSum(this);
    }
}
