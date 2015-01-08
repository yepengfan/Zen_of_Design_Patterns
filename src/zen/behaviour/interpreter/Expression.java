package zen.behaviour.interpreter;

import java.util.HashMap;

/**
 * Created by yepengfan on 8/01/15.
 */
public abstract class Expression {
    public abstract int interpreter(HashMap<String, Integer> var);
}
