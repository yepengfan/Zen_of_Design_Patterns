package zen.behaviour.interpreter;

import java.util.HashMap;

/**
 * Created by yepengfan on 8/01/15.
 */
public class AddExpression extends SymbolExpression {
    public AddExpression(Expression _left, Expression _right) {
        super(_left, _right);
    }

    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
