package com.company.design_patterns.visitors.ast.actions;

import com.company.design_patterns.visitors.ast.operations.ComputeVisitor;
import com.company.design_patterns.visitors.ast.operations.Visitor;

public class AstDiff implements AstExpression {

    public AstExpression left;
    public AstExpression right;

    public AstDiff(AstExpression left, AstExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Object Accept(Visitor visitor) {
        return visitor.VisitDiff(this);
    }
}
