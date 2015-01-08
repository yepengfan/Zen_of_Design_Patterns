package zen.behaviour.interpreter;

import java.util.HashMap;

/**
 * Created by yepengfan on 8/01/15.
 */
public class SubExpression extends SymbolExpression {
    public SubExpression(Expression _left, Expression _right) {
        super(_left, _right);
    }

    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
