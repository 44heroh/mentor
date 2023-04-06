package com.company.design_patterns.visitors.ast.operations;

import com.company.design_patterns.visitors.ast.actions.*;

public interface Visitor<T> {
    T VisitConstant(AstConstant constant);
    T VisitSum(AstSumm sum);
    T VisitMul(AstMul mul);
//    T VisitDiv(AstDiv div);
    T VisitDiff(AstDiff astDiff);
}
