package zen.behaviour.interpreter;

import java.util.HashMap;

/**
 * Created by yepengfan on 8/01/15.
 */
public class VarExpression extends Expression {
    private String key;
    public VarExpression(String _key){
        this.key = _key;
    }

    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
