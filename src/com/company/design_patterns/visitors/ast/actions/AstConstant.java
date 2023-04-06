package com.company.design_patterns.visitors.ast.actions;

import com.company.design_patterns.visitors.ast.operations.ComputeVisitor;
import com.company.design_patterns.visitors.ast.operations.Visitor;

public class AstConstant implements AstExpression {

    private double value;

    public AstConstant(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public Object Accept(Visitor visitor) {
        return visitor.VisitConstant(this);
    }
}
