package zen.behaviour.interpreter;

/**
 * Created by yepengfan on 8/01/15.
 */
public abstract class SymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression _left, Expression _right) {
        this.left = _left;
        this.right = _right;
    }
}
