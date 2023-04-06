package com.company.design_patterns.visitors.ast.actions;

import com.company.design_patterns.visitors.ast.operations.Visitor;

public interface AstExpression<T> {
    T Accept(Visitor visitor);
}

