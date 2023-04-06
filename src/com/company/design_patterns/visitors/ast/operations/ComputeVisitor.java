package com.company.design_patterns.visitors.ast.operations;

import com.company.design_patterns.visitors.ast.actions.*;

public class ComputeVisitor implements Visitor<Double> {
    @Override
    public Double VisitConstant(AstConstant constant) {
        return constant.getValue();
    }

    @Override
    public Double VisitSum(AstSumm sum) {
        return (Double) sum.left.Accept(this) + (Double) sum.right.Accept(this);
    }

    @Override
    public Double VisitMul(AstMul mul) {
        return (Double) mul.left.Accept(this) * (Double) mul.right.Accept(this);
    }

//    @Override
//    public Double VisitDiv(AstDiv div) {
//        return 0;
//    }

    @Override
    public Double VisitDiff(AstDiff diff) {
        return (Double) diff.left.Accept(this) - (Double) diff.right.Accept(this);
    }
}
