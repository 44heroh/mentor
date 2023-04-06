package com.company.design_patterns.visitors.ast.actions;

import com.company.design_patterns.visitors.ast.operations.ComputeVisitor;
import com.company.design_patterns.visitors.ast.operations.Visitor;

public class AstMul implements AstExpression {

    public AstExpression left;
    public AstExpression right;

    public AstMul(AstExpression left, AstExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Object Accept(Visitor visitor) {
        return visitor.VisitMul(this);
    }
}
