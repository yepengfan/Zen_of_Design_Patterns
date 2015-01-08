package zen.structure.flyweight;

import java.util.HashMap;

/**
 * Created by yepengfan on 8/01/15.
 */
public class SignInfoFactory {
    private static HashMap<String, SignInfo> pool = new HashMap<String, SignInfo>();
    
    @Deprecated
    public static SignInfo getSignInfo() {
        return new SignInfo();
    }

    public static SignInfo getSignInfo(String key) {
        SignInfo result = null;
        if (!pool.containsKey(key)) {
            System.out.println(key + " --- creates object and puts it in the pool.");
            result = new SignInfo4Pool(key);
            pool.put(key, result);
        } else {
            result = pool.get(key);
            System.out.println(key + " --- gets from the pool.");
        }
        return result;
    }
}
