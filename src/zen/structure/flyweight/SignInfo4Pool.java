package zen.structure.flyweight;

/**
 * Created by yepengfan on 8/01/15.
 */
public class SignInfo4Pool extends SignInfo {
    private String key;

    public SignInfo4Pool(String _key) {
        this.key = _key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
